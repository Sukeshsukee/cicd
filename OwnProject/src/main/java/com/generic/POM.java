package com.generic;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {

	@FindBy(id="username")
	public WebElement un;
	
	@FindBy(id="password")
	public WebElement pwd;
	
	@FindBy(id="submit")
	public WebElement submit;
	
	@FindBy(xpath="//a[text()='Log out']")
	public WebElement logout;
	
	public POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void login() throws InvalidFormatException, IOException {
		FileUtils ls=new FileUtils();
		String unn = ls.loginData("Sheet1", 0, 1);
		String pww = ls.loginData("Sheet1", 1, 1);
		un.sendKeys(unn);
		pwd.sendKeys(pww);
		submit.click();
	}
	public void logout() {
		logout.click();
	}
}
