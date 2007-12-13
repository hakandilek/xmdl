package org.xmdl.genext;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("All Tests for org.xmdl.genext");
        //$JUnit-BEGIN$
        suite.addTest(org.xmdl.genext.taglib.tu.AllTagTests.suite());
        suite.addTest(org.xmdl.genext.taglib.xc.AllTagTests.suite());
        suite.addTest(org.xmdl.genext.taglib.xd.AllTagTests.suite());
        suite.addTest(org.xmdl.genext.xpath.AllXPathTests.suite());
        //$JUnit-END$
        return suite;
    }

}
