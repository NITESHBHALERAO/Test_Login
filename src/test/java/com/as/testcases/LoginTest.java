package com.as.testcases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.as.pages.LoginPage;



public class LoginTest extends Base{

	@Test
	public void loginApp() throws InterruptedException 
	{
		
		driver.get(baseurl);
		
		LoginPage lp = new LoginPage(driver);
		lp.setusername(username);
		lp.setPassword(password);
		lp.clickLoginbutton();
		
		Thread.sleep(2000);

	}
}
