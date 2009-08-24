package org.xmdl.taslak.webapp.integration.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderAddPage extends AbstractNavigationPage {

	public OrderAddPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID_OR_NAME, using = "order.name")
	private WebElement name;

	@FindBy(how = How.ID_OR_NAME, using = "order.priceTotals")
	private WebElement priceTotals;

	@FindBy(how = How.ID_OR_NAME, using = "dojo.order.createDate")
	private WebElement createDate;

	@FindBy(how = How.ID_OR_NAME, using = "orderForm_button_add")
	private WebElement add;

	@FindBy(how = How.ID_OR_NAME, using = "orderForm_button_cancel")
	private WebElement cancel;

	public OrderSearchPage add(String name, String priceTotals,
			String createDate) {
		if (name != null)
			this.name.sendKeys(name);
		if (priceTotals != null)
			this.priceTotals.sendKeys(priceTotals);
		if (createDate != null)
			this.createDate.sendKeys(createDate);

		this.add.submit();
		return page(OrderSearchPage.class);
	}

	public OrderSearchPage cancel() {
		this.cancel.submit();
		return page(OrderSearchPage.class);
	}

	/*PROTECTED REGION ID(Order.ent.add.page.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
