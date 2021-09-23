package com.qa.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Launch extends DemoTest {

	@Test
	public void LaunchBrowser() throws InterruptedException

	{
		System.out.print("\nLaunch\n");
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samsung Galaxy S10");
		driver.findElement(By.xpath("//div[@class='_2hriZF _2rbIyg']//div//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
		//driver.findElement(By.xpath("//input[@type='checkbox' and @class='_30VH1S'][1]//following-sibling::div[@class='_24_Dny _3tCU7L']")).click();
//		WebElement element = driver.findElement(By.xpath("//input[@type='checkbox' and @class='_30VH1S'][1]//following-sibling::div[@class='_24_Dny _3tCU7L']"));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//div[text()='SAMSUNG']//preceding-sibling::div")).click();
//		driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
		Thread.sleep(5000);
		List<WebElement> myList=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		System.out.println("\n----SIZE--\n"+myList.size());
	     for (int i = 1; i <= myList.size(); i++)
	     {
	        String text = driver.findElement(By.xpath("(//div[@class='_4rR01T'])["+ i +"]")).getText();
	    	System.out.print(text);
	     }
		Thread.sleep(5000);
		
	}


}
