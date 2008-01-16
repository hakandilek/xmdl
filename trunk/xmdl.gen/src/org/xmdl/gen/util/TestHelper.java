package org.xmdl.gen.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XEnumeration;
import org.xmdl.xmdl.XEnumerationLiteral;
import org.xmdl.xmdl.XType;
import org.xmdl.xmdl.XmdlTypes;


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
			return utils.randomDouble(Math.pow(10, length));
		}
		if (XmdlTypes.JAVA_FLOAT.equals(type)) {
			return utils.randomDouble(Math.pow(10, length));
		}
		if (XmdlTypes.INT.equals(type)) {
			return utils.randomInt((int) Math.pow(10, length));
		}
		if (XmdlTypes.JAVA_INTEGER.equals(type)) {
			return utils.randomInt((int) Math.pow(10, length));
		}
		if (XmdlTypes.LONG.equals(type)) {
			return utils.randomLong();
		}
		if (XmdlTypes.JAVA_LONG.equals(type)) {
            return utils.randomLong();
        }
		if (XmdlTypes.JAVA_STRING.equals(type)) {
			return utils.randomString(length);
		}
        if (XmdlTypes.JAVA_DATE.equals(type)
                || XmdlTypes.JAVA_DATETIME.equals(type)) {
            //347068800000L = 10 years in msecs
            return utils.randomLong(347068800000L);
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
