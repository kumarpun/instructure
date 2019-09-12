package com.sevadevelopment.getbridge.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage {
    WebDriver driver;

    @FindBy(name = "q")
    WebElement searchBox;

    @FindBy(name = "btnK")
    WebElement googleBtn;


    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements( driver, this);
        System.out.println(this.driver+"OOOOOOOOOOOOO"+driver);

    }


    public String getPageTitle() {
        return driver.getTitle();
    }

    public GoogleResultPage search(String keyWord) {
        System.out.println(searchBox+"YYYYYYYYYYYYYYYYYYYY"+keyWord);
        System.out.println(searchBox.getAttribute("name"));

        (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(searchBox)).sendKeys(keyWord);
        searchBox.sendKeys(Keys.ENTER);

        System.out.println("SEARCH KEYWORD SENT ++++");

        return new GoogleResultPage(driver);
    }
}
