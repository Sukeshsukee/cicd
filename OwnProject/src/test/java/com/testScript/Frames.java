package com.testScript;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Frames {
	static {
		System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
	}

	@Test 
	public void open() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("hello");
		WebElement frame=driver.findElement(By.id("frm1"));
		driver.switchTo().frame(frame);
		WebElement drop = driver.findElement(By.id("selectnav1"));
		Select s=new Select(drop);
		s.selectByIndex(7);
		driver.switchTo().parentFrame();
		WebElement frame2 = driver.findElement(By.id("frm2"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.id("firstName")).sendKeys("Sukesh");
		driver.quit();
		
		
}}
