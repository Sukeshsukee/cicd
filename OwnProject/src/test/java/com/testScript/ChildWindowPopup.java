package com.testScript;

import org.testng.annotations.Test;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ChildWindowPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
	}

	@Test
	public void open() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.id("newWindowBtn")).click();
		System.out.println("--------------------------------");
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
	
		for(String hk:child){
		if(!hk.equals(parent)) {
			driver.switchTo().window(hk);
		driver.findElement(By.id("selectnav2")).click();
		
		}	}  
	}
}