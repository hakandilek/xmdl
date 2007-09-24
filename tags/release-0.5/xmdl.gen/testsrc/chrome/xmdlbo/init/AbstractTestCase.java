package chrome.xmdlbo.init;

import java.io.IOException;

import junit.framework.TestCase;
import chrome.xmdl.XProject;
import chrome.xmdl.xgen.Generator;
import chrome.xmdl.xgen.util.ResourceHelper;

public abstract class AbstractTestCase extends TestCase {
	private Generator generator;
	protected XProject project;
	
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		initialize();
	}

	protected void initialize() throws IOException {
		project = ResourceHelper.loadProject("testsrc/test.xmdl");
		generator = new Generator(project);

		generator.initialize();
	}
}
