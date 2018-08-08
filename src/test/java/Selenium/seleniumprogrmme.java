package Selenium;

import java.util.List;
import java.util.Set;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class seleniumprogrmme {
	
	
	WebDriver driver;
	
	
  @Test
	public void Test()
	{
		WebDriver driver = new FirefoxDriver();
		/*driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		String parent  =     driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(5000);
		
		driver.findElement(By.name("New Message Window")).click();
		
		  Set<String>   allhandle        =         driver.getWindowHandles();
		
		    for(String child:allhandle)
		    {
		    	if(!parent.equalsIgnoreCase(child))
		    		
		    	{
		    		driver.switchTo().window(child);
		    		driver.close();
		    	}
		    }*/
		 
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		// This step will result in an alert on screen
		WebElement element = driver.findElement(By.xpath("//*[@id='content']/p[11]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
 
		Alert confirmationAlert = driver.switchTo().alert();
		String alertText = confirmationAlert.getText();
		System.out.println("Alert text is " + alertText);
		confirmationAlert.accept();
	}

}
