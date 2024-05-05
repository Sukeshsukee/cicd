package com.generic;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import jdk.javadoc.doclet.Reporter;


public class BaseClass {

	static {
		System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
	}
	
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		org.testng.Reporter.log("open browser",true);

	}
	@BeforeMethod
	public void beforeMethod() {
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		org.testng.Reporter.log("Entering URL",true);
	}
	@AfterMethod
	public void afterMethod() {
		POM pm=new POM(driver);
		pm.logout();
		org.testng.Reporter.log("logout",true);

	}
		@AfterClass
		public void closeBrowser() {
			
			
			driver.quit();
			org.testng.Reporter.log("closing ",true);
		}
	}


