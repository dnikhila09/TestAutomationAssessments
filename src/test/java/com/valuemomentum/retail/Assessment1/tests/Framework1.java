package com.valuemomentum.retail.Assessment1.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Framework1 extends WebDriverHelper {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		this.driver =  getDriver();
	}
	
	@Test(priority=1,enabled=true)
	public void verify()
	{
        
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.medplusmart.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try 
        {
			FileUtils.copyFile(srcFile, new File("C:\\Training\\Java\\Assessment1\\screenshot\\image1.png"));
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
			FileUtils.copyFile(healthSs, new File("C:\\Training\\Java\\Assessment1\\screenshot\\image2.png"));
		}
        catch (IOException e) {
			
			e.printStackTrace();
		}
       
       //Personal care
        //WebElement personalCare=driver.findElement(By.xpath("(//a[@title='Personal Care'])"));
        WebElement personalCare = new WebDriverWait(driver,Duration.ofSeconds(5))
        		.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title='Personal Care'])")));
        
        System.out.println(personalCare.getText());
        personalCare.click();
        
        
        File personalCareSs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try 
        {
			FileUtils.copyFile(personalCareSs, new File("C:\\Training\\Java\\Assessment1\\screenshot\\image3.png"));
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
			FileUtils.copyFile(oralCareSs, new File("C:\\Training\\Java\\Assessment1\\screenshot\\image4.png"));
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
			FileUtils.copyFile(toothCareSs, new File("C:\\Training\\Java\\Assessment1\\screenshot\\image5.png"));
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
 			FileUtils.copyFile(sliderSs, new File("C:\\Training\\Java\\Assessment1\\screenshot\\image6.png"));
 		}
         catch (IOException e) 
         {
 			
 			e.printStackTrace();
 		}
        		 
      
         
       
       
         
         //select dropdown
         driver.findElement(By.linkText("140 grams")).click();
        
         //change to 70gms
         driver.findElement(By.linkText("70 grams - Rs 55.00")).click();
        
         //Add to cart
         driver.findElement(By.xpath("(//*[text()='Add to Cart'])[2]")).click();
         File firstProductSs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         try 
         {
 			FileUtils.copyFile(firstProductSs, new File("C:\\Training\\Java\\Assessment1\\screenshot\\image7.png"));
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
 			FileUtils.copyFile(secondProductSs, new File("C:\\Training\\Java\\Assessment1\\screenshot\\image8.png"));
 		}
         catch (IOException e) 
         {
 			
 			e.printStackTrace();
 		}
         
          
         //mini cart
         WebElement cart = new WebDriverWait(driver,Duration.ofSeconds(5))
         		.until(ExpectedConditions.elementToBeClickable(By.id("miniCartDiv")));
         cart.click();
         
        File cartSs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try 
        {
			FileUtils.copyFile(cartSs, new File("C:\\Training\\Java\\Assessment1\\screenshot\\image9.png"));
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
 			FileUtils.copyFile(checkoutSs, new File("C:\\Training\\Java\\Assessment1\\screenshot\\image10.png"));
 		}
         catch (IOException e) 
         {
 			
 			e.printStackTrace();
 		}
         
         
         System.out.println("Title : "+driver.getTitle());
       
       
	}
	@Test(priority=2,enabled=true)
	public void verifyTask()
	{
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		//driver.findElement(By.id("nav-hamburger-menu")).click();
		//Thread.sleep(5000);
        WebElement hamburger = new WebDriverWait(driver,Duration.ofSeconds(5))
        		.until(ExpectedConditions.elementToBeClickable(By.id("navbtn_tutorials")));
        hamburger.click();
	
		WebElement menu=driver.findElement(By.id("nav_tutorials"));  
		WebElement value = menu.findElement(By.tagName("a"));
	      System.out.println("get value of element : " +value.getText());
	      
	      //elements of elements
		 List<WebElement> value1 = menu.findElements(By.tagName("a"));
		 System.out.println("Size of the elements: "+value1.size());  

		  for(WebElement item : value1)
			 {
				 System.out.println("Menu item value  "+item.getText());
				 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			        try 
			        {
						FileUtils.copyFile(srcFile, new File("C:\\Training\\Java\\Assessment1\\screenshot\\Task01.png"));
					}
			        catch (IOException e) {
						
						e.printStackTrace();
					}
			 }
		
	}


}
