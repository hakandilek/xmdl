package org.xmdl.genext.taglib;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.xmdl.gen.util.TestHelper;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XEnumeration;
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
        String plain = TestHelper.INSTANCE.randomValuePlain(attribute);
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
    private static String wrap(String plain, XAttribute attribute) {
        XType type = attribute.getType();
        if (XmdlTypes.JAVA_STRING.equals(type)) {
            return "\"" + plain + "\"";
        }
        if (XmdlTypes.JAVA_DOUBLE.equals(type)) {
            return "new Double(" + plain + ")";
        }
        if (XmdlTypes.JAVA_FLOAT.equals(type)) {
            return "new Float(" + plain + ")";
        }
        if (XmdlTypes.JAVA_INTEGER.equals(type)) {
            return "new Integer(" + plain + ")";
        }
        if (XmdlTypes.JAVA_LONG.equals(type)) {
            return "new Long(" + plain + "L)";
        }
        if (XmdlTypes.JAVA_DATE.equals(type)
                || XmdlTypes.JAVA_DATETIME.equals(type)) {
            long l = 0;
            try {
                l = Long.parseLong(plain);
            } catch (NumberFormatException e) {
                // ignore
            }
            // 946681200000L = 1st Jan 2000
            return "new Date(" + (946681200000L + l) + "L)";
        }
        if (type instanceof XEnumeration) {
            XEnumeration enumer = (XEnumeration) type;
            return enumer.getName() + "." + plain;
        }
        return plain;
    }

    /**
     * @param attribute
     *            the attribute
     * @param amount
     *            trim amount
     * @return the random value string trimmed with the given amount
     */
    public static String wrapRandomValueTrimmed(XAttribute attribute, int amount) {
        String plain = TestHelper.INSTANCE.randomValueStringTrimmed(attribute,
                amount);
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
        XType type = attribute.getType();
        String plain = TestHelper.INSTANCE.randomValuePlain(attribute);
        if (XmdlTypes.JAVA_DATE.equals(type)
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
                l = Long.parseLong(plain);
            } catch (NumberFormatException e) {
                // ignore
            }
            // 946681200000L = 1st Jan 2000
            Date date = new Date(946681200000L + l);
            return f.format(date);
        }
        return plain;
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
        return TestHelper.INSTANCE.randomValueStringTrimmed(attribute, amount);
    }

    public static void main(String[] args) {
        Calendar c = new GregorianCalendar(2000, 0, 1);
        long time = c.getTime().getTime();
        System.out.println(time);

        Date date = new Date(time);
        DateFormat f = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(date);
        System.out.println(f.format(date));

    }
}
