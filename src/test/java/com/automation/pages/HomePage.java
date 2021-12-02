package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.utils.DriverUtils;

public class HomePage {

	WebDriver driver = DriverUtils.getDriver();
	
	public void clickOnUserIcon() {
		WebElement userIcon = driver.findElement(By.id("welcome"));
		userIcon.click();
	}

	public void clickOnLogoutLink() {
		WebElement logoutLink = driver.findElement(By.xpath("//a[text()='Logout']"));
		logoutLink.click();
	}

	public void verifyHomePage() {
		WebElement userIcon = driver.findElement(By.id("welcome"));
		System.out.println(userIcon.isDisplayed());
	}

}
