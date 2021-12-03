package com.automation.tests;

import org.testng.annotations.Test;

import com.automation.utils.PropertyReader;

public class LoginTest extends BaseTest {

	@Test(groups = {"Smoke","Chirag"})
	public void verifyUserCanAbleToLogin() {
		login.doLogin(PropertyReader.getProperty("login.username"), PropertyReader.getProperty("login.password"));
		home.verifyHomePage();
	}

	@Test(groups = {"Regression","Chirag"})
	public void verifyUserCannotAbleToLoginWithInvalidCred() {
		login.doLogin("antwan", "admin123");
		login.verifyInvalidLoginError();
	}

}
