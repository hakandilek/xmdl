package org.xmdl.genext.taglib.tu;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTagTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for org.xmdl.genext.taglib.tu");
        //$JUnit-BEGIN$
        suite.addTestSuite(RandomWrapTagTest.class);
        suite.addTestSuite(RandomPlainTagTest.class);
        //$JUnit-END$
        return suite;
    }

}
