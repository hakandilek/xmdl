package org.xmdl.genext.taglib.xc;

import org.osgi.framework.BundleException;
import org.xmdl.genext.BaseTemplateTestCase;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XProject;
import chrome.xmdl.gen.util.Locator;
import chrome.xmdl.xgen.util.ResourceHelper;

public class AttributeTypeTagWrappedTest extends BaseTemplateTestCase {

    private XAttribute attribute1;
    private XAttribute attribute2;
    private XAttribute attribute3;
    private XAttribute attribute4;
    private XAttribute attribute5;
    private XAttribute attribute6;
    private XAttribute attribute7;
    private XAttribute attribute8;
    private XAttribute attribute9;
    private XAttribute attribute10;

    protected void setUp() throws Exception {
        super.setUp();
        XProject project = ResourceHelper.loadProject("model/test.xmdl");
        attribute1 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute1");
        attribute2 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute2");
        attribute3 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute3");
        attribute4 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute4");
        attribute5 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute5");
        attribute6 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute6");
        attribute7 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute7");
        attribute8 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute8");
        attribute9 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute9");
        attribute10 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute10");
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        attribute1 = null;
        attribute2 = null;
        attribute3 = null;
        attribute4 = null;
        attribute5 = null;
        attribute6 = null;
        attribute7 = null;
        attribute8 = null;
        attribute9 = null;
        attribute10 = null;
    }

    public void testAttributeTypeTag() throws BundleException {

        final String templateClass = AttributeTypeTagWrappedTestTemplate.class
                .getName();
        setVariable("attribute1", attribute1);
        setVariable("attribute2", attribute2);
        setVariable("attribute3", attribute3);
        setVariable("attribute4", attribute4);
        setVariable("attribute5", attribute5);
        setVariable("attribute6", attribute6);
        setVariable("attribute7", attribute7);
        setVariable("attribute8", attribute8);
        setVariable("attribute9", attribute9);
        setVariable("attribute10", attribute10);
        String output = runTemplate(templateClass);

        assertNotNull(output);
        String[] pieces = output.split("\\;");
        assertNotNull(pieces);
        assertEquals(11, pieces.length);
        assertEquals(":String", pieces[0].trim());
        assertEquals(":Long", pieces[1].trim());
        assertEquals(":Long", pieces[2].trim());
        assertEquals(":Integer", pieces[3].trim());
        assertEquals(":Integer", pieces[4].trim());
        assertEquals(":Double", pieces[5].trim());
        assertEquals(":Double", pieces[6].trim());
        assertEquals(":Boolean", pieces[7].trim());
        assertEquals(":Boolean", pieces[8].trim());
        assertEquals(":Enumeration1", pieces[9].trim());
    }

}
