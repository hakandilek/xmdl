package org.xmdl.genext.taglib.xm;

import org.osgi.framework.BundleException;
import org.xmdl.gen.util.Locator;
import org.xmdl.genext.BaseTemplateTestCase;
import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XProject;

public class MasterAttributeNameTagTest extends BaseTemplateTestCase {

	private XClass masterClass;
	private XClass childClass;
	private XAttribute masterAttribute;
	private XAttribute childAttribute;

	protected void setUp() throws Exception {
		super.setUp();
		XProject project = ResourceHelper.loadProject("model/test.xmdl");
		masterClass = Locator.locateClass(project,
				"xmdl.genext.test/org.xmdl.genext.test/MasterClass");
		childClass = Locator.locateClass(project,
				"xmdl.genext.test/org.xmdl.genext.test/ChildClass");
		masterAttribute = Locator.locateAttribute(project,
				"xmdl.genext.test/org.xmdl.genext.test/ChildClass/master");
		childAttribute = Locator.locateAttribute(project,
				"xmdl.genext.test/org.xmdl.genext.test/MasterClass/children");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		masterClass = null;
		masterAttribute = null;
		childClass = null;
		childAttribute = null;
	}

	public void testWithClass() throws BundleException {

		final String templateClass = MasterAttributeNameTagTestTemplate.class.getName();
		setVariable("master", masterClass);
		setVariable("child", childClass);
		String output = runTemplate(templateClass);

		assertNotNull(output);
		String[] pieces = output.split("\\;");
		assertNotNull(pieces);
		assertEquals(2, pieces.length);
		assertEquals(":", pieces[0].trim());
		assertEquals(":master", pieces[1].trim());
	}

	public void testWithAttribute() throws BundleException {

		final String templateClass = MasterAttributeNameTagTestTemplate.class.getName();
		setVariable("master", masterAttribute);
		setVariable("child", childAttribute);
		String output = runTemplate(templateClass);

		assertNotNull(output);
		String[] pieces = output.split("\\;");
		assertNotNull(pieces);
		assertEquals(2, pieces.length);
		assertEquals(":", pieces[0].trim());
		assertEquals(":", pieces[1].trim());
	}

}
