package org.xmdl.taslak.webapp.integration;

import org.xmdl.ida.lib.web.webdriver.test.BaseSeleniumTestCase;
import org.xmdl.taslak.webapp.integration.page.ProductAddPage;
import org.xmdl.taslak.webapp.integration.page.ProductEditPage;
import org.xmdl.taslak.webapp.integration.page.ProductSearchPage;

public class ProductTest extends BaseSeleniumTestCase {

	public void testSearch() {
		login();
		ProductSearchPage searchPage = get("/Product/products.do",
				ProductSearchPage.class);

		String pageBannerText = searchPage.getPageBannerText();
		assertNotNull(pageBannerText);
		assertTrue(pageBannerText
				.endsWith("products found, displaying all products."));
		assertEquals(3 + 2, searchPage.getTableRowCount());
	}

	public void testEdit() {
		login();
		ProductEditPage editPage = get("/Product/editProduct.do?id=1",
				ProductEditPage.class);

		String name = editPage.getName();
		assertNotNull(name);
		assertEquals("TODO:random", name);

		String price = editPage.getPrice();
		assertNotNull(price);
		assertEquals("TODO:random", price);

		String productType = editPage.getProductType();
		assertNotNull(productType);
		assertEquals("TODO:random", productType);

	}

	public void testSave() {
		login();
		ProductEditPage editPage = get("/Product/editProduct.do?id=1",
				ProductEditPage.class);
		ProductEditPage updatePage = editPage.update("", "", "");

		String successMessages = updatePage.getSuccessMessages();
		assertNotNull(successMessages);
	}

	public void testAdd() {
		login();
		ProductAddPage addPage = get("/Product/editProduct.do",
				ProductAddPage.class);
		ProductSearchPage searchPage = addPage
				.add("random", "random", "random");

		String successMessages = searchPage.getSuccessMessages();
		assertNotNull(successMessages);
	}

	public void testCopy() {
		login();
		ProductEditPage copyPage = get("/Product/copyProduct.do?idToCopy=1",
				ProductEditPage.class);

		String name = copyPage.getName();
		assertNotNull(name);
		assertEquals("TODO:random", name);

		String price = copyPage.getPrice();
		assertNotNull(price);
		assertEquals("TODO:random", price);

		String productType = copyPage.getProductType();
		assertNotNull(productType);
		assertEquals("TODO:random", productType);

	}

	/** 
	 * Delete tests don't work because of confirmation dialog.
	 * See related webdriver issue:
	 * http://code.google.com/p/webdriver/issues/detail?id=27
	 * 

	public void testDelete() {
		login();
		ProductEditPage editPage = get("/Product/editProduct.do?id=1", ProductEditPage.class);
		ProductSearchPage searchPage = editPage.delete();
		
		String successMessages = searchPage.getSuccessMessages();
		assertNotNull(successMessages);
		assertEquals("Product has been deleted successfully.", successMessages);
	}

	public void testMassDelete() {
		login();
		ProductSearchPage searchPage = get("/Product/products.do", ProductSearchPage.class);
		ProductSearchPage deletePage = searchPage.deleteAll();

		String successMessages = deletePage.getSuccessMessages();
		assertNotNull(successMessages);
		assertEquals("deleted", successMessages);
		String pageBannerText = searchPage.getPageBannerText();
		assertNotNull(pageBannerText);
		assertEquals("No products found", pageBannerText);
	}
	 **/

	/*PROTECTED REGION ID(Product.IntTest.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/

}
