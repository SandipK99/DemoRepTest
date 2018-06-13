package com.Business_Functions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Initialize_WebDriver.StartWebDriver;
import com.Object_Repository.NewToursSignUpPage;
import com.TestData.TestData;

public class NewToursUserSignUp 
{

	public static void userSignUpValidation() throws IOException
	{
		
		TestData td = new TestData("C:\\Users\\Dell\\Desktop\\NewToursSignUpTestData.xlsx");
		
		for(int i=1;i<=td.getLastRowNumber();i++)
		{
			
		NewToursSignUpPage.getStaleElement();	
			
		NewToursSignUpPage.uname.sendKeys(td.getStringData(i, 0));		
		NewToursSignUpPage.lname.sendKeys(td.getStringData(i, 1));
		NewToursSignUpPage.phone.sendKeys(td.getNumericData(i, 2));
		NewToursSignUpPage.email.sendKeys(td.getStringData(i, 3));
		
		NewToursSignUpPage.adddress.sendKeys(td.getStringData(i, 4));
		NewToursSignUpPage.city.sendKeys(td.getStringData(i, 5));
		NewToursSignUpPage.state.sendKeys(td.getStringData(i, 6));
		NewToursSignUpPage.pcode.sendKeys(td.getNumericData(i, 7));
		NewToursSignUpPage.country.sendKeys(td.getStringData(i, 8));
		
		NewToursSignUpPage.username.sendKeys(td.getStringData(i, 9));
		NewToursSignUpPage.userpassword.sendKeys(td.getStringData(i, 10));
		NewToursSignUpPage.cnfpassword.sendKeys(td.getStringData(i, 11));
		
		NewToursSignUpPage.submitt_btn.click();
		
		WebDriverWait wait = new WebDriverWait(StartWebDriver.driver,20);		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[@valign='top']//a//b")));


		StartWebDriver.driver.navigate().back();
		
	//	NewToursSignUpPage.getStaleElement();
		}
	}
	
}
