package com.testScript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generic.BaseClass;
import com.generic.POM;


@Listeners(com.generic.TakingScreenShot.class)

public class TestClass extends BaseClass {
	
	
	@Test (invocationCount = 2, dependsOnMethods = "loginn2") 
	public void loginn() throws InvalidFormatException, IOException {
		
		Reporter.log("started",true);
		POM pm=new POM(driver);
		pm.login();
		Reporter.log("executed",true);
		

	} 
	@Test(invocationCount = 3)
	public void loginn2() throws InvalidFormatException, IOException {
		
		Reporter.log("started",true);
		POM pm=new POM(driver);
		pm.login();
		Reporter.log("executed",true);
		
		
		

	} 

}
