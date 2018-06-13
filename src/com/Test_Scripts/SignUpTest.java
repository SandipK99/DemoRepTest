package com.Test_Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Business_Functions.NewToursRegisterLink;
import com.Business_Functions.NewToursUserSignUp;
import com.Initialize_WebDriver.StartWebDriver;

public class SignUpTest extends StartWebDriver
{

	@Test
	public static void signUpClick() throws InterruptedException, IOException
	{
		NewToursRegisterLink.registerLinkClick();
		
		Thread.sleep(5000);
		
		NewToursUserSignUp.userSignUpValidation();
	}
	
}
