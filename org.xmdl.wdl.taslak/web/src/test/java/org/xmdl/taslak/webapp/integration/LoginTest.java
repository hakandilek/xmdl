package org.xmdl.taslak.webapp.integration;

import org.xmdl.ida.lib.web.webdriver.page.LoginPage;
import org.xmdl.ida.lib.web.webdriver.test.BaseSeleniumTestCase;
import org.xmdl.taslak.webapp.integration.page.MainPage;

public class LoginTest extends BaseSeleniumTestCase {

	public void testLogin() throws Exception {
		LoginPage loginPage = get("/", LoginPage.class);
		loginPage.login(TEST_USERNAME, TEST_PASSWORD, false);
		MainPage mainPage = get("/", MainPage.class);
		assertNotNull(mainPage);
		assertEquals(TEST_USERNAME, mainPage.getLoginUsername());
	}

	/*PROTECTED REGION ID(LoginTest.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/

}
