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

	private Map<XAttribute, Object> randomValues = new HashMap<XAttribute, Object>();

	private RandomUtils utils = RandomUtils.INST;

	protected TestHelper() {
		super();
	}

	public String randomValueStringTrimmed(XAttribute attrib, int trimLength) {
		XType type = attrib.getType();
		String s = randomValuePlain(attrib);
		String substring = s;

		if (XmdlTypes.JAVA_STRING.equals(type)) {
			// trim just strings
			int len = s.length();
			if (trimLength > len)
				return "";
			substring = s.substring(0, len - trimLength);
		}

		return substring;
	}

	public String randomValueString(XAttribute attrib) {
		String plain = randomValuePlain(attrib);
		return plain;
	}

	public String randomValuePlain(XAttribute attrib) {
		Object random = randomValues.get(attrib);
		if (random == null) {
			random = randomValue(attrib);
			randomValues.put(attrib, random);
		}
		return "" + random;
	}

	public Object randomValue(XAttribute attrib) {
		Object preserved = getPreservedValue(attrib);
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
			result = literal.getName();
		}

		if (result != null) {
			preserveValue(attrib, result);
		}
		return result;
	}

	private void preserveValue(XAttribute attrib, Object value) {
		IFile file = getPreserveFile(attrib);
		if (file == null)
			return;

		Properties properties = new Properties();
		try {
			InputStream contents = file.getContents();
			properties.load(contents);
		} catch (Exception e) {
			//ignore errors if file does not exist
		}
		
		try {
			String key = getPropertyKey(attrib);
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

	private Object getPreservedValue(XAttribute attrib) {
		IFile file = getPreserveFile(attrib);
		if (file == null)
			return null;

		try {
			InputStream contents = file.getContents();
			Properties properties = new Properties();
			properties.load(contents);
			String key = getPropertyKey(attrib);
			Object value = properties.get(key);
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

	private String getPropertyKey(XAttribute attrib) {
		String name = XMDLClassHelper.qualifiedName(attrib);
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
