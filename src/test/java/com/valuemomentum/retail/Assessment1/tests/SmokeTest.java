package com.valuemomentum.retail.Assessment1.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.valuemomentum.retail.Assessment1.utils.BaseTest;
import com.valuemomentum.retail.Assessment1.pages.HomePage;
import com.valuemomentum.retail.Assessment1.pages.ProductDetailsPage;
import com.valuemomentum.retail.Assessment1.pages.ProductPage;
import com.valuemomentum.retail.Assessment1.pages.SearchResultsPage;
import com.valuemomentum.retail.Assessment1.tests.SmokeTest;

public class SmokeTest extends BaseTest {

	private static final Logger Logger = LogManager.getLogger(SmokeTest.class);
	WebDriver driver;
	HomePage homePage;
	SearchResultsPage searchResultsPage;
	ProductDetailsPage productDetailsPage;
	ProductPage productPage;

	@BeforeClass
	public void setup() {
		Logger.info("Setup method called");
		homePage = new HomePage(getDriver());
	}

	
	@Test()
	public void verifyMobile() throws Exception{

		System.out.println(" Thread id : " + Thread.currentThread().getId());
		searchResultsPage = homePage.clickOnElement();
		Logger.info("Element selected");

		productPage = searchResultsPage.clickOnFilter();
		Logger.info("CheckBox selected");

		productDetailsPage = productPage.clickOnProduct();
		Logger.info("product selected");

		productDetailsPage.clickOnAddToCart();
		Logger.info("method closed");
	}

}
