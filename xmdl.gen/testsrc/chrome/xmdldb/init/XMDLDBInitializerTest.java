package chrome.xmdldb.init;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import chrome.xmdl.xgen.util.ResourceHelper;
import chrome.xmdldb.DModel;
import chrome.xmdldb.DPackage;
import chrome.xmdldb.DTable;

public class XMDLDBInitializerTest extends AbstractTestCase {
	final String path = "testsrc/test.xmdldb";
 
	public void testDModel(){
		EObject object = ResourceHelper.loadResource(path);
		assertTrue(object instanceof DModel);
		
		DModel dModel = (DModel) object;
		assertNotNull(dModel);
		
		assertEquals("xmdl.xmp", dModel.getName());
		List<DPackage> packages = dModel.getDPackages();
		assertNotNull(packages);
		assertEquals(1, packages.size());
	}
	
	public void testDPackage(){
		EObject object = ResourceHelper.loadResource(path);
		DModel gModel = (DModel) object;
		List<DPackage> packages = gModel.getDPackages();
		DPackage gPackage = packages.get(0);
		
		assertNotNull(gPackage);
		assertEquals("chrome.xmdl.demo", gPackage.getName());
		List<DTable> dTables = gPackage.getDTables();
		assertNotNull(dTables);
		assertEquals(3, dTables.size());
	}
	
	@SuppressWarnings("unchecked")
	public void testDTable() throws IOException {
		EObject object = ResourceHelper.loadResource(path);
		DModel gModel = (DModel) object;
		List<DPackage> packages = gModel.getDPackages();
		DPackage pack = packages.get(0);
		
		DTable customerTable = null;
		DTable locationTable = null;
		List<DTable> tables = pack.getDTables();
		for (DTable table : tables) {
			String name = table.getName();
			if ("TBL_CUSTOMER".equalsIgnoreCase(name)) {
				customerTable = table;
				continue;
			}
			if ("TBL_LOCATION".equalsIgnoreCase(name)) {
				locationTable = table;
				continue;
			}
		}
		

		assertNotNull(customerTable);
		assertNotNull(locationTable);	
	}

	@SuppressWarnings("unchecked")
	public void testDField() throws IOException {
		EObject object = ResourceHelper.loadResource(path);
		DModel gModel = (DModel) object;
		List<DPackage> packages = gModel.getDPackages();
		DPackage pack = packages.get(0);
		
		DTable customerTable = null;
		DTable locationTable = null;
		DTable relationTable = null;
		List<DTable> tables = pack.getDTables();
		for (DTable table : tables) {
			String name = table.getName();
			if ("TBL_CUSTOMER".equalsIgnoreCase(name)) {
				customerTable = table;
				continue;
			}
			if ("TBL_LOCATION".equalsIgnoreCase(name)) {
				locationTable = table;
				continue;
			}
			if ("TBL_LOCATION_CUSTOMER".equalsIgnoreCase(name)) {
				relationTable = table;
				continue;
			}
		}

		List customerFields = customerTable.getDFields();
		List locationFields = locationTable.getDFields();
		List relationFields = relationTable.getDFields();
		assertNotNull(customerFields);
		assertNotNull(locationFields);
		assertNotNull(relationFields);
		
		assertEquals(0, locationFields.size());
		assertEquals(1, customerFields.size());
		assertEquals(2, relationFields.size());
	}

}
