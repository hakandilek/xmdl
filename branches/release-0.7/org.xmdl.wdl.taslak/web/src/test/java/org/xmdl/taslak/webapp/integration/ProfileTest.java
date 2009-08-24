package org.xmdl.taslak.webapp.integration;

import org.xmdl.ida.lib.web.webdriver.test.BaseSeleniumTestCase;
import org.xmdl.taslak.webapp.integration.page.ProfileAddPage;
import org.xmdl.taslak.webapp.integration.page.ProfileEditPage;
import org.xmdl.taslak.webapp.integration.page.ProfileSearchPage;

public class ProfileTest extends BaseSeleniumTestCase {

	public void testSearch() {
		login();
		ProfileSearchPage searchPage = get("/Profile/profiles.do",
				ProfileSearchPage.class);

		String pageBannerText = searchPage.getPageBannerText();
		assertNotNull(pageBannerText);
		assertTrue(pageBannerText
				.endsWith("profiles found, displaying all profiles."));
		assertEquals(3 + 2, searchPage.getTableRowCount());
	}

	public void testEdit() {
		login();
		ProfileEditPage editPage = get("/Profile/editProfile.do?id=1",
				ProfileEditPage.class);

		String privatePhone = editPage.getPrivatePhone();
		assertNotNull(privatePhone);
		assertEquals("TODO:random", privatePhone);

	}

	public void testSave() {
		login();
		ProfileEditPage editPage = get("/Profile/editProfile.do?id=1",
				ProfileEditPage.class);
		ProfileEditPage updatePage = editPage.update("");

		String successMessages = updatePage.getSuccessMessages();
		assertNotNull(successMessages);
	}

	public void testAdd() {
		login();
		ProfileAddPage addPage = get("/Profile/editProfile.do",
				ProfileAddPage.class);
		ProfileSearchPage searchPage = addPage.add("random");

		String successMessages = searchPage.getSuccessMessages();
		assertNotNull(successMessages);
	}

	public void testCopy() {
		login();
		ProfileEditPage copyPage = get("/Profile/copyProfile.do?idToCopy=1",
				ProfileEditPage.class);

		String privatePhone = copyPage.getPrivatePhone();
		assertNotNull(privatePhone);
		assertEquals("TODO:random", privatePhone);

	}

	/** 
	 * Delete tests don't work because of confirmation dialog.
	 * See related webdriver issue:
	 * http://code.google.com/p/webdriver/issues/detail?id=27
	 * 

	public void testDelete() {
		login();
		ProfileEditPage editPage = get("/Profile/editProfile.do?id=1", ProfileEditPage.class);
		ProfileSearchPage searchPage = editPage.delete();
		
		String successMessages = searchPage.getSuccessMessages();
		assertNotNull(successMessages);
		assertEquals("Profile has been deleted successfully.", successMessages);
	}

	public void testMassDelete() {
		login();
		ProfileSearchPage searchPage = get("/Profile/profiles.do", ProfileSearchPage.class);
		ProfileSearchPage deletePage = searchPage.deleteAll();

		String successMessages = deletePage.getSuccessMessages();
		assertNotNull(successMessages);
		assertEquals("deleted", successMessages);
		String pageBannerText = searchPage.getPageBannerText();
		assertNotNull(pageBannerText);
		assertEquals("No profiles found", pageBannerText);
	}
	 **/

	/*PROTECTED REGION ID(Profile.IntTest.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/

}
