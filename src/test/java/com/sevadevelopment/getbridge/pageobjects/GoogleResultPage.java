package com.sevadevelopment.getbridge.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleResultPage {


    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a[1]")
    WebElement googleLink;

    @FindBy(id = "mainContent")
    WebElement seleniumText;



    public GoogleResultPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }


    public void click_First_Link(){
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(googleLink)).click();

    }

    public String getSeleniumText(){
        return  (new WebDriverWait(driver, 20)).until(ExpectedConditions.visibilityOf(seleniumText)).getText();
    }




}
