package org.xmdl.genext.taglib.xc;

import org.osgi.framework.BundleException;
import org.xmdl.gen.util.Locator;
import org.xmdl.genext.BaseTemplateTestCase;
import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XProject;

public class ImportVirtualTagTest extends BaseTemplateTestCase {

	private XProject project;
	private XPackage pack;
	private XClass clazz;
	private XClass virtualClass;

	protected void setUp() throws Exception {
		super.setUp();
		project = ResourceHelper.loadProject("model/test.xmdl");
		clazz = Locator.locateClass(project,
				"xmdl.genext.test/org.xmdl.genext.test/Class1");
		virtualClass = Locator.locateClass(project,
				"xmdl.genext.test/org.xmdl.genext.test/VirtualClass");
		pack = Locator.locatePackage(project,
				"xmdl.genext.test/org.xmdl.genext.test");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		project = null;
		clazz = null;
		virtualClass = null;
		pack = null;
	}

	public void testWithClass() throws BundleException {

		final String templateClass = ImportVirtualTagTestTemplateCls.class
				.getName();
		setVariable("class", clazz);
		setVariable("virtualClass", virtualClass);
		String output = runTemplate(templateClass);
		assertNotNull(output);
		String[] pieces = output.split("\\;");

		assertNotNull(pieces);
		assertEquals(4, pieces.length);

		assertEquals("import org.xmdl.genext.test.VirtualClass", pieces[0]
				.trim());
		assertEquals("", pieces[1].trim());
		assertEquals("", pieces[2].trim());
		assertEquals("", pieces[3].trim());
	}

	public void testWithPackage() throws BundleException {

		final String templateClass = ImportVirtualTagTestTemplatePkg.class
				.getName();
		setVariable("package", pack);
		String output = runTemplate(templateClass);
		assertNotNull(output);

		assertEquals("import org.xmdl.genext.test.VirtualClass;", output.trim());
	}

	public void testWithProject() throws BundleException {

		final String templateClass = ImportVirtualTagTestTemplatePrj.class
				.getName();
		setVariable("project", project);
		String output = runTemplate(templateClass);
		assertNotNull(output);
		assertEquals("import org.xmdl.genext.test.VirtualClass;", output.trim());
	}

}
