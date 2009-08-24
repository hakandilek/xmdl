package org.xmdl.taslak.webapp.integration.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderElementAddPage extends AbstractNavigationPage {

	public OrderElementAddPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID_OR_NAME, using = "orderElement.quantity")
	private WebElement quantity;

	@FindBy(how = How.ID_OR_NAME, using = "orderElementForm_button_add")
	private WebElement add;

	@FindBy(how = How.ID_OR_NAME, using = "orderElementForm_button_cancel")
	private WebElement cancel;

	public OrderElementSearchPage add(String quantity) {
		if (quantity != null)
			this.quantity.sendKeys(quantity);

		this.add.submit();
		return page(OrderElementSearchPage.class);
	}

	public OrderElementSearchPage cancel() {
		this.cancel.submit();
		return page(OrderElementSearchPage.class);
	}

	/*PROTECTED REGION ID(OrderElement.ent.add.page.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
