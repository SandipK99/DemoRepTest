package com.Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Initialize_WebDriver.StartWebDriver;

public class NewToursSignOffPage extends StartWebDriver
{

	public static WebElement signoff = driver.findElement(By.linkText("SIGN-OFF"));	
	
}
