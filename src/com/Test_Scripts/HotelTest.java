package com.Test_Scripts;

import org.testng.annotations.Test;

import com.Business_Functions.NewToursHotel;
import com.Initialize_WebDriver.StartWebDriver;

public class HotelTest extends StartWebDriver
{

	@Test
	public static void hotelClickCheck()
	{
		NewToursHotel.hotelClick();
	}
	
}
