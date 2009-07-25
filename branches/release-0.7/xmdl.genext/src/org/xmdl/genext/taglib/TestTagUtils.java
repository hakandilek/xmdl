package org.xmdl.genext.taglib;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmdl.gen.util.TestHelper;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XEnumeration;
import org.xmdl.xmdl.XEnumerationLiteral;
import org.xmdl.xmdl.XType;
import org.xmdl.xmdl.XmdlTypes;

/**
 * Utility methods used in the test tag library
 * 
 * @author Hakan Dilek
 */
public class TestTagUtils {

	/**
	 * @param attribute
	 *            the attribute
	 * @return a plain random value that is determined for the given attribute.
	 */
	public static String wrapRandomValue(XAttribute attribute) {
		return wrapRandomValue(attribute, null);
	}
	/**
	 * @param attribute
	 *            the attribute
	 * @param variant
	 *            random value variant
	 * @return a plain random value that is determined for the given attribute.
	 */
	public static String wrapRandomValue(XAttribute attribute, String variant) {
		Object plain = TestHelper.INSTANCE.randomValuePlain(attribute, variant);
		String wrap = wrap(plain, attribute);
		return wrap;
	}

	/**
	 * Wraps the given plain text according to the attribute type
	 * 
	 * @param plain
	 *            plain text
	 * @param attribute
	 *            the attribute
	 * @return text wrapped with type info
	 */
	private static String wrap(Object plain, XAttribute attribute) {
		String result = "" + plain;
		XType type = attribute.getType();
		if (XmdlTypes.JAVA_STRING.equals(type)) {
			result = "\"" + plain + "\"";
		} else if (XmdlTypes.JAVA_DOUBLE.equals(type)) {
			result = "new Double(" + plain + ")";
		} else if (XmdlTypes.JAVA_FLOAT.equals(type)) {
			result = "new Float(" + plain + ")";
		} else if (XmdlTypes.JAVA_INTEGER.equals(type)) {
			result = "new Integer(" + plain + ")";
		} else if (XmdlTypes.JAVA_LONG.equals(type)) {
			result = "new Long(" + plain + "L)";
		} else if (XmdlTypes.JAVA_BOOLEAN.equals(type)) {
			result = "new Boolean(" + plain + ")";
		} else if (XmdlTypes.JAVA_DATE.equals(type)
				|| XmdlTypes.JAVA_DATETIME.equals(type)) {
			long l = 0;
			try {
				l = Long.parseLong(plain + "");
			} catch (NumberFormatException e) {
				// ignore
			}
			// 946681200000L = 1st Jan 2000
			result = "new Date(" + (946681200000L + l) + "L)";
		} else if (type instanceof XEnumeration) {
			XEnumeration enumer = (XEnumeration) type;
			if (plain instanceof XEnumerationLiteral) {
				XEnumerationLiteral lit = (XEnumerationLiteral) plain;
				plain = lit.getName();
			}
			result = enumer.getName() + "." + plain;
		}
		return result;
	}

	/**
	 * @param attribute
	 *            the attribute
	 * @param amount
	 *            trim amount
	 * @return the random value string trimmed with the given amount
	 */
	public static String wrapRandomValueTrimmed(XAttribute attribute, int amount) {
		return wrapRandomValueTrimmed(attribute, null, amount);
	}
	/**
	 * @param attribute
	 *            the attribute
	 * @param variant
	 *            random value variant
	 * @param amount
	 *            trim amount
	 * @return the random value string trimmed with the given amount
	 */
	public static String wrapRandomValueTrimmed(XAttribute attribute, String variant, int amount) {
		String plain = TestHelper.INSTANCE.randomValueAsStringTrimmed(
				attribute, variant, amount);
		String wrap = wrap(plain, attribute);
		return wrap;
	}

	/**
	 * @param attribute
	 *            the attribute
	 * @param format
	 * @return a plain random value that is determined for the given attribute.
	 */
	public static String plainRandomValue(XAttribute attribute, String format) {
		return plainRandomValue(attribute, null, format);
	}

	/**
	 * @param attribute
	 *            the attribute
	 * @param variant
	 *            random value variant
	 * @param format
	 *            format expression
	 * @return a plain random value that is determined for the given attribute.
	 */
	public static String plainRandomValue(XAttribute attribute, String variant, String format) {
		XType type = attribute.getType();
		Object value = TestHelper.INSTANCE.randomValuePlain(attribute, variant);
		String plain = "";
		if (value instanceof XEnumerationLiteral) {
			XEnumerationLiteral lit = (XEnumerationLiteral) value;
			plain = lit.getValue() + "";
		} else if (XmdlTypes.JAVA_DATE.equals(type)
				|| XmdlTypes.JAVA_DATETIME.equals(type)) {

			DateFormat f = null;
			if (format != null) {
				f = new SimpleDateFormat(format);
			} else {
				if (XmdlTypes.JAVA_DATE.equals(type))
					f = new SimpleDateFormat("dd.MM.yyyy");
				else if (XmdlTypes.JAVA_DATETIME.equals(type))
					f = new SimpleDateFormat("dd.MM.yyyy HH:mm");
			}
			long l = 0;
			try {
				l = Long.parseLong(value + "");
			} catch (NumberFormatException e) {
				// ignore
			}
			// 946681200000L = 1st Jan 2000
			Date date = new Date(946681200000L + l);
			return f.format(date);
		} else {
			plain = value + "";
		}
		return plain;
	}

	/**
	 * @param attribute
	 *            the attribute
	 * @param variant
	 *            random value variant
	 * @param amount
	 *            trim amount
	 * @return the random value string trimmed with the given amount
	 */
	public static String plainRandomValueTrimmed(XAttribute attribute,
			String variant, int amount) {
		return TestHelper.INSTANCE.randomValueAsStringTrimmed(attribute,
				variant, amount);
	}

	/**
	 * @param attribute
	 *            the attribute
	 * @param amount
	 *            trim amount
	 * @return the random value string trimmed with the given amount
	 */
	public static String plainRandomValueTrimmed(XAttribute attribute,
			int amount) {
		return plainRandomValueTrimmed(attribute, null, amount);
	}

}
