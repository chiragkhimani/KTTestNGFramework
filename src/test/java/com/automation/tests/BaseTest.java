package com.automation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.pages.AddEmployeePage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.ViewPersonDetailsPage;
import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;

public class BaseTest {

	LoginPage login;
	HomePage home;
	AddEmployeePage addEmployeePage;
	ViewPersonDetailsPage viewPersonalDetailPage;

	@BeforeMethod
	public void setUp() {
		PropertyReader.initProperty();
		DriverUtils.createDriver();
		login = new LoginPage();
		home = new HomePage();
		addEmployeePage = new AddEmployeePage();
		viewPersonalDetailPage = new ViewPersonDetailsPage();
	}

	@AfterMethod
	public void cleanUp() {
		DriverUtils.getDriver().close();
	}
}
