package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	@FindBy(id = "welcome")
	WebElement userIcon;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logoutLink;

	@FindBy(id = "menu_pim_viewPimModule")
	WebElement pimMenu;

	@FindBy(id = "menu_pim_addEmployee")
	WebElement addEmployeeLink;

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
		Assert.assertTrue("user icon is not present on homepage", userIcon.isDisplayed());

	}

	public void selectAddEmployeeFromPIMMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(pimMenu).pause(1000).click(addEmployeeLink).build().perform();
	}

}
