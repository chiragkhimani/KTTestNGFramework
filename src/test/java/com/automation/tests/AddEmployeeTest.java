package com.automation.tests;

import org.testng.annotations.Test;

import com.automation.utils.PropertyReader;

public class AddEmployeeTest extends BaseTest {

	@Test(groups = {"Smoke","Arpita"})
	public void verifyUserCanAbleToAddEmployee() {
		login.doLogin(PropertyReader.getProperty("login.username"), PropertyReader.getProperty("login.password"));
		home.verifyHomePage();
		home.selectAddEmployeeFromPIMMenu();
		addEmployeePage.enterFirstName();
		addEmployeePage.enterLastName();
		addEmployeePage.clickOnSaveBtn();
		viewPersonalDetailPage.verifyEmployeeDetailsOnPersonalDetailsPage();
	}

	@Test(groups = {"Regression"})
	public void verifyErrorForMissingFirstNameValue() {
		login.doLogin(PropertyReader.getProperty("login.username"), PropertyReader.getProperty("login.password"));
		home.verifyHomePage();
		home.selectAddEmployeeFromPIMMenu();
		addEmployeePage.enterLastName();
		addEmployeePage.clickOnSaveBtn();
		addEmployeePage.verifyErrorForMissingFirstNameValue();
	}

}
