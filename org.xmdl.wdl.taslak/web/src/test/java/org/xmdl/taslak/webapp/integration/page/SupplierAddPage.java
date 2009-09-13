package org.xmdl.taslak.webapp.integration.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SupplierAddPage extends AbstractNavigationPage {

	public SupplierAddPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID_OR_NAME, using = "supplier.name")
	private WebElement name;

	@FindBy(how = How.ID_OR_NAME, using = "supplierForm_button_add")
	private WebElement add;

	@FindBy(how = How.ID_OR_NAME, using = "supplierForm_button_cancel")
	private WebElement cancel;

	public SupplierSearchPage add(String name) {
		if (name != null)
			this.name.sendKeys(name);

		this.add.submit();
		return page(SupplierSearchPage.class);
	}

	public SupplierSearchPage cancel() {
		this.cancel.submit();
		return page(SupplierSearchPage.class);
	}

	/*PROTECTED REGION ID(Supplier.ent.add.page.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
