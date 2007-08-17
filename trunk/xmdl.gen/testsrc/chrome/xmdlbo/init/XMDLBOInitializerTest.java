package chrome.xmdlbo.init;

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
		List<BPackage> packages = bModel.getBPackages();
		assertNotNull(packages);
		assertEquals(1, packages.size());
	}

	public void testBPackage(){
		EObject object = ResourceHelper.loadResource(path);
		BModel gModel = (BModel) object;
		List<BPackage> packages = gModel.getBPackages();
		BPackage bPackage = packages.get(0);
		
		assertNotNull(bPackage);
		assertEquals("chrome.xmdl.demo", bPackage.getName());
		List<BService> services = bPackage.getServices();
		assertNotNull(services);
		assertEquals(2, services.size());
	}

	public void testBService(){
		EObject object = ResourceHelper.loadResource(path);
		BModel bModel = (BModel) object;
		List<BPackage> packages = bModel.getBPackages();
		BPackage bPackage =  packages.get(0);
		List<BService> services = bPackage.getServices();
		BService service =  services.get(0);

		assertNotNull(service);

		XClass cls = service.getXClass();
		assertNotNull(cls);
		assertEquals("Customer", cls.getName());
		
		assertEquals("CustomerService", service.getName());
		List<BMethod> methods = service.getMethods();
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
