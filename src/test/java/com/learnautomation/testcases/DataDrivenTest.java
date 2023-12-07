package com.learnautomation.testcases;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.ExcelDataProvider;


public class DataDrivenTest extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = ExcelDataProvider.class, priority = 1)
	public void loginDDT(String usernm, String pwd) throws Exception {
		logger = report.createTest("Data driven Test for framework");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterusername(usernm);
		logger.info("user name provided");
		loginPage.enterpassword(pwd);
		logger.info("password provided");
		loginPage.clickonLogin();
		logger.info("login success");
		Thread.sleep(2000);

		if (isAlertPresent() == true) {
			driver.switchTo().alert().accept(); // close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.fail("Login failed");
		} else {
			Assert.assertTrue(true);
			logger.info("Login passed");
			loginPage.clickonLogout();
			Thread.sleep(2000);
			driver.switchTo().alert().accept(); // Close logout alert
			driver.switchTo().defaultContent();
		}
	}

	/*
	 * @Test(priority = 2) public void loginapp1() {
	 * logger=report.createTest("Logout"); logger.fail("Logout failed"); }
	 */

	

	}

