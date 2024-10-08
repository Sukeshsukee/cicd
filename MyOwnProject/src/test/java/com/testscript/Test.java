package com.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Test {

	/*static {
		System.setProperty("webdriver.chrome.driver", "\\Users\\suges\\OneDrive\\Documents\\Web\\MyOwnProject\\Driver\\chromedriver (2).exe");
	}*/
	
	static {
		System.setProperty("webdriver.chrome.driver","\\Users\\suges\\OneDrive\\Documents\\Web\\MyOwnProject\\Driver\\chromedriver.exe");
	}
	WebDriver driver;
	@org.testng.annotations.Test
	public void log() throws InterruptedException {
		WebDriver driver=new ChromeDriver() ;
				
			driver.get("https://www.selenium.dev/");
			System.out.println("testexecuted");
			driver.quit();
		}
	
}
