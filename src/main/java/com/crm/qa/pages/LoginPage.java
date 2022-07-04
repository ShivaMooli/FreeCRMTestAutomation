package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.Base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement loginBtn;
	
	
	@FindBy(xpath="//img[contains(@class, 'img-responsive')]")
	WebElement logo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateImage() {
		
		return logo.isDisplayed();
		
	}
	
	public HomePage login(String mail, String pass) {
		
		email.sendKeys(mail);
		password.sendKeys(pass);
		loginBtn.click();
		
		return new HomePage();
		
		
		
	}


	
	
}
