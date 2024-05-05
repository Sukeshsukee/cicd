package com.testScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.generic.BaseClass;
import com.generic.POM;

public class CrossBrowserTesting{
	 
	WebDriver driver;
	
	@Parameters("browser")
  @Test 
  public void browser(String browsername) throws InvalidFormatException, IOException {
	  
	  if(browsername.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
	 driver= new ChromeDriver();
	 
	  }
	  else if (browsername.equalsIgnoreCase("edge")) {
		  System.setProperty("webdriver.edge.driver", "/Users/avsukesh/Downloads/edgedriver_mac64/msedgedriver");
		  driver=new EdgeDriver();
	  }
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://practice.expandtesting.com/login");
		 driver.findElement(By.id("username")).sendKeys("practice");
		 driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		 System.out.println(driver.getTitle());
		 driver.findElement(By.xpath("//button[text()='Login']")).click();
		 driver.findElement(By.xpath("//a[text()='Home']")).click();
		 System.out.println(driver.getTitle());
		  
		  
	}
	  
  
}
