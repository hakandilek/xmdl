package org.xmdl.genext.taglib.xd;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTagTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for org.xmdl.genext.taglib.xd");
        //$JUnit-BEGIN$
        suite.addTestSuite(TableNameTagTest.class);
        suite.addTestSuite(ColumnNameTagTest.class);
        //$JUnit-END$
        return suite;
    }

}
