package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(name = "uid")
	WebElement uname;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(name = "btnLogin")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[text()=\"Log out\"]")
	WebElement logoutButton;

	public void loginToApp(String usernameApp, String passwordApp) throws Exception {
		Thread.sleep(2000);
		uname.sendKeys(usernameApp);
		pass.sendKeys(passwordApp);
		loginButton.click();

	}
	
	public void enterusername(String username)
	{
		uname.sendKeys(username);
	}
	
	public void enterpassword(String pwd)
	{
		pass.sendKeys(pwd);
	}
	
	public void clickonLogin()
	{
		loginButton.click();
	}
	
	public void clickonLogout()
	{
		logoutButton.click();
	}
}
