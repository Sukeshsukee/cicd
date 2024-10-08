package com.testScript;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ModalWindowDilogueBox {
	static {
		System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
	}

	@Test
	public void open() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/selenium/practice/modal-dialogs.php");
		driver.findElement(By.xpath("//a[text()=\" Modal Dialogs\"]")).click();
		driver.findElement(By.xpath("//button[.=\"Small Modal\"]")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-primary'])[3]"))).click();
}
}