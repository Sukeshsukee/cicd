package crssBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_using_Parameter {

	WebDriver driver;
	@Parameters({"browser"})
	@BeforeClass
	 void setup(String br) {
		
		if(br.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "/Users/avsukesh/Downloads/edgedriver_mac64/msedgedriver");
			  driver=new EdgeDriver();
			  driver.get("https://practicetestautomation.com/practice-test-login/");
		
		}
		else if(br.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
			  driver=new ChromeDriver();
			  driver.get("https://practicetestautomation.com/practice-test-login/");
}
	}
	@Test
	public void ogin() {
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		
	}
}
