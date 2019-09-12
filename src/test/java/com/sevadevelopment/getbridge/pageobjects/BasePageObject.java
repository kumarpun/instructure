package com.sevadevelopment.getbridge.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject {
	WebDriver driver;
	WebDriverWait webDriverWait;

	public BasePageObject(WebDriver driver) {
		System.out.println("BASEPAGEOBJECT CONSTRUCTOR DRIVER = "+driver);
		this.driver = driver;
		webDriverWait = new WebDriverWait(driver, 20);
	}
	
}