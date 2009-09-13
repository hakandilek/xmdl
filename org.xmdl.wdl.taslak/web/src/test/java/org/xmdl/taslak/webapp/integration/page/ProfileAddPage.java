package org.xmdl.taslak.webapp.integration.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfileAddPage extends AbstractNavigationPage {

	public ProfileAddPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID_OR_NAME, using = "profile.privatePhone")
	private WebElement privatePhone;

	@FindBy(how = How.ID_OR_NAME, using = "profileForm_button_add")
	private WebElement add;

	@FindBy(how = How.ID_OR_NAME, using = "profileForm_button_cancel")
	private WebElement cancel;

	public ProfileSearchPage add(String privatePhone) {
		if (privatePhone != null)
			this.privatePhone.sendKeys(privatePhone);

		this.add.submit();
		return page(ProfileSearchPage.class);
	}

	public ProfileSearchPage cancel() {
		this.cancel.submit();
		return page(ProfileSearchPage.class);
	}

	/*PROTECTED REGION ID(Profile.ent.add.page.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
