package com.Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Initialize_WebDriver.StartWebDriver;

public class NewToursRegisterLinkPage extends StartWebDriver
{
	public static WebElement reglink = driver.findElement(By.linkText("REGISTER"));	//Register Link
}
