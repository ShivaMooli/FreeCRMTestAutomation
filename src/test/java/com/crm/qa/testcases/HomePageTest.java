package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.Base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	 LoginPage loginPage;
	 HomePage homePage;
	public HomePageTest() {
		super();
	}
	
	 @BeforeMethod
	 public void setup() {
		  initialization();
		  loginPage = new LoginPage();
		 loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		 
		 homePage =  new HomePage();
		  
	 }
	 
	 @Test(priority=1)
	 public void homePageTitleTest() {
		 String title = homePage.verifyHomePageTitle();
		 System.out.println(title);
		 Assert.assertEquals(title, "My Account");
	 }
	 
	 @AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }
	 

}
