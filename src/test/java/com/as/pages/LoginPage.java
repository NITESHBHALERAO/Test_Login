package com.as.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver ldriver)
	{
		ldriver = ldriver;
		PageFactory.initElements(ldriver, this); 
	}
	
	@FindBy(name="username") WebElement uname;
	@FindBy(name="password") WebElement pass;
	@FindBy(name="login") WebElement loginbutton;
	
	public void setusername(String username) {
		uname.sendKeys(username);
	}
	
	public void setPassword(String password1) {
		
		pass.sendKeys(password1);
	}
	
	public void clickLoginbutton() {
		loginbutton.click();
	}
}
