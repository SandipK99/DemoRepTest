package com.Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Initialize_WebDriver.StartWebDriver;

public class NewToursSignUpPage extends StartWebDriver
{	
	
	
	public static WebElement uname ;// = driver.findElement(By.name("firstName"));
	public static WebElement lname ; // = driver.findElement(By.name("lastName"));
	public static WebElement phone ; // = driver.findElement(By.name("phone"));
	public static WebElement email; // = driver.findElement(By.name("userName"));
	
	public static WebElement adddress ;// = driver.findElement(By.name("address1"));
	public static WebElement city ;// = driver.findElement(By.name("city"));
	public static WebElement state ;//= driver.findElement(By.name("state"));
	public static WebElement pcode ;//= driver.findElement(By.name("postalCode"));
	
	public static WebElement country ;//= driver.findElement(By.name("country"));	//Select DropDown
	
	public static WebElement username ;//= driver.findElement(By.name("email"));
	public static WebElement userpassword ;//= driver.findElement(By.name("password"));
	public static WebElement cnfpassword ;//= driver.findElement(By.name("confirmPassword"));
	
	public static WebElement submitt_btn ;//= driver.findElement(By.name("register"));	//Submit Button	
	
	public static void getStaleElement()
	{
		uname = driver.findElement(By.name("firstName"));
		lname = driver.findElement(By.name("lastName"));
		phone = driver.findElement(By.name("phone"));
		email = driver.findElement(By.name("userName"));
		adddress = driver.findElement(By.name("address1"));
		city = driver.findElement(By.name("city"));
		state = driver.findElement(By.name("state"));
		pcode = driver.findElement(By.name("postalCode"));
		country = driver.findElement(By.name("country"));
		username = driver.findElement(By.name("email"));
		userpassword = driver.findElement(By.name("password"));
		cnfpassword = driver.findElement(By.name("confirmPassword"));
		submitt_btn = driver.findElement(By.name("register"));
	}
	
}
