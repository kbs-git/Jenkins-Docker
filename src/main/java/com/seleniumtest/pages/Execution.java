package com.seleniumtest.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.seleniumtest.base.BaseTest;

public class Execution extends BaseTest{
	
	public Execution(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	public WebElement username;
	
	@FindBy(id="pass")
	public WebElement password;
	
	@FindBy(id="loginbutton")
	public WebElement loginBtn;
	
	public void verifyLogin() {
		
		username.sendKeys(property.getProperty("username"));
		password.sendKeys(property.getProperty("password"));
		loginBtn.click();
	}

}
