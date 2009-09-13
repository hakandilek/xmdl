package org.xmdl.taslak.webapp.integration.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderElementEditPage extends AbstractNavigationPage {

	public OrderElementEditPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID_OR_NAME, using = "orderElement.quantity")
	private WebElement quantity;

	@FindBy(how = How.ID_OR_NAME, using = "orderElementForm_button_update")
	private WebElement update;

	@FindBy(how = How.ID_OR_NAME, using = "orderElementForm_button_delete")
	private WebElement delete;

	@FindBy(how = How.ID_OR_NAME, using = "orderElementForm_")
	private WebElement copy;

	@FindBy(how = How.ID_OR_NAME, using = "orderElementForm_button_cancel")
	private WebElement cancel;

	public String getQuantity() {
		return quantity.getValue();
	}

	public OrderElementEditPage update(String quantity) {

		if (quantity != null)
			this.quantity.sendKeys(quantity);

		this.update.submit();
		return page(OrderElementEditPage.class);
	}

	public OrderElementSearchPage cancel() {
		this.cancel.submit();
		return page(OrderElementSearchPage.class);
	}

	public OrderElementSearchPage delete() {
		this.delete.submit();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		String script = "window.confirm = function(msg) { return true; }";
		executor.executeScript(script);
		return page(OrderElementSearchPage.class);
	}

	public OrderElementEditPage copy() {
		this.copy.submit();
		return page(OrderElementEditPage.class);
	}

	/*PROTECTED REGION ID(OrderElement.ent.edt.page.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
