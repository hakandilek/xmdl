package org.xmdl.taslak.webapp.integration.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderEditPage extends AbstractNavigationPage {

	public OrderEditPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID_OR_NAME, using = "order.name")
	private WebElement name;

	@FindBy(how = How.ID_OR_NAME, using = "order.priceTotals")
	private WebElement priceTotals;

	@FindBy(how = How.ID_OR_NAME, using = "dojo.order.createDate")
	private WebElement createDate;

	@FindBy(how = How.ID_OR_NAME, using = "orderForm_button_update")
	private WebElement update;

	@FindBy(how = How.ID_OR_NAME, using = "orderForm_button_delete")
	private WebElement delete;

	@FindBy(how = How.ID_OR_NAME, using = "orderForm_")
	private WebElement copy;

	@FindBy(how = How.ID_OR_NAME, using = "orderForm_button_cancel")
	private WebElement cancel;

	public String getName() {
		return name.getValue();
	}

	public String getPriceTotals() {
		return priceTotals.getValue();
	}

	public String getCreateDate() {
		return createDate.getValue();
	}

	public OrderEditPage update(String name, String priceTotals,
			String createDate) {

		if (name != null)
			this.name.sendKeys(name);

		if (priceTotals != null)
			this.priceTotals.sendKeys(priceTotals);

		if (createDate != null)
			this.createDate.sendKeys(createDate);

		this.update.submit();
		return page(OrderEditPage.class);
	}

	public OrderSearchPage cancel() {
		this.cancel.submit();
		return page(OrderSearchPage.class);
	}

	public OrderSearchPage delete() {
		this.delete.submit();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		String script = "window.confirm = function(msg) { return true; }";
		executor.executeScript(script);
		return page(OrderSearchPage.class);
	}

	public OrderEditPage copy() {
		this.copy.submit();
		return page(OrderEditPage.class);
	}

	/*PROTECTED REGION ID(Order.ent.edt.page.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
