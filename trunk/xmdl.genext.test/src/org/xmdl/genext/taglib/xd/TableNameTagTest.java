package org.xmdl.genext.taglib.xd;

import org.osgi.framework.BundleException;
import org.xmdl.genext.BaseTemplateTestCase;

import chrome.xmdl.XClass;
import chrome.xmdl.XProject;
import chrome.xmdl.gen.util.Locator;
import chrome.xmdl.meta.MetaModelHolder;
import chrome.xmdl.xgen.util.ResourceHelper;

public class TableNameTagTest extends BaseTemplateTestCase {

    private XClass clazz;
	private XProject project;

    protected void setUp() throws Exception {
        super.setUp();
        project = ResourceHelper.loadProject("model/test.xmdl");
        clazz = Locator.locateClass(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class1");
        MetaModelHolder.initialize(project);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        clazz = null;
    }

    public void testAttributeTypeTag() throws BundleException {

        final String templateClass = TableNameTagTestTemplate.class.getName();
        setVariable("class", clazz);
        String output = runTemplate(templateClass);
        
        assertNotNull(output);
        assertEquals(":TBL_CLASS1;", output.trim());
    }



}
