package com.crm.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	 FileInputStream fis;
	public TestBase() {
	 prop = new Properties();
	
	try {
		fis = new FileInputStream("C:\\Users\\shiva\\eclipse-workspace\\FreeCRMTestAutomation\\src\\main\\java\\com\\crm\\qa\\config\\conig.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		try {
			prop.load(fis);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		
		String browserName= prop.getProperty("browser");
		if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/shiva/Downloads/chromedriver_win32 (13)/chromedriver.exe");
		driver = new ChromeDriver();
		}
			
		if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecho.driver", "C:/Users/shiva/Downloads/gechodriver.exe");
			driver = new ChromeDriver();
			}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}
