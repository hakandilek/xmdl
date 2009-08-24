package org.xmdl.taslak.webapp.integration.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends AbstractNavigationPage {

	@FindBy(how = How.ID, using = "username")
	private WebElement username;

	public MainPage(WebDriver driver) {
		super(driver);
	}

	public String getLoginUsername() {
		return username.getText();
	}

	/*PROTECTED REGION ID(.main.page.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
