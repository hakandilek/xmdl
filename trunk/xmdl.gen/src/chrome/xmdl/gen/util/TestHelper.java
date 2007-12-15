package chrome.xmdl.gen.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XEnumeration;
import chrome.xmdl.XEnumerationLiteral;
import chrome.xmdl.XType;
import chrome.xmdl.XmdlTypes;

public class TestHelper {

	public static final TestHelper INSTANCE = new TestHelper();

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
			//trim just strings
			int len = s.length();
			if (trimLength > len) return "";
			substring = s.substring(0, len-trimLength);
		}
		
		String valueString = valueString(attrib, substring);
		return valueString;
	}
	
	public String randomValueString(XAttribute attrib) {
		String plain = randomValuePlain(attrib);
		String valueString = valueString(attrib, plain);
		return valueString;
	}
	
	protected String valueString(XAttribute attrib, String plainValue){
		XType type = attrib.getType();
		if (XmdlTypes.JAVA_STRING.equals(type)) {
			return "\"" + plainValue + "\"";
		}
		if (type instanceof XEnumeration) {
			XEnumeration en = (XEnumeration) type;
			return en.getName() + "." + plainValue;
		}
		return plainValue;		
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
		XType type = attrib.getType();
		int length = attrib.getLength();
		if (XmdlTypes.BOOLEAN.equals(type)
				|| XmdlTypes.JAVA_BOOLEAN.equals(type)) {
			return utils.randomBoolean();
		}
		if (XmdlTypes.DOUBLE.equals(type) || XmdlTypes.FLOAT.equals(type)) {
			return utils.randomDouble(Math.pow(10, length));
		}
		if (XmdlTypes.JAVA_DOUBLE.equals(type)) {
			return "new Long(" + utils.randomDouble(Math.pow(10, length)) + ")";
		}
		if (XmdlTypes.JAVA_FLOAT.equals(type)) {
			return "new Long(" + utils.randomDouble(Math.pow(10, length)) + ")";
		}
		if (XmdlTypes.INT.equals(type)) {
			return utils.randomInt((int) Math.pow(10, length));
		}
		if (XmdlTypes.JAVA_INTEGER.equals(type)) {
			return "new Integer(" + utils.randomInt((int) Math.pow(10, length))
					+ ")";
		}
		if (XmdlTypes.LONG.equals(type)) {
			return utils.randomInt((int) Math.pow(10, length)) + "L";
		}
		if (XmdlTypes.JAVA_LONG.equals(type)) {
			return "new Long(" + utils.randomInt((int) Math.pow(10, length))
					+ "L)";
		}
		if (XmdlTypes.JAVA_STRING.equals(type)) {
			return utils.randomString(length);
		}
		if (type instanceof XEnumeration) {
			XEnumeration enumer = (XEnumeration) type;
			List<XEnumerationLiteral> literals = enumer.getLiterals();
			XEnumerationLiteral literal = (XEnumerationLiteral) utils
					.randomObject(literals);
			return literal.getName();
		}
		return null;
	}

}
