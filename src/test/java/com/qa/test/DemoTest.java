package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoTest {


	String folderPath = System.getProperty("user.dir");
	String driverLocation = folderPath + "\\src\\test\\resources\\driver\\chromedriver.exe";
	static WebDriver driver;


	@BeforeSuite
	public void intilaise() {
		System.out.print("Before\n");
		System.out.print("\n-----LOCATION----"+driverLocation);
		System.setProperty("webdriver.chrome.driver", driverLocation);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}



	@AfterTest

	public void close()

	{
		driver.close();
		driver.quit();
	}


}
