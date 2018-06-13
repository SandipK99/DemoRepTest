package com.Test_Scripts;

import org.testng.annotations.Test;

import com.Business_Functions.NewToursLogin;
import com.Initialize_WebDriver.StartWebDriver;


public class SignOnTest extends StartWebDriver
{

	@Test
	public static void userLoginValidation()    
	{
		NewToursLogin.userLoginOnHomePage("tutorial", "tutorial");		
		
		NewToursLogin.userLoginVerify();
	}
	
}
