package org.xmdl.wdl.gen.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xmdl.wdl.Attribute;
import org.xmdl.wdl.EnumLiteral;
import org.xmdl.wdl.Type;

public class TestUtils {

	public static final TestUtils INSTANCE = new TestUtils();

	public static final String TEST_PRESERVE_PATH = "/model/testValues.properties";

	private Map<Attribute, Map<String, Object>> randomValues = new HashMap<Attribute, Map<String, Object>>();

	private RandomUtils utils = RandomUtils.INST;

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
		if (value instanceof EnumLiteral) {
			EnumLiteral lit = (EnumLiteral) value;
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

	public Object randomValue(Attribute attrib, String variant) {
		Object preserved = getPreservedValue(attrib, variant);
		if (preserved != null)
			return preserved;

		Type type = attrib.getType();
		int length = IDAExtensionUtils.columnSize(attrib);
		Object result = null;
		
		BasicType basicType = ExtensionUtils.basicType(type);
		switch (basicType) {
		case BOOLEAN:
			result = utils.randomBoolean();
			break;

		case DOUBLE:
		case FLOAT:
			result = utils.randomDouble(Math.pow(10, length));
			break;

		case INTEGER:
			result = utils.randomInt((int) Math.pow(10, length));
			break;

		case LONG:
			result = utils.randomLong();
			break;

		case STRING:
			result = utils.randomString(length);
			break;

		case DATE:
			// 347068800000L = 10 years in msecs
			result = utils.randomLong(347068800000L);
			break;

		default:
			if (type instanceof org.xmdl.wdl.Enum) {
				org.xmdl.wdl.Enum enumer = (org.xmdl.wdl.Enum) type;
				List<EnumLiteral> literals = enumer.getLiterals();
				EnumLiteral literal = (EnumLiteral) utils
						.randomObject(literals);
				result = literal;
			}
			break;
		}

		if (result != null) {
			preserveValue(attrib, variant, result);
		}
		return result;
	}

	private void preserveValue(Attribute attrib, String variant, Object value) {
		// TODO: implement
	}

	private Object getPreservedValue(Attribute attrib, String variant) {
		// TODO: implement
		return null;
	}

}
