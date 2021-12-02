package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement usernameInput;

	@FindBy(id = "txtPassword")
	WebElement passwordInput;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	@FindBy(id = "spanMessage")
	WebElement invalidLoginError;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void doLogin(String username, String password) {
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		loginBtn.click();
	}

	public void verifyLoginPage() {
		System.out.println(usernameInput.isDisplayed());
		System.out.println(passwordInput.isDisplayed());
	}

	public void verifyInvalidLoginError() {
		System.out.println(invalidLoginError.isDisplayed());
	}

}
