package org.xmdl.taslak.webapp.integration;

import org.xmdl.ida.lib.web.webdriver.test.BaseSeleniumTestCase;
import org.xmdl.taslak.webapp.integration.page.OrderAddPage;
import org.xmdl.taslak.webapp.integration.page.OrderEditPage;
import org.xmdl.taslak.webapp.integration.page.OrderSearchPage;

public class OrderTest extends BaseSeleniumTestCase {

	public void testSearchOrders() {
		login();
		OrderSearchPage searchPage = get("/Order/orders.do", OrderSearchPage.class);
		
		String pageBannerText = searchPage.getPageBannerText();
		assertNotNull(pageBannerText);
		assertTrue(pageBannerText.endsWith("orders found, displaying all orders."));
		assertEquals(3+2, searchPage.getTableRowCount());
	}

	public void testEditOrder() {
		login();
		OrderEditPage editPage = get("/Order/editOrder.do?id=1", OrderEditPage.class);
		
		String name = editPage.getName();
		assertNotNull(name);
		assertEquals("EbmK afatU2Xc8 ", name);
		
		String priceTotals = editPage.getPriceTotals();
		assertNotNull(priceTotals);
		assertEquals("0.6571071197650238", priceTotals);
		
		String createDate = editPage.getCreateDate();
		assertNotNull(createDate);
		assertEquals("11/17/02", createDate);
	}

	public void testSaveOrder() {
		login();
		OrderEditPage editPage = get("/Order/editOrder.do?id=1", OrderEditPage.class);
		OrderEditPage updatePage = editPage.update("EbmK afatU2Xc8 ", 0.6571071197650238, null);
		
		String successMessages = updatePage.getSuccessMessages();
		assertNotNull(successMessages);
	}

	public void testAddOrder() {
		login();
		OrderAddPage addPage = get("/Order/editOrder.do", OrderAddPage.class);
		OrderSearchPage searchPage = addPage.add("EbmK afatU2Xc8 ", "8", "08/08/08");
		
		String successMessages = searchPage.getSuccessMessages();
		assertNotNull(successMessages);
	}

	public void testCopyOrder() {
		login();
		OrderEditPage copyPage = get("/Order/copyOrder.do?idToCopy=1", OrderEditPage.class);
		
		String name = copyPage.getName();
		assertNotNull(name);
		assertEquals("EbmK afatU2Xc8 ", name);
		
		String priceTotals = copyPage.getPriceTotals();
		assertNotNull(priceTotals);
		assertEquals("0.6571071197650238", priceTotals);
		
		String createDate = copyPage.getCreateDate();
		assertNotNull(createDate);
		assertEquals("11/17/02", createDate);
	}

	/** 
	 * Delete tests don't work because of confirmation dialog.
	 * See related webdriver issue:
	 * http://code.google.com/p/webdriver/issues/detail?id=27
	 * 

	public void testDeleteOrder() {
		login();
		OrderEditPage editPage = get("/Order/editOrder.do?id=1", OrderEditPage.class);
		OrderSearchPage searchPage = editPage.delete();
		
		String successMessages = searchPage.getSuccessMessages();
		assertNotNull(successMessages);
		assertEquals("Order has been deleted successfully.", successMessages);
	}

	public void testMassDeleteOrder() {
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
}
