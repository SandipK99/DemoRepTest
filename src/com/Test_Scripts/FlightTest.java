package com.Test_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Business_Functions.NewToursFlight;
import com.Initialize_WebDriver.StartWebDriver;

public class FlightTest extends StartWebDriver
{
	@Test(enabled=true)
	public static void flightLinkCheck()
	{
		//Assert.assertTrue(false);
		
		NewToursFlight.flightClick();
	}

}
