package com.testScript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {
	static {
		System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
	}
	
	@Test
	public void assertTest() throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.get("https://www.sudo.ws/");
		String text = driver.findElement(By.id("what-is-sudo")).getText();
		SoftAssert as=new SoftAssert();
		AssertJUnit.assertEquals(text, "What is Sudo?");
		
		as.assertAll();
	//	-------
		/*
		WebElement src = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
		WebElement target = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("droppable")));
		Actions a=new Actions(driver) ;
			a.dragAndDrop(src, target).perform();
	*/
		//--------
		
		/*
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Alert']"))).click();
		
		Reporter.log(driver.switchTo().alert().getText(),true);
		driver.switchTo().alert().accept();
		driver.close();
		*/
		
		//--------
		/*
		WebElement wb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("slider")));
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		a.dragAndDropBy(wb, 40, 0).perform();  */
		
		
		
		
		
		
	}

	
}
