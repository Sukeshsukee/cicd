package com.generic;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		org.testng.Reporter.log("opening browser",true);

	}
	@BeforeMethod
	public void beforeMethod() throws InvalidFormatException, IOException {
		
		FileUtils ls=new FileUtils();
		String website = ls.loginData("Sheet1", 3, 0);
		driver.get(website);
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='login-as-test-user app-button app-button-primary']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='app-button app-button-primary']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Skip']"))).click();
		org.testng.Reporter.log("ihmCartWheel_logged_in",true);
		
	}
	@AfterMethod
	public void afterMethod() {
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-e2e='ready-to-checkout-button']"))).click();
		org.testng.Reporter.log("ihmCartWheel_checkout",true);
	}
		@AfterClass
		public void closeBrowser() {
			
			
			driver.quit();
			org.testng.Reporter.log("closing Shopping window ",true);
		}
	}


