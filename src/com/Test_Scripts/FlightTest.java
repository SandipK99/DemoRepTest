package com.Test_Scripts;

import org.testng.annotations.Test;

import com.Business_Functions.NewToursFlight;
import com.Initialize_WebDriver.StartWebDriver;

public class FlightTest extends StartWebDriver
{
	@Test(enabled=false)
	public static void flightLinkCheck()
	{
		NewToursFlight.flightClick();
	}

}
