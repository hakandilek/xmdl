package org.xmdl.util;

import org.xmdl.gen.util.Locator;
import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdl.XType;

import junit.framework.TestCase;

public class TypeTest extends TestCase {

	private XAttribute attribute;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		XProject project = ResourceHelper.loadProject("testsrc/test-type.xmdl");
		attribute = Locator.locateAttribute(project,
				"xmdl.xmp/org.xmdl.test/Class1/attribute1");
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		attribute = null;
	}

	public void testType() {
		XType type = attribute.getType();
		assertNotNull(type);
		String name = type.getName();
		assertNotNull(name);
		assertTrue(name.indexOf("String") >= 0);

	}
}
