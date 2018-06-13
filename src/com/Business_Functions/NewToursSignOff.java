package com.Business_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Object_Repository.NewToursSignOffPage;
import com.Object_Repository.NewTours_SignOnPage;

public class NewToursSignOff 
{
	
	public static void userSignOff()
	{
		NewToursSignOffPage.signoff.click();
		
		WebDriverWait wait = new WebDriverWait(NewTours_SignOnPage.driver,20);		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[@valign='top']//a[contains(text(),'registration')]")));
	}

}
