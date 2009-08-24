package org.xmdl.taslak.webapp.integration.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductEditPage extends AbstractNavigationPage {

	public ProductEditPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID_OR_NAME, using = "product.name")
	private WebElement name;

	@FindBy(how = How.ID_OR_NAME, using = "product.price")
	private WebElement price;

	@FindBy(how = How.ID_OR_NAME, using = "product.productType")
	private WebElement productType;

	@FindBy(how = How.ID_OR_NAME, using = "productForm_button_update")
	private WebElement update;

	@FindBy(how = How.ID_OR_NAME, using = "productForm_button_delete")
	private WebElement delete;

	@FindBy(how = How.ID_OR_NAME, using = "productForm_")
	private WebElement copy;

	@FindBy(how = How.ID_OR_NAME, using = "productForm_button_cancel")
	private WebElement cancel;

	public String getName() {
		return name.getValue();
	}

	public String getPrice() {
		return price.getValue();
	}

	public String getProductType() {
		return productType.getValue();
	}

	public ProductEditPage update(String name, String price, String productType) {

		if (name != null)
			this.name.sendKeys(name);

		if (price != null)
			this.price.sendKeys(price);

		if (productType != null)
			this.productType.sendKeys(productType);

		this.update.submit();
		return page(ProductEditPage.class);
	}

	public ProductSearchPage cancel() {
		this.cancel.submit();
		return page(ProductSearchPage.class);
	}

	public ProductSearchPage delete() {
		this.delete.submit();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		String script = "window.confirm = function(msg) { return true; }";
		executor.executeScript(script);
		return page(ProductSearchPage.class);
	}

	public ProductEditPage copy() {
		this.copy.submit();
		return page(ProductEditPage.class);
	}

	/*PROTECTED REGION ID(Product.ent.edt.page.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
