package org.xmdl.meta;

import org.xmdl.meta.MetaModelHolder;
import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdldb.DModel;

import junit.framework.TestCase;

public class MetaModelHolderTest extends TestCase {

    private XProject project;

    protected void setUp() throws Exception {
        super.setUp();
        project = ResourceHelper.loadProject("platform:/resource/xmdl.genext.test/model/test.xmdl");
        MetaModelHolder.initialize(project);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testInitialize() {
        DModel model = ResourceHelper.loadDModel("platform:/resource/xmdl.genext.test/model/test.xmdldb");
        XProject project2 = model.getXProject();
        assertNotNull(project2);
        assertEquals(project.getName(), project2.getName());
    }
}
