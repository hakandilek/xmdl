package org.xmdl.genext.xpath;

import org.xmdl.gen.util.Locator;
import org.xmdl.genext.BaseTemplateTestCase;
import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XProject;

public class ClassBehaviorFunctionTest extends BaseTemplateTestCase {

	private XClass embeddableClass;
	private XClass virtualClass;
	private XClass persistedClass;
	private XPackage pack;
	private XAttribute normalAtribute;
	private XAttribute embedAtribute;

	protected void setUp() throws Exception {
		super.setUp();
		XProject project = ResourceHelper.loadProject("model/test.xmdl");
		embeddableClass = Locator.locateClass(project,
				"xmdl.genext.test/org.xmdl.genext.test/EmbeddableClass");
		virtualClass = Locator.locateClass(project,
				"xmdl.genext.test/org.xmdl.genext.test/VirtualClass");
		persistedClass = Locator.locateClass(project,
				"xmdl.genext.test/org.xmdl.genext.test/PersistedClass");
		pack = Locator.locatePackage(project,
				"xmdl.genext.test/org.xmdl.genext.test");
		normalAtribute = Locator.locateAttribute(project,
				"xmdl.genext.test/org.xmdl.genext.test/Class4/date");
		embedAtribute = Locator.locateAttribute(project,
				"xmdl.genext.test/org.xmdl.genext.test/Class4/embe");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		embeddableClass = null;
		virtualClass = null;
		persistedClass = null;
		pack = null;
		normalAtribute = null;
		embedAtribute = null;
	}

	public void testEvaluate() {
		final String templateClass = ClassBehaviorFunctionTestTemplate.class
				.getName();
		setVariable("embeddableClass", embeddableClass);
		setVariable("virtualClass", virtualClass);
		setVariable("persistedClass", persistedClass);
		setVariable("pack", pack);
		setVariable("normalAttribute", normalAtribute);
		setVariable("embedAttribute", embedAtribute);
		
		String output = runTemplate(templateClass);

		// attribute1:string
		assertNotNull(output);
		String[] pieces = output.split("\\;");
		assertNotNull(pieces);
		assertEquals(14, pieces.length);
		assertEquals("", pieces[0].trim());
		assertEquals("", pieces[1].trim());
		assertEquals("persisted", pieces[2].trim());
		assertEquals("embeded", pieces[3].trim());
		assertEquals("", pieces[4].trim());
		assertEquals("", pieces[5].trim());
		assertEquals("", pieces[6].trim());
		assertEquals("virtual", pieces[7].trim());
		assertEquals("", pieces[8].trim());
		assertEquals("pack", pieces[9].trim());
		assertEquals("", pieces[10].trim());
		assertEquals("", pieces[11].trim());
		assertEquals("", pieces[12].trim());
		assertEquals("embeded", pieces[13].trim());
	}

}
