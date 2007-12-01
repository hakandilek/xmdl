package org.xmdl.genext.taglib;

import chrome.xmdl.XAttribute;
import chrome.xmdl.gen.util.TestHelper;

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
    public static String randomValuePlain(XAttribute attribute) {
        return TestHelper.INSTANCE.randomValuePlain(attribute);
    }

    /**
     * @param attribute
     *            the attribute
     * @param amount
     *            trim amount
     * @return the random value string trimmed with the given amount
     */
    public static String randomValueTrimmed(XAttribute attribute, int amount) {
        return TestHelper.INSTANCE.randomValueStringTrimmed(attribute, amount);
    }

    /**
     * @param attribute
     *            the attribute
     * @param amount
     *            trim amount
     * @return a string "quotation" wrapped random value that is determined for
     *         the given attribute.
     */
    public static String randomValueString(XAttribute attribute) {
        return TestHelper.INSTANCE.randomValueString(attribute);
    }

}
