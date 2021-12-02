package com.automation.tests;

import org.testng.annotations.Test;

import com.automation.utils.PropertyReader;

public class LogoutTest extends BaseTest {

	@Test
	public void verifyUserCanAbleToLogout() {
		login.doLogin(PropertyReader.getProperty("login.username"), PropertyReader.getProperty("login.password"));
		home.verifyHomePage();
		home.clickOnUserIcon();
		home.clickOnLogoutLink();
		login.verifyLoginPage();
	}

}
