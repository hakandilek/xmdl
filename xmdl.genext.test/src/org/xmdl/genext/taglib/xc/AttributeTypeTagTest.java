package org.xmdl.genext.taglib.xc;

import org.osgi.framework.BundleException;
import org.xmdl.genext.BaseTemplateTestCase;

import chrome.xmdl.XClass;
import chrome.xmdl.XProject;
import chrome.xmdl.gen.util.Locator;
import chrome.xmdl.xgen.util.ResourceHelper;

public class AttributeTypeTagTest extends BaseTemplateTestCase {

    private XClass clazz;

    protected void setUp() throws Exception {
        super.setUp();
        XProject project = ResourceHelper.loadProject("model/test.xmdl");
        clazz = Locator.locateClass(project,
                "xmdl.test/org.xmdl.genext.test/Class1");
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        clazz = null;
    }

    public void testAttributeTypeTag() throws BundleException {

        final String templateClass = "org.xmdl.genext.taglib.xc.AttributeTypeTagTestTemplate";
        setVariable("xClass", clazz);
        String output = runTemplate(templateClass);
        
        assertNotNull(output);
        assertEquals(":String;", output.trim());
    }



}
