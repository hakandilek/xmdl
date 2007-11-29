package org.xmdl.genext.taglib.xc;

import org.osgi.framework.BundleException;
import org.xmdl.genext.BaseTemplateTestCase;

import chrome.xmdl.XClass;
import chrome.xmdl.XEnumeration;
import chrome.xmdl.XPackage;
import chrome.xmdl.XProject;
import chrome.xmdl.gen.util.Locator;
import chrome.xmdl.xgen.util.ResourceHelper;

public class QualifiedNameTagTest extends BaseTemplateTestCase {

    private XPackage pack;
    private XClass clazz;
    private XEnumeration enumeration;

    protected void setUp() throws Exception {
        super.setUp();
        XProject project = ResourceHelper.loadProject("model/test.xmdl");
        clazz = Locator.locateClass(project,
                "xmdl.test/org.xmdl.genext.test/Class1");
        pack = Locator.locatePackage(project,
                "xmdl.test/org.xmdl.genext.test");
        enumeration = Locator.locateEnumeration(project,
                "xmdl.test/org.xmdl.genext.test/Enumeration1");
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        clazz = null;
        pack = null;
        enumeration = null;
    }

    public void testClassName() throws BundleException {

        final String templateClass = QualifiedNameTagTestTemplateCls.class.getName();
        setVariable("class", clazz);
        String output = runTemplate(templateClass);

        assertNotNull(output);
        assertEquals(":org.xmdl.genext.test.Class1;", output.trim());
    }

    public void testPackageOfClass() throws BundleException {

        final String templateClass = QualifiedNameTagTestTemplateClsPkg.class.getName();
        setVariable("class", clazz);
        String output = runTemplate(templateClass);

        assertNotNull(output);
        assertEquals(":org.xmdl.genext.test;", output.trim());
    }

    public void testPackageName() throws BundleException {

        final String templateClass = QualifiedNameTagTestTemplatePkg.class.getName();
        setVariable("package", pack);
        String output = runTemplate(templateClass);

        assertNotNull(output);
        assertEquals(":org.xmdl.genext.test;", output.trim());
    }

    public void testEnumerationName() throws BundleException {

        final String templateClass = QualifiedNameTagTestTemplateEnm.class.getName();
        setVariable("enumeration", enumeration);
        String output = runTemplate(templateClass);

        assertNotNull(output);
        assertEquals(":org.xmdl.genext.test.Enumeration1;", output.trim());
    }

}
