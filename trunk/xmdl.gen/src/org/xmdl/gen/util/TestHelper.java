package org.xmdl.gen.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.xmdl.xgen.util.IFileUtils;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XEnumeration;
import org.xmdl.xmdl.XEnumerationLiteral;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdl.XType;
import org.xmdl.xmdl.XmdlTypes;

public class TestHelper {
	private static final Logger LOGGER = Logger.getLogger(TestHelper.class);

	public static final TestHelper INSTANCE = new TestHelper();

	public static final String TEST_PRESERVE_PATH = "/model/testValues.properties";

	private Map<XAttribute, Map<String, Object>> randomValues = new HashMap<XAttribute, Map<String, Object>>();

	private RandomUtils utils = RandomUtils.INST;

	protected TestHelper() {
		super();
	}

	public String randomValueAsStringTrimmed(XAttribute attrib, int trimLength) {
		return randomValueAsStringTrimmed(attrib, null, trimLength);
	}
	
	public String randomValueAsStringTrimmed(XAttribute attrib, String variant, int trimLength) {
		XType type = attrib.getType();
		String s = randomValueAsString(attrib, variant);
		String substring = s;

		if (XmdlTypes.JAVA_STRING.equals(type)) {
			// trim just strings
			int len = s.length();
			if (trimLength > len)
				return "";
			substring = s.substring(0, trimLength);
		}

		return substring;
	}

	public String randomValueAsString(XAttribute attrib) {
		return randomValueAsString(attrib, null);
	}
	
	public String randomValueAsString(XAttribute attrib, String variant) {
		String plain = "";
		Object value = randomValuePlain(attrib, variant);
		if (value instanceof XEnumerationLiteral) {
			XEnumerationLiteral lit = (XEnumerationLiteral) value;
			plain = lit.getName();
		} else {
			plain = value + "";
		}
		
		return plain;
	}

	public Object randomValuePlain(XAttribute attrib, String variant) {
		Map<String, Object> map = randomValues.get(attrib);
		if (map == null) {
			map = new HashMap<String, Object>();
			randomValues.put(attrib, map);
		}
		Object random = map.get(variant);
		if (random == null) {
			random = randomValue(attrib, variant);
			map.put(variant, random);
		}
		return random;
	}

	public Object randomValuePlain(XAttribute attrib) {
		return randomValuePlain(attrib, null);
	}

	public Object randomValue(XAttribute attrib) {
		return randomValue(attrib, null);
	}
	
	public Object randomValue(XAttribute attrib, String variant) {
		Object preserved = getPreservedValue(attrib, variant);
		if (preserved != null)
			return preserved;

		XType type = attrib.getType();
		int length = attrib.getLength();
		Object result = null;
		if (XmdlTypes.BOOLEAN.equals(type)
				|| XmdlTypes.JAVA_BOOLEAN.equals(type)) {
			result = utils.randomBoolean();
		} else if (XmdlTypes.DOUBLE.equals(type)
				|| XmdlTypes.FLOAT.equals(type)) {
			result = utils.randomDouble(Math.pow(10, length));
		} else if (XmdlTypes.JAVA_DOUBLE.equals(type)) {
			result = utils.randomDouble(Math.pow(10, length));
		} else if (XmdlTypes.JAVA_FLOAT.equals(type)) {
			result = utils.randomDouble(Math.pow(10, length));
		} else if (XmdlTypes.INT.equals(type)) {
			result = utils.randomInt((int) Math.pow(10, length));
		} else if (XmdlTypes.JAVA_INTEGER.equals(type)) {
			result = utils.randomInt((int) Math.pow(10, length));
		} else if (XmdlTypes.LONG.equals(type)) {
			result = utils.randomLong();
		} else if (XmdlTypes.JAVA_LONG.equals(type)) {
			result = utils.randomLong();
		} else if (XmdlTypes.JAVA_STRING.equals(type)) {
			result = utils.randomString(length);
		} else if (XmdlTypes.JAVA_DATE.equals(type)
				|| XmdlTypes.JAVA_DATETIME.equals(type)) {
			// 347068800000L = 10 years in msecs
			result = utils.randomLong(347068800000L);
		} else if (type instanceof XEnumeration) {
			XEnumeration enumer = (XEnumeration) type;
			List<XEnumerationLiteral> literals = enumer.getLiterals();
			XEnumerationLiteral literal = (XEnumerationLiteral) utils
					.randomObject(literals);
			result = literal;
		}

		if (result != null) {
			preserveValue(attrib, variant, result);
		}
		return result;
	}

	private void preserveValue(XAttribute attrib, String variant, Object value) {
		IFile file = getPreserveFile(attrib);
		if (file == null)
			return;
		
		if (value instanceof XEnumerationLiteral) {
			XEnumerationLiteral lit = (XEnumerationLiteral) value;
			value = lit.getValue();
		}

		Properties properties = new Properties();
		try {
			InputStream contents = file.getContents();
			properties.load(contents);
		} catch (Exception e) {
			//ignore errors if file does not exist
		}
		
		try {
			String key = getPropertyKey(attrib, variant);
			properties.put(key, value+"");
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			Writer w = new OutputStreamWriter(out);
			properties.store(w, "");
			byte[] bytes = out.toByteArray();
			InputStream content = new ByteArrayInputStream(bytes);
			IFileUtils.INST.writeFile(content, file);
		} catch (CoreException e) {
			LOGGER.error("Error writing values", e);
		} catch (IOException e) {
			LOGGER.error("Error writing properties:" + file, e);
		}
	}

	private Object getPreservedValue(XAttribute attrib, String variant) {
		IFile file = getPreserveFile(attrib);
		if (file == null)
			return null;

		try {
			InputStream contents = file.getContents();
			Properties properties = new Properties();
			properties.load(contents);
			String key = getPropertyKey(attrib, variant);
			Object value = properties.get(key);
			
			//special conversion for enumeration literals value -> literal
			XType type = attrib.getType();
			if (type instanceof XEnumeration) {
				Integer i = null;
				try {
					i = Integer.parseInt(value+"");
				} catch (NumberFormatException e) {
					return value;
				}
				XEnumeration enumer = (XEnumeration) type;
				EList<XEnumerationLiteral> lits = enumer.getLiterals();
				for (XEnumerationLiteral lit : lits) {
					if (i == lit.getValue()) {
						value = lit;
						break;
					}
				}
			}
			return value;
		} catch (CoreException e) {
			LOGGER.error("Error reading values", e);
		} catch (IOException e) {
			LOGGER.error("Error reading properties:" + file, e);
		}

		return null;
	}

	private IFile getPreserveFile(XAttribute attrib) {
		XProject project = getProject(attrib);
		if (project != null) {
			String projectName = project.getName();
			String projectPath = "/" + projectName + "/";
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			String filename = projectPath + TEST_PRESERVE_PATH;
			IFile file = root.getFile(new Path(filename));
			return file;
		}
		return null;
	}

	private String getPropertyKey(XAttribute attrib, String variant) {
		String name = XMDLClassHelper.qualifiedName(attrib);
		if (variant != null)
			name += "." + variant;
		return name;
	}

	private XProject getProject(XAttribute attrib) {
		XClass class1 = attrib.getXClass();
		if (class1 != null) {
			XPackage package1 = class1.getXPackage();
			if (package1 != null) {
				return package1.getProject();
			}
		}
		return null;
	}

}
