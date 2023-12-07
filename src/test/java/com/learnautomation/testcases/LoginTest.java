package com.learnautomation.testcases;

import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void loginApp() throws Exception {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApp("mngr515502", "ydYhEqA");

	}

}
