package chrome.xmdl.xgen;

import java.io.IOException;

import junit.framework.TestCase;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.util.ResourceHelper;
import chrome.xmdldb.init.AbstractTestCase;

public class GeneratorTest extends TestCase {
	protected XProject project;
	
	
	protected void setUp() throws Exception {
		initialize();
	}

	protected void initialize() throws IOException {
		project = ResourceHelper.loadProject("testsrc/test.xmdl");
		Generator generator = new Generator(project);

		generator.initialize();
	}
	
	public void testInitialize() throws IOException {
		assertNotNull(project);
	}

	
}
