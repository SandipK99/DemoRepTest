package com.Test_Scripts;

import org.testng.annotations.Test;

import com.Test_Scripts.SignOnTest;

import com.Business_Functions.NewToursSignOff;
import com.Initialize_WebDriver.StartWebDriver;

public class SingOffTest extends StartWebDriver
{
	
	@Test()
	public static void userLogOffValidation()
	{
		SignOnTest.userLoginValidation();
		
		NewToursSignOff.userSignOff();
	}
}
