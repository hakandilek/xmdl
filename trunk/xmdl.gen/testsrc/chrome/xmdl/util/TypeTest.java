package chrome.xmdl.util;

import junit.framework.TestCase;
import chrome.xmdl.XAttribute;
import chrome.xmdl.XProject;
import chrome.xmdl.XType;
import chrome.xmdl.gen.util.Locator;
import chrome.xmdl.xgen.util.ResourceHelper;

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
