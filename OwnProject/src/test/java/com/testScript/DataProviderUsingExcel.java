package com.testScript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.generic.FileUtils;

public class DataProviderUsingExcel {

	static {
		System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
	}
 WebDriver driver;
	@BeforeClass
	public void open() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
	@Test(dataProvider="dp")
	public void Login(String un, String pwd,String status) {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.linkText("Log out")).click();
		if("valid".equals(status)) {
			
			System.out.println("passed logout yes");
		}
		
	}
	@AfterClass
	public void close() {
		driver.quit();
	}
	@DataProvider(name="dp") //,indices= {0,2,4}) // you can select particular one 
	public String[][] dataprovide() throws InvalidFormatException, IOException {
		/*
		Object data[][]= {
				{"sukesh", "suk@123"},
				{"rajesh", "raj@123"},
				{"eshwar", "eas@123"},
				{"pallavi", "pal@123"},
				{"vanitha", "van@123"},
				{"student", "Password123"},
				{"sukesh", "suk@123"},
	};
	*/
		
		FileUtils fu=new FileUtils();
		
		int rnum = fu.row("Sheet1");
		int cnum = fu.cell("Sheet1");
		
		String Logindata[][]=new String [rnum][cnum];
		
		for(int i=1;i<=rnum;i++) {
			 for(int j=0;j<cnum;j++) {
				 
				 Logindata[i-1][j]=fu.loginData("Sheet1", i, j);
				 
			 }
			}
		return Logindata;
}}

//vedio uploded for doubt "https://www.youtube.com/watch?v=1nP9UlwzpgU"














