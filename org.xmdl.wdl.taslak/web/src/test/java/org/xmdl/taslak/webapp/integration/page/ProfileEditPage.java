package org.xmdl.taslak.webapp.integration.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfileEditPage extends AbstractNavigationPage {

	public ProfileEditPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID_OR_NAME, using = "profile.privatePhone")
	private WebElement privatePhone;

	@FindBy(how = How.ID_OR_NAME, using = "profileForm_button_update")
	private WebElement update;

	@FindBy(how = How.ID_OR_NAME, using = "profileForm_button_delete")
	private WebElement delete;

	@FindBy(how = How.ID_OR_NAME, using = "profileForm_")
	private WebElement copy;

	@FindBy(how = How.ID_OR_NAME, using = "profileForm_button_cancel")
	private WebElement cancel;

	public String getPrivatePhone() {
		return privatePhone.getValue();
	}

	public ProfileEditPage update(String privatePhone) {

		if (privatePhone != null)
			this.privatePhone.sendKeys(privatePhone);

		this.update.submit();
		return page(ProfileEditPage.class);
	}

	public ProfileSearchPage cancel() {
		this.cancel.submit();
		return page(ProfileSearchPage.class);
	}

	public ProfileSearchPage delete() {
		this.delete.submit();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		String script = "window.confirm = function(msg) { return true; }";
		executor.executeScript(script);
		return page(ProfileSearchPage.class);
	}

	public ProfileEditPage copy() {
		this.copy.submit();
		return page(ProfileEditPage.class);
	}

	/*PROTECTED REGION ID(Profile.ent.edt.page.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
