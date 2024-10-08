package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	@BeforeClass
	public void demo() {
		Reporter.log("baseclass",true);
	}
}
