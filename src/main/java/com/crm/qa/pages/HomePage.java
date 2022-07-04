package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.Base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[text()='Desktops']")
	WebElement desktopLink;
	
	@FindBy(xpath="Laptops & Notebooks")
	WebElement LaptopsNotebooksLink;
	
	@FindBy(xpath="//a[text()='Components']")
	WebElement ComponentsLink;
	
	@FindBy(xpath="//a[text()='Tablets']")
	WebElement TabletsLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		
		return driver.getTitle();
		
	}
	
	public DesktopPage clickOnDesktopLink() {
		desktopLink.click();
		return new DesktopPage();
	}
	
	public TabletsPage clickOnTabletsLink() {
		desktopLink.click();
		return new TabletsPage();
	}
	

}
