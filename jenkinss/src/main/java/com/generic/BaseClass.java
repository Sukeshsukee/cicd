package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "\\Users\\suges\\OneDrive\\Documents\\Web\\jenkinss\\Driver\\chromedriver.exe");
	}
 WebDriver driver;
 
 @BeforeClass
 public void open() {
	 
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.youtube.com/");
	 driver.quit();
	 
 }
}
