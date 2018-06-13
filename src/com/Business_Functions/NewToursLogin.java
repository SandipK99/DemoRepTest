package com.Business_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Object_Repository.NewToursSignOffPage;
import com.Object_Repository.NewTours_SignOnPage;

public class NewToursLogin 
{

	public static void userLoginOnHomePage(String UN,String UPWD)
	{
		
		
	//	NewTours_SignOnPage.signon.click();		
		NewTours_SignOnPage.username.sendKeys(UN);
		NewTours_SignOnPage.upwd.sendKeys(UPWD);
		NewTours_SignOnPage.submit.click();
		
		WebDriverWait wait = new WebDriverWait(NewTours_SignOnPage.driver,20);		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SIGN-OFF")));		
		
	}
	
	public static void userLoginVerify()
	{
		String exp = "SIGN-OFF";		
		Assert.assertEquals(NewToursSignOffPage.signoff.getText(), exp);
		
		System.out.println("in userLoginVerify method assert executed");
	} 

}
