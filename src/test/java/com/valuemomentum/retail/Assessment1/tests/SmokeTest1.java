package com.valuemomentum.retail.Assessment1.tests;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.valuemomentum.retail.Assessment1.utils.BaseTest;
import com.valuemomentum.retail.Assessment1.utils.DataUtility;
import com.valuemomentum.retail.Assessment1.pages.HomePage;
import com.valuemomentum.retail.Assessment1.pages.ProductDetailsPage;
import com.valuemomentum.retail.Assessment1.pages.ProductPage;
import com.valuemomentum.retail.Assessment1.pages.SearchResultsPage;
import com.valuemomentum.retail.Assessment1.tests.SmokeTest1;

public class SmokeTest1 extends BaseTest {
	
	private static final Logger Logger = LogManager.getLogger(SmokeTest.class);
	WebDriver driver;
	HomePage homePage;
	SearchResultsPage searchResultsPage;
	ProductDetailsPage productDetailsPage;
	ProductPage productPage;

	@BeforeClass
	public void setup() {
		this.driver = getDriver();
		homePage = new HomePage(driver);
	}

	@DataProvider(name = "Input")
	public Object[][] dataInput() throws Exception {
		return DataUtility.getTestData();
	}


	
	@Test(dataProvider = "Input",enabled = true)
	public void DataUtilityMethod(String value) {
		homePage.homePagebtn();
		Logger.info("Enter "+value+" in search bar");
		homePage.enterSearchText(value);
		Logger.info("Clicked Search Button");
		homePage.clickOnSearchButton();
		Logger.info("Navigated Back after search");
	}
}