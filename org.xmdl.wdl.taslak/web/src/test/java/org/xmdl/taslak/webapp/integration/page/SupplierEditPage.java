package org.xmdl.taslak.webapp.integration.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SupplierEditPage extends AbstractNavigationPage {

	public SupplierEditPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID_OR_NAME, using = "supplier.name")
	private WebElement name;

	@FindBy(how = How.ID_OR_NAME, using = "supplierForm_button_update")
	private WebElement update;

	@FindBy(how = How.ID_OR_NAME, using = "supplierForm_button_delete")
	private WebElement delete;

	@FindBy(how = How.ID_OR_NAME, using = "supplierForm_")
	private WebElement copy;

	@FindBy(how = How.ID_OR_NAME, using = "supplierForm_button_cancel")
	private WebElement cancel;

	public String getName() {
		return name.getValue();
	}

	public SupplierEditPage update(String name) {

		if (name != null)
			this.name.sendKeys(name);

		this.update.submit();
		return page(SupplierEditPage.class);
	}

	public SupplierSearchPage cancel() {
		this.cancel.submit();
		return page(SupplierSearchPage.class);
	}

	public SupplierSearchPage delete() {
		this.delete.submit();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		String script = "window.confirm = function(msg) { return true; }";
		executor.executeScript(script);
		return page(SupplierSearchPage.class);
	}

	public SupplierEditPage copy() {
		this.copy.submit();
		return page(SupplierEditPage.class);
	}

	/*PROTECTED REGION ID(Supplier.ent.edt.page.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
