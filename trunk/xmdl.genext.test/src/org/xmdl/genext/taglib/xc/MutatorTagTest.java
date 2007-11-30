package org.xmdl.genext.taglib.xc;

import org.osgi.framework.BundleException;
import org.xmdl.genext.BaseTemplateTestCase;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XProject;
import chrome.xmdl.gen.util.Locator;
import chrome.xmdl.xgen.util.ResourceHelper;

public class MutatorTagTest extends BaseTemplateTestCase {

    private XAttribute attribute1;
    private XAttribute attribute2;
    private XAttribute attribute3;

    protected void setUp() throws Exception {
        super.setUp();
        XProject project = ResourceHelper.loadProject("model/test.xmdl");
        attribute1 = Locator.locateAttribute(project,
                "xmdl.test/org.xmdl.genext.test/AnotherClass/attribute1");
        attribute2 = Locator.locateAttribute(project,
                "xmdl.test/org.xmdl.genext.test/AnotherClass/attribute2");
        attribute3 = Locator.locateAttribute(project,
                "xmdl.test/org.xmdl.genext.test/AnotherClass/attribute3");
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        attribute1 = null;
        attribute2 = null;
        attribute3 = null;
    }

    public void testMutators() throws BundleException {

        final String templateClass = MutatorTagTestTemplate.class.getName();
        setVariable("attribute1", attribute1);
        setVariable("attribute2", attribute2);
        setVariable("attribute3", attribute3);
        String output = runTemplate(templateClass);

        assertNotNull(output);
        String[] pieces = output.split("\\;");
        assertNotNull(pieces);
        assertEquals(3, pieces.length);
        assertEquals(":setAttribute1", pieces[0].trim());
        assertEquals(":setAttribute2", pieces[1].trim());
        assertEquals(":setAttribute3", pieces[2].trim());
    }

}
