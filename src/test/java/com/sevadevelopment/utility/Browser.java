package com.sevadevelopment.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
    WebDriver driver;

    public Browser(WebDriver driver){
        this.driver = driver;
    }

    public void goToHomePage(String url){
        WebDriverWait wait = TLDriverFactory.getWait(driver);
        driver.navigate().to(url);
    }

    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver getDriver(){
        return this.driver;
    }
}
