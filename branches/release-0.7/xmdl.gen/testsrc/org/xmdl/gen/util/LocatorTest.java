package org.xmdl.gen.util;

import org.xmdl.gen.util.Locator;
import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XProject;

import junit.framework.TestCase;

public class LocatorTest extends TestCase {

    private XProject project;

    protected void setUp() throws Exception {
        super.setUp();
        project = ResourceHelper.loadProject("testsrc/test-type.xmdl");

    }

    protected void tearDown() throws Exception {
        super.tearDown();
        project = null;
    }

    public void testLocateAttribute() {
        try {
            XAttribute a = Locator.locateAttribute(project, "xmdl.xmp/org.xmdl.test/Class1/attribute1");

            assertNotNull(a);
            assertEquals("attribute1", a.getName());
            
            assertNotNull(a.getXClass());
            assertEquals("Class1", a.getXClass().getName());
            
        } catch (Exception e) {
            fail("exception occured:" + e);
            e.printStackTrace();
        }
    }

    public void testLocateClass() {
        try {
            XClass a = Locator.locateClass(project, "xmdl.xmp/org.xmdl.test/Class1");

            assertNotNull(a);
            assertEquals("Class1", a.getName());
            
            assertNotNull(a.getXPackage());
            assertEquals("org.xmdl.test", a.getXPackage().getName());
            
        } catch (Exception e) {
            fail("exception occured:" + e);
            e.printStackTrace();
        }
    }

}
