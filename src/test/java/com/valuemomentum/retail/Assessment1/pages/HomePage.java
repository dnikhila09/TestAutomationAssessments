package com.valuemomentum.retail.Assessment1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		
	}	
	
	//element
	@FindBy(xpath="//*[text()='Mobiles']")
	private WebElement _txtElement;
	
	public SearchResultsPage clickOnElement()
	{
		_txtElement.click();
		return new  SearchResultsPage(getDriver());
		
	}
	@FindBy(id="twotabsearchtextbox")
    private WebElement _txtSearchBox;
	
	 public void enterSearchText(String value)
	    {
		 _txtSearchBox.clear();
	        _txtSearchBox.sendKeys(value);
	    }

    @FindBy(id = "nav-search-submit-button")
    private WebElement _btnSearch;

    public void clickOnSearchButton()
    {
        _btnSearch.click();
       
    }
    
    
    @FindBy(id ="nav-logo-sprites")
    private WebElement _homePageBtn;

	
    public void homePagebtn() {
    _homePageBtn.click();
    }
   

	
}

