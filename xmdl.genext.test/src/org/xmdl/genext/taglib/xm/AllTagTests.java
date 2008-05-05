package org.xmdl.genext.taglib.xm;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTagTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for org.xmdl.genext.taglib.xm");
        //$JUnit-BEGIN$
        suite.addTestSuite(IsChildTagTest.class);
        //$JUnit-END$
        return suite;
    }

}
