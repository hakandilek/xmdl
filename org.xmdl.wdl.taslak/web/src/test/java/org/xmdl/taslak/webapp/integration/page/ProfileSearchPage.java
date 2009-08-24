package org.xmdl.taslak.webapp.integration.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfileSearchPage extends AbstractNavigationPage {

	@FindBy(how = How.CLASS_NAME, using = "pagebanner")
	private WebElement pageBanner;

	@FindBy(how = How.ID, using = "profileList")
	private WebElement table;

	@FindBy(how = How.ID_OR_NAME, using = "allbox")
	private WebElement allbox;

	@FindBy(how = How.ID_OR_NAME, using = "method:deleteMass")
	private WebElement deleteMass;

	public ProfileSearchPage(WebDriver driver) {
		super(driver);
	}

	public String getPageBannerText() {
		return pageBanner.getText();
	}

	public String getTableCell(int row, int col) {
		WebElement el = table.findElement(By.xpath(".//tr[" + row + "]//td["
				+ col + "]"));
		if (el != null)
			return el.getText();
		return null;
	}

	public int getTableRowCount() {
		List<WebElement> elems = table.findElements(By.xpath(".//tr"));
		return elems.size();
	}

	public ProfileSearchPage deleteAll() {
		allbox.toggle();
		deleteMass.submit();
		return page(ProfileSearchPage.class);
	}

	/*PROTECTED REGION ID(Profile.ent.srch.page.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
