package org.xmdl.taslak.webapp.integration;

import org.xmdl.ida.lib.web.webdriver.test.BaseSeleniumTestCase;
import org.xmdl.taslak.webapp.integration.page.SupplierAddPage;
import org.xmdl.taslak.webapp.integration.page.SupplierEditPage;
import org.xmdl.taslak.webapp.integration.page.SupplierSearchPage;

public class SupplierTest extends BaseSeleniumTestCase {

	public void testSearch() {
		login();
		SupplierSearchPage searchPage = get("/Supplier/suppliers.do",
				SupplierSearchPage.class);

		String pageBannerText = searchPage.getPageBannerText();
		assertNotNull(pageBannerText);
		assertTrue(pageBannerText
				.endsWith("suppliers found, displaying all suppliers."));
		assertEquals(3 + 2, searchPage.getTableRowCount());
	}

	public void testEdit() {
		login();
		SupplierEditPage editPage = get("/Supplier/editSupplier.do?id=1",
				SupplierEditPage.class);

		String name = editPage.getName();
		assertNotNull(name);
		assertEquals("TODO:random", name);

	}

	public void testSave() {
		login();
		SupplierEditPage editPage = get("/Supplier/editSupplier.do?id=1",
				SupplierEditPage.class);
		SupplierEditPage updatePage = editPage.update("");

		String successMessages = updatePage.getSuccessMessages();
		assertNotNull(successMessages);
	}

	public void testAdd() {
		login();
		SupplierAddPage addPage = get("/Supplier/editSupplier.do",
				SupplierAddPage.class);
		SupplierSearchPage searchPage = addPage.add("random");

		String successMessages = searchPage.getSuccessMessages();
		assertNotNull(successMessages);
	}

	public void testCopy() {
		login();
		SupplierEditPage copyPage = get("/Supplier/copySupplier.do?idToCopy=1",
				SupplierEditPage.class);

		String name = copyPage.getName();
		assertNotNull(name);
		assertEquals("TODO:random", name);

	}

	/** 
	 * Delete tests don't work because of confirmation dialog.
	 * See related webdriver issue:
	 * http://code.google.com/p/webdriver/issues/detail?id=27
	 * 

	public void testDelete() {
		login();
		SupplierEditPage editPage = get("/Supplier/editSupplier.do?id=1", SupplierEditPage.class);
		SupplierSearchPage searchPage = editPage.delete();
		
		String successMessages = searchPage.getSuccessMessages();
		assertNotNull(successMessages);
		assertEquals("Supplier has been deleted successfully.", successMessages);
	}

	public void testMassDelete() {
		login();
		SupplierSearchPage searchPage = get("/Supplier/suppliers.do", SupplierSearchPage.class);
		SupplierSearchPage deletePage = searchPage.deleteAll();

		String successMessages = deletePage.getSuccessMessages();
		assertNotNull(successMessages);
		assertEquals("deleted", successMessages);
		String pageBannerText = searchPage.getPageBannerText();
		assertNotNull(pageBannerText);
		assertEquals("No suppliers found", pageBannerText);
	}
	 **/

	/*PROTECTED REGION ID(Supplier.IntTest.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/

}
