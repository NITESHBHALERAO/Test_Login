package com.as.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	public String baseurl = "https://user.asians.group/auth/realms/asians/protocol/openid-connect/auth?client_id=public&redirect_uri=https%3A%2F%2Fconsole.uat.asians.group%2F%23%2Fdomain%2Flist&state=92841f3e-654f-45d3-8c56-5bb4ccf0a9f0&response_mode=fragment&response_type=code&scope=openid&nonce=18318a07-4dc9-4055-bd6f-2c61a8fedaf2";
	public String username = "mngr419781";
	public String password = "gedAnUd";
	public static WebDriver driver;	

	@BeforeClass
	public void steup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
