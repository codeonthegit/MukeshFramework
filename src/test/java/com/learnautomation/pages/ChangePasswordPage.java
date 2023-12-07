package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage {
	
	WebDriver driver;

	public ChangePasswordPage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="//a[text()=\"Change Password\"]") WebElement clickOnchpassword;
	
	@FindBy(name="oldpassword") WebElement oldpass;
	
	@FindBy(name="newpassword") WebElement newpass;
	
	@FindBy(name="confirmpassword") WebElement confirmpass;
	
	@FindBy(name="sub") WebElement submitbutton;
	
	public void clickOnChangePassword()
	{
		clickOnchpassword.click();
	}
	
	public void enterOldpassword(String oldnm)
	{
		oldpass.sendKeys(oldnm);
	}
	
	public void enterNewpassword(String Newnm)
	{
		newpass.sendKeys(Newnm);
	}
	
	public void enterConfirmpassword(String Confirmpass)
	{
		confirmpass.sendKeys(Confirmpass);
	}
	public void ClickOnSubmit()
	{
		submitbutton.click();
	}
	

}
