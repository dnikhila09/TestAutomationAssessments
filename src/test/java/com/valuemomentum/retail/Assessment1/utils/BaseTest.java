package com.valuemomentum.retail.Assessment1.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

	
	
public class BaseTest 
{
	static WebDriver driver;
	
	
	
	@BeforeTest
	public void createDriver()  {
		
		
		System.out.println(" Before Suite");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	}
	public static WebDriver getDriver() {
		return driver;
	}

	public  void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	@AfterTest
	public void test_aftersuite() {
		System.out.println(" After Suite");
		driver.close();
		driver.quit();
	}
}