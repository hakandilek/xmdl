package org.xmdl.taslak.webapp.integration.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.xmdl.ida.lib.web.webdriver.page.AbstractPage;
import org.xmdl.ida.lib.web.webdriver.page.ClickstreamPage;
import org.xmdl.ida.lib.web.webdriver.page.CurrentUsersPage;
import org.xmdl.ida.lib.web.webdriver.page.EditProfilePage;
import org.xmdl.ida.lib.web.webdriver.page.FlushCachePage;
import org.xmdl.ida.lib.web.webdriver.page.LogoutPage;
import org.xmdl.ida.lib.web.webdriver.page.UploadFilePage;
import org.xmdl.ida.lib.web.webdriver.page.ViewUsersPage;

public class AbstractNavigationPage extends AbstractPage {

	public AbstractNavigationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.LINK_TEXT, using = "Edit Profile")
	private WebElement linkEditProfile;

	@FindBy(how = How.LINK_TEXT, using = "Upload A File")
	private WebElement linkUploadAFile;

	@FindBy(how = How.LINK_TEXT, using = "View Users")
	private WebElement linkViewUsers;

	@FindBy(how = How.LINK_TEXT, using = "Current Users")
	private WebElement linkCurrentUsers;

	@FindBy(how = How.LINK_TEXT, using = "Flush Cache")
	private WebElement linkFlushCache;

	@FindBy(how = How.LINK_TEXT, using = "Clickstream")
	private WebElement linkClickstream;

	@FindBy(how = How.LINK_TEXT, using = "Logout")
	private WebElement linkLogout;

	//Application specific links
	@FindBy(how = How.LINK_TEXT, using = "Edit Orders")
	private WebElement linkEditOrders;

	@FindBy(how = How.LINK_TEXT, using = "Search Orders")
	private WebElement linkSearchOrders;

	public EditProfilePage editProfile() {
		linkEditProfile.click();
		return page(EditProfilePage.class);
	}

	public UploadFilePage uploadFile() {
		linkUploadAFile.click();
		return page(UploadFilePage.class);
	}

	public ViewUsersPage viewUsers() {
		linkViewUsers.click();
		return page(ViewUsersPage.class);
	}

	public CurrentUsersPage currentUsers() {
		linkCurrentUsers.click();
		return page(CurrentUsersPage.class);
	}

	public FlushCachePage flushCache() {
		linkFlushCache.click();
		return page(FlushCachePage.class);
	}

	public ClickstreamPage clickstream() {
		linkClickstream.click();
		return page(ClickstreamPage.class);
	}

	public LogoutPage logout() {
		linkLogout.click();
		return page(LogoutPage.class);
	}

	//Application specific links
	public OrderAddPage editOrders() {
		linkEditOrders.click();
		return page(OrderAddPage.class);
	}

	public OrderSearchPage searchOrders() {
		linkSearchOrders.click();
		return page(OrderSearchPage.class);
	}

	/*PROTECTED REGION ID(.abs.nav.page.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/

}
