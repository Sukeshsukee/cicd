package com.testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class NewTest {
	WebDriver driver;
	@Parameters("browsers")
  @Test
  public void chrome(String browsername) {
	 if(browsername.equalsIgnoreCase("chrome")) {
		 System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
		 driver= new ChromeDriver();
	 }
	 else if(browsername.equalsIgnoreCase("edge")) {
		 System.setProperty("webdriver.edge.driver", "/Users/avsukesh/Downloads/edgedriver_mac64/msedgedriver");
		  driver=new EdgeDriver();
	 }
	 
	 driver.get("https://google.com");
	  
  }
  
}
