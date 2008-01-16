package org.xmdl.xmdlgen.init;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xmdlgen.GAttribute;
import org.xmdl.xmdlgen.GClass;
import org.xmdl.xmdlgen.GModel;
import org.xmdl.xmdlgen.GPackage;


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
		List<GPackage> packages = gModel.getGPackages();
		assertNotNull(packages);
		assertEquals(1, packages.size());
	}

	public void testGPackage(){
		EObject object = ResourceHelper.loadResource(path);
		GModel gModel = (GModel) object;
		List<GPackage> packages = gModel.getGPackages();
		GPackage gPackage = packages.get(0);
		
		assertNotNull(gPackage);
		assertEquals("org.xmdl.demo", gPackage.getName());
		List<GClass> gClasses = gPackage.getGClasses();
		assertNotNull(gClasses);
		assertEquals(2, gClasses.size());
	}

	public void testGClass(){
		EObject object = ResourceHelper.loadResource(path);
		GModel gModel = (GModel) object;
		List<GPackage> packages = gModel.getGPackages();
		GPackage gPackage = packages.get(0);
		List<GClass> gClasses = gPackage.getGClasses();
		GClass gClass = gClasses.get(0);

		assertNotNull(gClass);
		assertEquals("Customer", gClass.getName());
		assertEquals(true, gClass.isPersistent());
		List<GAttribute> gAttributes = gClass.getGAttributes();
		assertNotNull(gAttributes);
		assertEquals(2, gAttributes.size());
	}

	public void testGAttribute(){
		EObject object = ResourceHelper.loadResource(path);
		GModel gModel = (GModel) object;
		List<GPackage> packages = gModel.getGPackages();
		GPackage gPackage = packages.get(0);
		List<GClass> gClasses = gPackage.getGClasses();
		GClass gClass = gClasses.get(0);
		List<GAttribute> gAttributes = gClass.getGAttributes();
		GAttribute gAttribute = (GAttribute) gAttributes.get(0);
		

		assertNotNull(gAttribute);
		assertEquals("name", gAttribute.getName());
		assertEquals(true, gAttribute.isPersistent());
	}
}
