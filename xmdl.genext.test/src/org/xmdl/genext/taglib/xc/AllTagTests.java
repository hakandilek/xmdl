package org.xmdl.genext.taglib.xc;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTagTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for org.xmdl.genext.taglib.xc");
        //$JUnit-BEGIN$
        suite.addTestSuite(AttributeTypeTagTest.class);
        suite.addTestSuite(AttributeTypeTagWrappedTest.class);
        suite.addTestSuite(UncapitalizeTagTest.class);
        suite.addTestSuite(CapitalizeTagTest.class);
        suite.addTestSuite(QualifiedNameTagTest.class);
        suite.addTestSuite(QualifiedPathTagTest.class);
        suite.addTestSuite(AccessorTagTest.class);
        suite.addTestSuite(MutatorTagTest.class);
        suite.addTestSuite(DefaultValueTagTest.class);
        suite.addTestSuite(ImportTagTest.class);
        suite.addTestSuite(ImportVirtualTagTest.class);
        suite.addTestSuite(IterateAttributesTagTest.class);
        //$JUnit-END$
        return suite;
    }

}
