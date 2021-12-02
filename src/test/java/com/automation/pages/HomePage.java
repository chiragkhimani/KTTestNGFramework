package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	@FindBy(id = "welcome")
	WebElement userIcon;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logoutLink;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnUserIcon() {
		userIcon.click();
	}

	public void clickOnLogoutLink() {
		logoutLink.click();
	}

	public void verifyHomePage() {
		System.out.println(userIcon.isDisplayed());
	}

}
