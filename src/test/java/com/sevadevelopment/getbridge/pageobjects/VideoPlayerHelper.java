package com.sevadevelopment.getbridge.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VideoPlayerHelper extends BasePageObject {

	@FindBy(className = "paragraph-play-button")
	WebElement getWistiaVideoId;

	public VideoPlayerHelper(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

		System.out.println(this.driver + "OOOOOOOOOOOOO" + driver);
	}

	public String getTextWistiaVideoId() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getWistiaVideoId)).getAttribute("data-wistiaid");
	}
}
