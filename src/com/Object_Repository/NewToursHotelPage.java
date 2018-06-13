package com.Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Initialize_WebDriver.StartWebDriver;

public class NewToursHotelPage extends StartWebDriver
{
	public static WebElement hotel = driver.findElement(By.linkText("Hotels"));
	
}
