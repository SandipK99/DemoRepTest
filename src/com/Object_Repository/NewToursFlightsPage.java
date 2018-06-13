package com.Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Initialize_WebDriver.StartWebDriver;

public class NewToursFlightsPage extends StartWebDriver
{

	public static WebElement flight = driver.findElement(By.linkText("Flights"));
	
}
