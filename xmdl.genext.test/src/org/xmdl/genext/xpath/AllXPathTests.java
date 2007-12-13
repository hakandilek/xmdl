package org.xmdl.genext.xpath;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllXPathTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for org.xmdl.genext.xpath");
        //$JUnit-BEGIN$
        suite.addTestSuite(MethodCallFunctionTest.class);
        //$JUnit-END$
        return suite;
    }

}
