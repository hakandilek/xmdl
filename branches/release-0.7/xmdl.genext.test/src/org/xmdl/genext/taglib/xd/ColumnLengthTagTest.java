package org.xmdl.genext.taglib.xd;

import org.osgi.framework.BundleException;
import org.xmdl.gen.util.Locator;
import org.xmdl.genext.BaseTemplateTestCase;
import org.xmdl.meta.MetaModelHolder;
import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XProject;


public class ColumnLengthTagTest extends BaseTemplateTestCase {

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

    public void testColumntLengthTag() throws BundleException {

        final String templateClass = ColumnLengthTagTestTemplate.class.getName();
        setVariable("attribute", attribute);
        String output = runTemplate(templateClass);

        assertNotNull(output);
        assertEquals(":15;", output.trim());
    }

}
