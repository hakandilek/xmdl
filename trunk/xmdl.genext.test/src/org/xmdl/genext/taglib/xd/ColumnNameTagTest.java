package org.xmdl.genext.taglib.xd;

import org.osgi.framework.BundleException;
import org.xmdl.genext.BaseTemplateTestCase;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XProject;
import chrome.xmdl.gen.util.Locator;
import chrome.xmdl.meta.MetaModelHolder;
import chrome.xmdl.xgen.util.ResourceHelper;

public class ColumnNameTagTest extends BaseTemplateTestCase {

    private XAttribute attribute;
    private XProject project;

    protected void setUp() throws Exception {
        super.setUp();
        project = ResourceHelper.loadProject("model/test.xmdl");
        attribute = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class1/attribute1");
        MetaModelHolder.initialize(project);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        attribute = null;
    }

    public void testColumnNameTag() throws BundleException {

        final String templateClass = ColumnNameTagTestTemplate.class.getName();
        setVariable("attribute", attribute);
        String output = runTemplate(templateClass);

        assertNotNull(output);
        assertEquals(":F_ATTRIBUTE1;", output.trim());
    }

}
