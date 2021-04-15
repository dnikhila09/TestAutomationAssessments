package com.valuemomentum.retail.Assessment1.tests;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.valuemomentum.retail.Assessment1.utils.BaseTest;

public class WebDriverHelper extends BaseTest {
    static WebDriver driver;
   
    public static void captureScreenshot(String methodName) {
		File srcfile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("C:\\Training\\Java\\Assessment1\\screenshot\\SmokeTest.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public static void switchToWindow()
	{
		String currentWindow = getDriver().getWindowHandle();
		Set<String> windows = getDriver().getWindowHandles();
		Iterator<String> ite = windows.iterator();
		while(ite.hasNext())
		{
			String newWindow = ite.next();
			if(!currentWindow.equals(newWindow))
			{
				getDriver().switchTo().window(newWindow);				
			}
		}
	}
		
	
}
