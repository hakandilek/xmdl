package chrome.xmdlbo.init;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import chrome.xmdl.XClass;
import chrome.xmdl.xgen.util.ResourceHelper;
import chrome.xmdlbo.BMethod;
import chrome.xmdlbo.BModel;
import chrome.xmdlbo.BPackage;
import chrome.xmdlbo.BService;

public class XMDLBOInitializerTest extends AbstractTestCase {

	final String path = "testsrc/test.xmdlbo";

	public XMDLBOInitializerTest() {
		super();
	}

	public void testBModel(){
		EObject object = ResourceHelper.loadResource(path);
		assertTrue(object instanceof BModel);
		
		BModel bModel = (BModel) object;
		assertNotNull(bModel);
		
		assertEquals("xmdl.xmp", bModel.getName());
		List packages = bModel.getBPackages();
		assertNotNull(packages);
		assertEquals(1, packages.size());
	}

	public void testBPackage(){
		EObject object = ResourceHelper.loadResource(path);
		BModel gModel = (BModel) object;
		List packages = gModel.getBPackages();
		BPackage bPackage = (BPackage) packages.get(0);
		
		assertNotNull(bPackage);
		assertEquals("chrome.xmdl.demo", bPackage.getName());
		List bClasses = bPackage.getServices();
		assertNotNull(bClasses);
		assertEquals(2, bClasses.size());
	}

	public void testBService(){
		EObject object = ResourceHelper.loadResource(path);
		BModel bModel = (BModel) object;
		List packages = bModel.getBPackages();
		BPackage bPackage = (BPackage) packages.get(0);
		List gClasses = bPackage.getServices();
		BService service = (BService) gClasses.get(0);

		assertNotNull(service);

		XClass cls = service.getXClass();
		assertNotNull(cls);
		assertEquals("Customer", cls.getName());
		
		assertEquals("CustomerService", service.getName());
		List methods = service.getMethods();
		assertNotNull(methods);
		assertEquals(0, methods.size());
	}

//	public void testBMethod(){
//		EObject object = ResourceHelper.loadResource(path);
//		BModel bModel = (BModel) object;
//		List packages = bModel.getBPackages();
//		BPackage bPackage = (BPackage) packages.get(0);
//		List services = bPackage.getServices();
//		BService service = (BService) services.get(0);
//		List methods = service.getMethods();
//		
//		BMethod edit = null;
//		BMethod delete = null;
//		BMethod save = null;
//		BMethod search = null;
//		for (Iterator it = methods.iterator(); it.hasNext();) {
//			BMethod method = (BMethod) it.next();
//			String name = method.getName();
//			if ("edit".equals(name)) edit = method;
//			if ("delete".equals(name)) delete = method;
//			if ("save".equals(name)) save = method;
//			if ("search".equals(name)) search = method;
//		}
//				
//		assertNotNull(edit);
//		assertNotNull(delete);
//		assertNotNull(save);
//		assertNotNull(search);
//
//	}
}
