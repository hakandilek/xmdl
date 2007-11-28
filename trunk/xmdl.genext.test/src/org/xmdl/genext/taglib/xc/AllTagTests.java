package org.xmdl.genext.taglib.xc;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTagTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for org.xmdl.genext.taglib.xc");
        //$JUnit-BEGIN$
        suite.addTestSuite(AttributeTypeTagTest.class);
        suite.addTestSuite(UncapitalizeTagTest.class);
        suite.addTestSuite(CapitalizeTagTest.class);
        //$JUnit-END$
        return suite;
    }

}