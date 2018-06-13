package com.Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Initialize_WebDriver.StartWebDriver;

public class NewTours_SignOnPage extends StartWebDriver
{
	
//	 public static WebElement signon = driver.findElement(By.linkText("SIGN-ON"));
	 public static WebElement username = driver.findElement(By.name("userName"));
	 public static WebElement upwd = driver.findElement(By.name("password"));
	 public static WebElement submit = driver.findElement(By.name("login"));	 
	 
	// 

}
