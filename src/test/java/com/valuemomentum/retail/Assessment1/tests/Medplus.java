package com.valuemomentum.retail.Assessment1.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.support.ui.Select;

public class Medplus {
	WebDriver driver;
	JavascriptExecutor js;
	@BeforeTest
	public void test_beforesuite()
	{
		System.out.println("Before Suite");
        // calling web driver
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
         js = (JavascriptExecutor) driver;
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
	public void verify()
	{
        
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        driver.get("https://www.medplusmart.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try 
        {
			FileUtils.copyFile(srcFile, new File("C:\\Training\\Java\\Assessment1\\sshot\\image.png"));
		}
        catch (IOException e) {
			
			e.printStackTrace();
		}
       
        
        
        
       // WebElement category=driver.findElement(By.xpath("(//*[text()='Health Store'])[2]"));
        WebElement category = new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Health Store'])[2]")));
        
        Actions action=new Actions(driver);
        action.moveToElement(category).perform();
        File healthSs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try 
        {
			FileUtils.copyFile(healthSs, new File("C:\\Training\\Java\\Assessment1\\sshot\\image1.png"));
		}
        catch (IOException e) {
			
			e.printStackTrace();
		}
       
     
        //WebElement personalCare=driver.findElement(By.xpath("(//a[@title='Personal Care'])"));
        WebElement personalCare = new WebDriverWait(driver,Duration.ofSeconds(5))
        		.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title='Personal Care'])")));
        
        System.out.println(personalCare.getText());
        personalCare.click();
        
        
        File personalCareSs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try 
        {
			FileUtils.copyFile(personalCareSs, new File("C:\\Training\\Java\\Assessment1\\sshot\\image2.png"));
		}
        catch (IOException e) 
        {
			
			e.printStackTrace();
		}
        System.out.println("Title: "+driver.getTitle());
        
       
       
        //selecting oral care
       // WebElement oralCare=driver.findElement(By.linkText("Oral Care"));
        //WebElement oralCare=driver.findElement(By.xpath("(//a[@title='Oral Care'])[2]"));
        WebElement oralCare = new WebDriverWait(driver,Duration.ofSeconds(5))
        		.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title='Oral Care'])[2]")));

        System.out.println(oralCare.getText());
        oralCare.click();
        System.out.println("Title: "+driver.getTitle());
        File oralCareSs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try 
        {
			FileUtils.copyFile(oralCareSs, new File("C:\\Training\\Java\\Assessment1\\sshot\\image3.png"));
		}
        catch (IOException e) 
        {
			
			e.printStackTrace();
		}
       
        
        //Select Toothpaste & powder
        //WebElement toothPaste=driver.findElement(By.xpath("(//a[@title='Tooth Paste & Powder'])[2]"));
        WebElement toothPaste = new WebDriverWait(driver,Duration.ofSeconds(5))
        		.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title='Tooth Paste & Powder'])[2]")));
        
        System.out.println(toothPaste.getText());
        toothPaste.click();
        File toothCareSs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try 
        {
			FileUtils.copyFile(toothCareSs, new File("C:\\Training\\Java\\Assessment1\\sshot\\image4.png"));
		}
        catch (IOException e) 
        {
			
			e.printStackTrace();
		}
        System.out.println("Title: "+driver.getTitle());
        
       
        
        WebElement slider = driver.findElement(By.xpath("//*[@class='slider-selection']")); 
                       
        
         action.clickAndHold(slider);
         action.moveByOffset(-45, 0).build().perform();
         driver.findElement(By.xpath("(//*[@class='slider-handle round'])[2]")).click();
         File sliderSs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         try 
         {
 			FileUtils.copyFile(sliderSs, new File("C:\\Training\\Java\\Assessment1\\sshot\\image5.png"));
 		}
         catch (IOException e) 
         {
 			
 			e.printStackTrace();
 		}
        		 
      
         
         //scroll page
         js.executeScript("window.scrollBy(0,250)");
         
       
         
         //select dropdown
         driver.findElement(By.linkText("140 grams")).click();
        
         //change to 70gms
         driver.findElement(By.linkText("70 grams - Rs 55.00")).click();
        
         //Add to cart
         driver.findElement(By.xpath("(//*[text()='Add to Cart'])[2]")).click();
         File firstProductSs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         try 
         {
 			FileUtils.copyFile(firstProductSs, new File("C:\\Training\\Java\\Assessment1\\sshot\\image6.png"));
 		}
         catch (IOException e) 
         {
 			
 			e.printStackTrace();
 		}
         
       
         
         
         //Second Item
         driver.findElement(By.linkText("150 grams")).click();
         
         //change to 80gms
         driver.findElement(By.linkText("80 grams - Rs 50.00")).click();
         
         //Add to cart
         driver.findElement(By.xpath("(//*[text()='Add to Cart'])[6]")).click();
         File secondProductSs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         try 
         {
 			FileUtils.copyFile(secondProductSs, new File("C:\\Training\\Java\\Assessment1\\sshot\\image7.png"));
 		}
         catch (IOException e) 
         {
 			
 			e.printStackTrace();
 		}
         
         
         //driver.findElement(By.cssSelector("#miniCartDiv")).click();
        //driver.findElement(By.id("miniCartDiv")).click();
         
         WebElement cart = new WebDriverWait(driver,Duration.ofSeconds(5))
         		.until(ExpectedConditions.elementToBeClickable(By.id("miniCartDiv")));
         cart.click();
         
        File cartSs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try 
        {
			FileUtils.copyFile(cartSs, new File("C:\\Training\\Java\\Assessment1\\sshot\\image8.png"));
		}
        catch (IOException e) 
        {
			
			e.printStackTrace();
		}
         
         
       //comparing 70 g
         WebElement element1 = driver.findElement(By.xpath("(//*[@class='productName'])[1]"));
         WebElement element2 = driver.findElement(By.xpath("(//*[@class='col-sm-6 col-md-6'])[1]"));
         String strng1 = element1.getText();
         String strng2 = element2.getText();
         System.out.println(strng1);
        boolean retVal1 = strng1.equals(strng2);
        System.out.println(retVal1);
        
       
        //comparing 80g
        WebElement element3 = driver.findElement(By.xpath("(//*[@class='productName'])[3]"));
        WebElement element4 = driver.findElement(By.xpath("(//*[@class='col-sm-6 col-md-6'])[2]"));
        String strng3 = element3.getText();
        String strng4 = element4.getText();
        System.out.println(strng3);
       boolean retVal2 = strng3.equals(strng4);
       System.out.println(retVal2);
         
       
         //driver.findElement(By.id("pharmaCheckOutBtn")).click();
         
         WebElement fCart = new WebDriverWait(driver,Duration.ofSeconds(5))
         		.until(ExpectedConditions.elementToBeClickable(By.id("pharmaCheckOutBtn")));
         
         fCart.click();
         
         File checkoutSs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         try 
         {
 			FileUtils.copyFile(checkoutSs, new File("C:\\Training\\Java\\Assessment1\\sshot\\image9.png"));
 		}
         catch (IOException e) 
         {
        	 			e.printStackTrace();
 		}
         
         
         System.out.println("Title : "+driver.getTitle());
       
         
        
     
	}

	

}
