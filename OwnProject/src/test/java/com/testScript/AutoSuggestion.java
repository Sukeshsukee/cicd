package com.testScript;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
	}

	@Test
	public void open() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"s-suggestion-container\"]"));
	
		for(int i=0;i<list.size();i++) {
			
			WebElement hh = list.get(i);
			Reporter.log(hh.getText(),true);
			
			
		}
		
		
		
		
		}
		
		
	
}
