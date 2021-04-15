package com.valuemomentum.retail.Assessment1.pages;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductDetailsPage extends BasePage{
	
	
	
	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	//element
	@FindBy(id = "add-to-cart-button" )
	private WebElement _btnAddToCart;
	
	
	//action
	
	public void clickOnAddToCart()
	{
		_btnAddToCart.click();
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try
        {
               FileUtils.copyFile(file, new File("C:\\Training\\Java\\Assessment1\\screenshot\\img01.png"));
           }
        catch (IOException e) {
              
               e.printStackTrace();
           }
	}

}
