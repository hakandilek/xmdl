package org.xmdl.taslak.webapp.integration;

import org.xmdl.ida.lib.web.webdriver.test.BaseSeleniumTestCase;
import org.xmdl.taslak.webapp.integration.page.OrderAddPage;
import org.xmdl.taslak.webapp.integration.page.OrderEditPage;
import org.xmdl.taslak.webapp.integration.page.OrderSearchPage;

public class OrderTest extends BaseSeleniumTestCase {

	public void testSearch() {
		login();
		OrderSearchPage searchPage = get("/Order/orders.do",
				OrderSearchPage.class);

		String pageBannerText = searchPage.getPageBannerText();
		assertNotNull(pageBannerText);
		assertTrue(pageBannerText
				.endsWith("orders found, displaying all orders."));
		assertEquals(3 + 2, searchPage.getTableRowCount());
	}

	public void testEdit() {
		login();
		OrderEditPage editPage = get("/Order/editOrder.do?id=1",
				OrderEditPage.class);

		String name = editPage.getName();
		assertNotNull(name);
		assertEquals("TODO:random", name);

		String priceTotals = editPage.getPriceTotals();
		assertNotNull(priceTotals);
		assertEquals("TODO:random", priceTotals);

		String createDate = editPage.getCreateDate();
		assertNotNull(createDate);
		assertEquals("TODO:random", createDate);

	}

	public void testSave() {
		login();
		OrderEditPage editPage = get("/Order/editOrder.do?id=1",
				OrderEditPage.class);
		OrderEditPage updatePage = editPage.update("", "", null);

		String successMessages = updatePage.getSuccessMessages();
		assertNotNull(successMessages);
	}

	public void testAdd() {
		login();
		OrderAddPage addPage = get("/Order/editOrder.do", OrderAddPage.class);
		OrderSearchPage searchPage = addPage.add("random", "random", "random");

		String successMessages = searchPage.getSuccessMessages();
		assertNotNull(successMessages);
	}

	public void testCopy() {
		login();
		OrderEditPage copyPage = get("/Order/copyOrder.do?idToCopy=1",
				OrderEditPage.class);

		String name = copyPage.getName();
		assertNotNull(name);
		assertEquals("TODO:random", name);

		String priceTotals = copyPage.getPriceTotals();
		assertNotNull(priceTotals);
		assertEquals("TODO:random", priceTotals);

		String createDate = copyPage.getCreateDate();
		assertNotNull(createDate);
		assertEquals("TODO:random", createDate);

	}

	/** 
	 * Delete tests don't work because of confirmation dialog.
	 * See related webdriver issue:
	 * http://code.google.com/p/webdriver/issues/detail?id=27
	 * 

	public void testDelete() {
		login();
		OrderEditPage editPage = get("/Order/editOrder.do?id=1", OrderEditPage.class);
		OrderSearchPage searchPage = editPage.delete();
		
		String successMessages = searchPage.getSuccessMessages();
		assertNotNull(successMessages);
		assertEquals("Order has been deleted successfully.", successMessages);
	}

	public void testMassDelete() {
		login();
		OrderSearchPage searchPage = get("/Order/orders.do", OrderSearchPage.class);
		OrderSearchPage deletePage = searchPage.deleteAll();

		String successMessages = deletePage.getSuccessMessages();
		assertNotNull(successMessages);
		assertEquals("deleted", successMessages);
		String pageBannerText = searchPage.getPageBannerText();
		assertNotNull(pageBannerText);
		assertEquals("No orders found", pageBannerText);
	}
	 **/

	/*PROTECTED REGION ID(Order.IntTest.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/

}
