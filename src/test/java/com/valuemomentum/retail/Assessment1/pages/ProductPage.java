package com.valuemomentum.retail.Assessment1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.valuemomentum.retail.Assessment1.tests.WebDriverHelper;

public class ProductPage extends BasePage {

	public ProductPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//*[text()='AmazonBasics USB Type-C to USB-A 2.0 Male Cable - 3 Feet (0.9 Meters) - Black']")
	private WebElement _ProductSelected;
	
	public  ProductDetailsPage clickOnProduct() throws InterruptedException
	{
		Thread.sleep(2000);
		_ProductSelected.click();
		Thread.sleep(2000);
		WebDriverHelper.switchToWindow();
		return new ProductDetailsPage(getDriver());
	}

}
