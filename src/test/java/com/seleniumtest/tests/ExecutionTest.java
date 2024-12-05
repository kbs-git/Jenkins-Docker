package com.seleniumtest.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.seleniumtest.base.BaseTest;
import com.seleniumtest.pages.Execution;

public class ExecutionTest extends BaseTest{
	
	@BeforeClass
	public void start() {
		
		initializationDriver(property.getProperty("browser"));
	}
	
	@Test
	public void verifyLoginTest() {
		
		execution = new Execution(driver);
		execution.verifyLogin();
	}
	
	@AfterClass
	public void end() {
		
		terminateDriver();
	}
	
	

}
