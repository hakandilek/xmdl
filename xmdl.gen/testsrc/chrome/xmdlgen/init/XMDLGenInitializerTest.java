package chrome.xmdlgen.init;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import chrome.xmdl.xgen.util.ResourceHelper;
import chrome.xmdlgen.GAttribute;
import chrome.xmdlgen.GClass;
import chrome.xmdlgen.GModel;
import chrome.xmdlgen.GPackage;

public class XMDLGenInitializerTest extends AbstractTestCase {

	final String path = "testsrc/test.xmdlgen";

	public XMDLGenInitializerTest() {
		super();
	}

	public void testGModel(){
		EObject object = ResourceHelper.loadResource(path);
		assertTrue(object instanceof GModel);
		
		GModel gModel = (GModel) object;
		assertNotNull(gModel);
		
		assertEquals("xmdl.xmp", gModel.getName());
		EList packages = gModel.getGPackages();
		assertNotNull(packages);
		assertEquals(1, packages.size());
	}

	public void testGPackage(){
		EObject object = ResourceHelper.loadResource(path);
		GModel gModel = (GModel) object;
		EList packages = gModel.getGPackages();
		GPackage gPackage = (GPackage) packages.get(0);
		
		assertNotNull(gPackage);
		assertEquals("chrome.xmdl.demo", gPackage.getName());
		EList gClasses = gPackage.getGClasses();
		assertNotNull(gClasses);
		assertEquals(2, gClasses.size());
	}

	public void testGClass(){
		EObject object = ResourceHelper.loadResource(path);
		GModel gModel = (GModel) object;
		EList packages = gModel.getGPackages();
		GPackage gPackage = (GPackage) packages.get(0);
		EList gClasses = gPackage.getGClasses();
		GClass gClass = (GClass) gClasses.get(0);

		assertNotNull(gClass);
		assertEquals("Customer", gClass.getName());
		assertEquals(true, gClass.isPersistent());
		EList gAttributes = gClass.getGAttributes();
		assertNotNull(gAttributes);
		assertEquals(2, gAttributes.size());
	}

	public void testGAttribute(){
		EObject object = ResourceHelper.loadResource(path);
		GModel gModel = (GModel) object;
		EList packages = gModel.getGPackages();
		GPackage gPackage = (GPackage) packages.get(0);
		EList gClasses = gPackage.getGClasses();
		GClass gClass = (GClass) gClasses.get(0);
		EList gAttributes = gClass.getGAttributes();
		GAttribute gAttribute = (GAttribute) gAttributes.get(0);
		

		assertNotNull(gAttribute);
		assertEquals("name", gAttribute.getName());
		assertEquals(true, gAttribute.isPersistent());
	}
}
