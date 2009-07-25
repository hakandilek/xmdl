package org.xmdl.xmdldb.init;

import java.io.IOException;

import org.xmdl.meta.MetaModelHolder;
import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xmdl.XProject;

import junit.framework.TestCase;

public abstract class AbstractTestCase extends TestCase {
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

		MetaModelHolder.initialize(project);
	}
}
