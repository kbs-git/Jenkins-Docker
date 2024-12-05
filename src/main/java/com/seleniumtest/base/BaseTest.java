package com.seleniumtest.base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.seleniumtest.pages.Execution;

public class BaseTest {
	
	public WebDriver driver;
	public Properties property;
	public Execution execution;
	
	public BaseTest() {
		
		try {
			
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\resources\\config.properties");
			property = new Properties();
			property.load(file);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void initializationDriver(String browser) {
		
		if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new ChromeDriver();
		}
		
		driver.get(property.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(8));
	}
	
	public void terminateDriver() {
		
		driver.quit();
	}

}
