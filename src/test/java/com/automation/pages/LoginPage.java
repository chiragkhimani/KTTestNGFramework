package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.utils.DriverUtils;

public class LoginPage {

	WebDriver driver = DriverUtils.getDriver();

	public void doLogin(String username, String password) {
		WebElement usernameInput = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		usernameInput.sendKeys(username);

		WebElement passwordInput = driver.findElement(By.id("txtPassword"));
		passwordInput.sendKeys(password);

		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();
	}

	public void verifyLoginPage() {
		WebElement usernameInput = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement passwordInput = driver.findElement(By.id("txtPassword"));

		System.out.println(usernameInput.isDisplayed());
		System.out.println(passwordInput.isDisplayed());

	}

	public void verifyInvalidLoginError() {
		WebElement invalidLoginError = driver.findElement(By.id("spanMessage"));
		System.out.println(invalidLoginError.isDisplayed());
	}

}
