package org.xmdl.taslak.webapp.integration;

import org.xmdl.ida.lib.web.webdriver.test.BaseSeleniumTestCase;
import org.xmdl.taslak.webapp.integration.page.OrderElementAddPage;
import org.xmdl.taslak.webapp.integration.page.OrderElementEditPage;
import org.xmdl.taslak.webapp.integration.page.OrderElementSearchPage;

public class OrderElementTest extends BaseSeleniumTestCase {

	public void testSearch() {
		login();
		OrderElementSearchPage searchPage = get(
				"/OrderElement/orderElements.do", OrderElementSearchPage.class);

		String pageBannerText = searchPage.getPageBannerText();
		assertNotNull(pageBannerText);
		assertTrue(pageBannerText
				.endsWith("orderElements found, displaying all orderElements."));
		assertEquals(3 + 2, searchPage.getTableRowCount());
	}

	public void testEdit() {
		login();
		OrderElementEditPage editPage = get(
				"/OrderElement/editOrderElement.do?id=1",
				OrderElementEditPage.class);

		String quantity = editPage.getQuantity();
		assertNotNull(quantity);
		assertEquals("TODO:random", quantity);

	}

	public void testSave() {
		login();
		OrderElementEditPage editPage = get(
				"/OrderElement/editOrderElement.do?id=1",
				OrderElementEditPage.class);
		OrderElementEditPage updatePage = editPage.update("");

		String successMessages = updatePage.getSuccessMessages();
		assertNotNull(successMessages);
	}

	public void testAdd() {
		login();
		OrderElementAddPage addPage = get("/OrderElement/editOrderElement.do",
				OrderElementAddPage.class);
		OrderElementSearchPage searchPage = addPage.add("random");

		String successMessages = searchPage.getSuccessMessages();
		assertNotNull(successMessages);
	}

	public void testCopy() {
		login();
		OrderElementEditPage copyPage = get(
				"/OrderElement/copyOrderElement.do?idToCopy=1",
				OrderElementEditPage.class);

		String quantity = copyPage.getQuantity();
		assertNotNull(quantity);
		assertEquals("TODO:random", quantity);

	}

	/** 
	 * Delete tests don't work because of confirmation dialog.
	 * See related webdriver issue:
	 * http://code.google.com/p/webdriver/issues/detail?id=27
	 * 

	public void testDelete() {
		login();
		OrderElementEditPage editPage = get("/OrderElement/editOrderElement.do?id=1", OrderElementEditPage.class);
		OrderElementSearchPage searchPage = editPage.delete();
		
		String successMessages = searchPage.getSuccessMessages();
		assertNotNull(successMessages);
		assertEquals("OrderElement has been deleted successfully.", successMessages);
	}

	public void testMassDelete() {
		login();
		OrderElementSearchPage searchPage = get("/OrderElement/orderElements.do", OrderElementSearchPage.class);
		OrderElementSearchPage deletePage = searchPage.deleteAll();

		String successMessages = deletePage.getSuccessMessages();
		assertNotNull(successMessages);
		assertEquals("deleted", successMessages);
		String pageBannerText = searchPage.getPageBannerText();
		assertNotNull(pageBannerText);
		assertEquals("No orderElements found", pageBannerText);
	}
	 **/

	/*PROTECTED REGION ID(OrderElement.IntTest.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/

}
