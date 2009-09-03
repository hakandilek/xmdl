package org.xmdl.taslak.webapp.integration.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductAddPage extends AbstractNavigationPage {

	public ProductAddPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID_OR_NAME, using = "product.name")
	private WebElement name;

	@FindBy(how = How.ID_OR_NAME, using = "product.price")
	private WebElement price;

	@FindBy(how = How.ID_OR_NAME, using = "product.productType")
	private WebElement productType;

	@FindBy(how = How.ID_OR_NAME, using = "productForm_button_add")
	private WebElement add;

	@FindBy(how = How.ID_OR_NAME, using = "productForm_button_cancel")
	private WebElement cancel;

	public ProductSearchPage add(String name, String price, String productType) {
		if (name != null)
			this.name.sendKeys(name);
		if (price != null)
			this.price.sendKeys(price);
		if (productType != null)
			this.productType.sendKeys(productType);

		this.add.submit();
		return page(ProductSearchPage.class);
	}

	public ProductSearchPage cancel() {
		this.cancel.submit();
		return page(ProductSearchPage.class);
	}

	/*PROTECTED REGION ID(Product.ent.add.page.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
