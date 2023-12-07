package com.learnautomation.testcases;

import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.ChangePasswordPage;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.ExcelDataProvider;

public class ChangePasswordTest extends BaseClass {

	@Test(dataProvider = "ChangePassword", dataProviderClass = ExcelDataProvider.class)
	public void Changepassword(String old, String newpwd, String confirm) throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApp("mngr515502", "ydYhEqA");

		ChangePasswordPage changePassword = new ChangePasswordPage(driver);

		changePassword.clickOnChangePassword();
		changePassword.enterOldpassword(old);
		changePassword.enterNewpassword(newpwd);
		changePassword.enterConfirmpassword(confirm);

		changePassword.ClickOnSubmit();

	}
}
