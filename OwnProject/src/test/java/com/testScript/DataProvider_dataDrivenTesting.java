package com.testScript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.generic.FileUtils;

public class DataProvider_dataDrivenTesting {	
 WebDriver driver;
      @Parameters({"browser"}) @BeforeClass
	 void open(String br) {
		if(br.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else {
			System.out.println("error");
		}
}
	@Test
	public void login() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.quit();
		System.out.println("sucess");}}

/*	WebDriver driver;
	@Parameters({"browser"})
	@BeforeClass
	 void setup(String br) {
		
		if(br.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "/Users/avsukesh/Downloads/edgedriver_mac64/msedgedriver");
			  driver=new EdgeDriver();
			  driver.get("https://practicetestautomation.com/practice-test-login/");
		
		}
		else if(br.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
			  driver=new ChromeDriver();
			  driver.get("https://practicetestautomation.com/practice-test-login/");
}
	}
	@Test
	public void ogin() {
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		
	}
}
*/





















