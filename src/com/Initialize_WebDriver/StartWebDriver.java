package com.Initialize_WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class StartWebDriver
{

	public static WebDriver driver;
	
	@BeforeMethod
	public static void beforeMethod()
	{
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
		
		System.setProperty("webdriver.gecko.driver", "E:\\Automation Softwares\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	@AfterMethod
	public static void afterMethod()
	{
		driver.close();
	}

}
