package chrome.xmdl.util;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.util.ResourceHelper;

import junit.framework.TestCase;

public class ResourceHelperTest extends TestCase {
	final String path = "testsrc/test.xmdl";
	final String path2 = "testsrc/test2.xmdl";
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		URI uri = URI.createURI(path2);
		String fileName = uri.toFileString();
		File file = new File(fileName);
		file.delete();
	}

	public void testLoadProject(){
		XProject prj1 = ResourceHelper.loadProject(path);
		assertNotNull(prj1);
		assertTrue(prj1 instanceof XProject);
		
		URI uri = URI.createURI(path);
		XProject prj2 = ResourceHelper.loadProject(uri);
		assertNotNull(prj2);
		assertTrue(prj2 instanceof XProject);
		
	}
	
	public void testLoadResource(){
		EObject obj1 = ResourceHelper.loadResource(path);
		assertNotNull(obj1);
		
		URI uri = URI.createURI(path);
		EObject obj2 = ResourceHelper.loadResource(uri);
		assertNotNull(obj2);
	}
	
	public void testSaveResource() throws IOException {
		XProject prj1 = ResourceHelper.loadProject(path);
				
		//Check Resource contents after save
		Resource resource = ResourceHelper.saveResource(path2, prj1);
		Object object = resource.getContents().get(0);
		assertNotNull(object);		
		assertTrue(object instanceof XProject);		
		XProject prj2 = (XProject) object;		
		assertEquals(prj1, prj2);
		
		//Check for saved file
		URI uri = URI.createURI(path2);
		String fileName = uri.toFileString();
		File file = new File(fileName);
		assertTrue(file.exists());		
	}
	
	
}
