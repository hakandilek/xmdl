package org.xmdl.wdl.gen.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.EList;
import org.xmdl.wdl.Attribute;
import org.xmdl.wdl.Enumeration;
import org.xmdl.wdl.EnumerationLiteral;
import org.xmdl.wdl.Type;

public abstract class TestUtils {
	
	private Log logger = LogFactory.getLog(this.getClass());

	public static final String TEST_PRESERVE_PATH = "/model/testValues.properties";

	private Map<Attribute, Map<String, Object>> randomValues = new HashMap<Attribute, Map<String, Object>>();

	private File preserveFile;

	protected TestUtils() {
		super();
	}

	public String randomValueAsStringTrimmed(Attribute attrib, int trimLength) {
		return randomValueAsStringTrimmed(attrib, null, trimLength);
	}

	public String randomValueAsStringTrimmed(Attribute attrib, String variant,
			int trimLength) {
		String s = randomValueAsString(attrib, variant);
		String substring = s;

		if (ExtensionUtils.isString(attrib)) {
			// trim just strings
			int len = s.length();
			if (trimLength > len)
				return "";
			substring = s.substring(0, trimLength);
		}

		return substring;
	}

	public String randomValueAsString(Attribute attrib) {
		return randomValueAsString(attrib, null);
	}

	public String randomValueAsString(Attribute attrib, String variant) {
		String plain = "";
		Object value = randomValuePlain(attrib, variant);
		if (value instanceof EnumerationLiteral) {
			EnumerationLiteral lit = (EnumerationLiteral) value;
			plain = lit.getName();
		} else {
			plain = value + "";
		}

		return plain;
	}

	public Object randomValuePlain(Attribute attrib, String variant) {
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

	public Object randomValuePlain(Attribute attrib) {
		return randomValuePlain(attrib, null);
	}

	public Object randomValue(Attribute attrib) {
		return randomValue(attrib, null);
	}

	public abstract Object randomValue(Attribute attrib, String variant);

	protected void preserveValue(Attribute attrib, String variant, Object value) {
		File file = getPreserveFile(attrib);
		if (file == null)
			return;
		
		if (value instanceof EnumerationLiteral) {
			EnumerationLiteral lit = (EnumerationLiteral) value;
			value = lit.getOrdinal();
		}

		Properties properties = new Properties();
		try {
			Reader fr = new FileReader(file);
			properties.load(fr);
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
			FileUtils.writeFile(content, file);
		} catch (IOException e) {
			logger.error("Error writing properties:" + file, e);
		}
	}

	private File getPreserveFile(Attribute attrib) {
		if (preserveFile == null) {
			preserveFile = new File("randomValues.properties");
		}
		return preserveFile;
	}
	
	private String getPropertyKey(Attribute attrib, String variant) {
		String name = ExtensionUtils.qualifiedName(attrib);
		if (variant != null)
			name += "." + variant;
		return name;
	}

	protected Object getPreservedValue(Attribute attrib, String variant) {
		File file = getPreserveFile(attrib);
		if (file == null)
			return null;

		try {
			Properties properties = FileUtils.loadProperties(file);
			String key = getPropertyKey(attrib, variant);
			Object value = properties.get(key);
			
			//special conversion for enumeration literals value -> literal
			Type type = attrib.getType();
			if (type instanceof Enumeration) {
				Integer i = null;
				try {
					i = Integer.parseInt(value+"");
				} catch (NumberFormatException e) {
					return value;
				}
				Enumeration enumer = (Enumeration) type;
				EList<EnumerationLiteral> lits = enumer.getLiterals();
				for (EnumerationLiteral lit : lits) {
					if (i == lit.getOrdinal()) {
						value = lit;
						break;
					}
				}
			}
			return value;
		} catch (IOException e) {
			logger.debug("Error reading properties:" + file +". This is probably the first run.", e);
		}

		return null;
	}

}
