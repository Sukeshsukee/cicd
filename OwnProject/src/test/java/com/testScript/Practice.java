package com.testScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Practice {
	static {
		System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
	}
  @Test
  public void sample() throws AWTException, InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();

	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	  WebDriverWait wait=new WebDriverWait(driver, 5);
	  
	  
	  Actions a=new Actions(driver);
	  Thread.sleep(2000);
	  WebElement src = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("View larger")));
	  Thread.sleep(2000);
	  WebElement target = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("trash")));
	  Thread.sleep(2000);
	  a.dragAndDrop(src, target).perform();
	  
	  driver.close();
	  
	
	  
	  
	  }
}	

	  
	  
  
