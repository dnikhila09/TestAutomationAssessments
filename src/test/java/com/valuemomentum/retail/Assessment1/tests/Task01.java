package com.valuemomentum.retail.Assessment1.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task01 {
	WebDriver driver;
	@BeforeTest
	public void test_beforesuite()
	{
		System.out.println("Before Suite");
        // calling web driver
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
	}
	
	@AfterTest
	public void test_aftersuite()
	{
		System.out.println("After Suite");
		driver.close();
		driver.quit();
	}
	
	//public static void main(String[] args) throws InterruptedException 
	@Test
	public void verifyTask()
	{
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		//driver.findElement(By.id("nav-hamburger-menu")).click();
		//Thread.sleep(5000);
        WebElement hamburger = new WebDriverWait(driver,Duration.ofSeconds(5))
        		.until(ExpectedConditions.elementToBeClickable(By.id("nav-hamburger-menu")));
        hamburger.click();
	
		WebElement menu=driver.findElement(By.id("hmenu-content"));  
		WebElement value = menu.findElement(By.tagName("li"));
	      System.out.println("get value of element : " +value.getText());
	      
	      //elements of elements
		 List<WebElement> value1 = menu.findElements(By.tagName("li"));
		 System.out.println("Size of the elements: "+value1.size());  

		  for(WebElement item : value1)
			 {
				 System.out.println("Menu item value  "+item.getText());
				 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			        try 
			        {
						FileUtils.copyFile(srcFile, new File("C:\\Training\\Testing\\Screenshots\\Task01.png"));
					}
			        catch (IOException e) {
						
						e.printStackTrace();
					}
			 }
		
	}

}

