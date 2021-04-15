package com.valuemomentum.retail.Assessment1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SearchResultsPage extends BasePage{
	
	
	public SearchResultsPage(WebDriver driver)
	{
		super(driver);
		
	}
	//element
			@FindBy(xpath = "//*[text()='Cloudtail India']" )
			private WebElement _filterItem;
			
			//action
			
			public ProductPage clickOnFilter() 
			{
				
				_filterItem.click();
				return new ProductPage(getDriver());
				
			}
			
		
}
