
package com.sevadevelopment.getbridge.tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevadevelopment.getbridge.pageobjects.BridgePageTopNav;
import com.sevadevelopment.utility.Browser;
import com.sevadevelopment.utility.TLDriverFactory;

public class TestBridgeTopNavLinks extends BaseTest{
	HttpURLConnection huc = null;
	int respCode = 200;

	//@Test
	public void checkAlllinks() {
		String url;

        Browser browser = new Browser(TLDriverFactory.getDriver());
        browser.goToHomePage(homePage);

        System.out.println("starting test checkAllLinks =====");
		List<WebElement> links = TLDriverFactory.getDriver().findElements(By.tagName("a"));
		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {
			url = it.next().getAttribute("href");

			if (url == null || url.isEmpty()) {
				System.out.println(url);
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}

			if (!url.startsWith(homePage)) {
				System.out.println(url);
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}

			try {
				huc = (HttpURLConnection) (new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				respCode = huc.getResponseCode();

				Assert.assertEquals(respCode, 200);

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Test
	public void verifyProductTabInTopNav() {
	    System.out.println("##verifyProductTabInTopNav##");

        Browser browser = new Browser(TLDriverFactory.getDriver());
        browser.goToHomePage(homePage);

		BridgePageTopNav bridgePageTopNav = new BridgePageTopNav(TLDriverFactory.getDriver());

        System.out.println("#### PAGEOBJECT INITIALIZED ####");

		// hover on tab and verify its contents
		bridgePageTopNav.hoverOnProductTab();
		String popUpTitle = bridgePageTopNav.getTextProductPopUpTitle();

		Assert.assertTrue(popUpTitle.contains("Explore the Bridge Suite"));

		String popUpOptions = bridgePageTopNav.getTextProductPopUpOptions();

		Assert.assertTrue(popUpOptions.contains("LEARN"));
		Assert.assertTrue(popUpOptions.contains("PERFORM"));
		Assert.assertTrue(popUpOptions.contains("PRACTICE"));

		// click on tab and verify the redirected page URL and contents
		bridgePageTopNav.clickOnProductTab();
		String productUrl = TLDriverFactory.getDriver().getCurrentUrl();

		Assert.assertEquals(productUrl, "https://www.getbridge.com/products");

		String productPageTitle = bridgePageTopNav.getTextProductPageTitle();

		Assert.assertEquals(productPageTitle, "The Bridge Suite");
	}

	@Test
	public void verifySolutionsUrl() {
        Browser browser = new Browser(TLDriverFactory.getDriver());
        browser.goToHomePage(homePage);

        BridgePageTopNav bridgePageTopNav = new BridgePageTopNav(TLDriverFactory.getDriver());

		bridgePageTopNav.hoverOnSolutionsTab();
		String popUpOptions1 = bridgePageTopNav.getTextSolutionsPopUpOptions1();
		String popUpOptions2 = bridgePageTopNav.getTextSolutionsPopUpOptions2();

		Assert.assertTrue(popUpOptions1.contains("BRIDGE FOR"));
		Assert.assertTrue(popUpOptions2.contains("USE CASES"));

		bridgePageTopNav.clickOnSolutionsLink();
		String solutionsUrl = TLDriverFactory.getDriver().getCurrentUrl();

		Assert.assertEquals(solutionsUrl, "https://www.getbridge.com/solutions");

		String solutionPageTitle =bridgePageTopNav.getTextSolutionsPageTitle();

		Assert.assertEquals(solutionPageTitle, "Bridge Software Solutions");
	}

	@Test
	public void verifyCustomerStoriesUrl() {
        System.out.println("##verifyCustomerStoriesUrl##");

        Browser browser = new Browser(TLDriverFactory.getDriver());
        browser.goToHomePage(homePage);

		BridgePageTopNav bridgePageTopNav = new BridgePageTopNav(TLDriverFactory.getDriver());

        System.out.println("#### PAGEOBJECT INITIALIZED ####");

		bridgePageTopNav.hoverOnCustomerStoriesTab();
		String popUpOptions1 = bridgePageTopNav.getTextCustomerStoriesPopUpOptions1();
		String popUpOptions2 = bridgePageTopNav.getTextCustomerStoriesPopUpOptions2();
		String popUpOptions3 = bridgePageTopNav.getTextCustomerStoriesPopUpOptions3();

		Assert.assertTrue(popUpOptions1.contains("Movement Mortgage surmounts"));
		Assert.assertTrue(popUpOptions2.contains("With Bridge, SafetyNow"));
		Assert.assertTrue(popUpOptions3.contains("Clemson University set"));

		bridgePageTopNav.clickOnCustomerStoriesLink();
		String customerStoriesUrl = TLDriverFactory.getDriver().getCurrentUrl();

		Assert.assertEquals(customerStoriesUrl, "https://www.getbridge.com/customer-stories");

		String customerStoriesPageTitle = bridgePageTopNav.getTextCustomerStoriesPageTitle();
		Assert.assertEquals(customerStoriesPageTitle, "Bridge Customer Success Stories");
	}

	@Test
	public void verifyResourcesUrl() {
        System.out.println("##verifyResourcesUrl##");

        Browser browser = new Browser(TLDriverFactory.getDriver());
        browser.goToHomePage(homePage);

		BridgePageTopNav bridgePageTopNav = new BridgePageTopNav(TLDriverFactory.getDriver());

        System.out.println("#### PAGEOBJECT INITIALIZED ####");

		bridgePageTopNav.hoverOnResourcesTab();
		String popUpOptions1 = bridgePageTopNav.getTextResourcesPopUpOptions1();
		String popUpOptions2 = bridgePageTopNav.getTextResourcesPopUpOptions2();
		String popUpOptions3 = bridgePageTopNav.getTextResourcesPopUpOptions3();

		Assert.assertTrue(popUpOptions1.contains("LEARNING CENTER"));
		Assert.assertTrue(popUpOptions2.contains("EVENTS"));
		Assert.assertTrue(popUpOptions3.contains("ADDITIONAL RESOURCES"));

		bridgePageTopNav.clickOnResourcesLink();
		String resourcesUrl = TLDriverFactory.getDriver().getCurrentUrl();

		Assert.assertEquals(resourcesUrl, "https://www.getbridge.com/resources");
		String resourcesPageTitle = bridgePageTopNav.getTextResourcesPageTitle();

		Assert.assertEquals(resourcesPageTitle, "Bridge Resources");
	}

	@Test
	public void verifyAboutUrl() {
        System.out.println("##verifyAboutUrl##");

        Browser browser = new Browser(TLDriverFactory.getDriver());
        browser.goToHomePage(homePage);

		BridgePageTopNav bridgePageTopNav = new BridgePageTopNav(TLDriverFactory.getDriver());

		bridgePageTopNav.hoverOnAboutTab();
		String popUpOptions1 = bridgePageTopNav.getTextAboutPopUpOptions1();
		String popUpOptions2 = bridgePageTopNav.getTextAboutPopUpOptions2();
		String popUpOptions3 = bridgePageTopNav.getTextAboutPopUpOptions3();
		String popUpOptions4 = TLDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"about-page\"]/div/div[4]/div/a/h3")).getText();

		Assert.assertTrue(popUpOptions1.contains("WHO WE ARE"));
		Assert.assertTrue(popUpOptions2.contains("WORK WITH US"));
		Assert.assertTrue(popUpOptions3.contains("LEADERSHIP"));
		Assert.assertTrue(popUpOptions4.contains("NEWS & PRESS RELEASES"));

		bridgePageTopNav.clickOnAboutLink();
		String aboutUrl = TLDriverFactory.getDriver().getCurrentUrl();

		Assert.assertEquals(aboutUrl, "https://www.getbridge.com/about");

		String aboutPageTitle = bridgePageTopNav.getTextAboutPageTitle();

        System.out.println("#### PAGEOBJECT INITIALIZED ####");

		Assert.assertEquals(aboutPageTitle, "About Bridge");
	}

	@Test
	public void verifyBlogUrl() {
        System.out.println("##verifyBlogUrl##");

        Browser browser = new Browser(TLDriverFactory.getDriver());
        browser.goToHomePage(homePage);

		BridgePageTopNav bridgePageTopNav = new BridgePageTopNav(TLDriverFactory.getDriver());

		System.out.println("#### PAGEOBJECT INITIALIZED ####");

		bridgePageTopNav.clickOnBlogLink();
		String blogUrl = TLDriverFactory.getDriver().getCurrentUrl();

		Assert.assertEquals(blogUrl, "https://www.getbridge.com/blog");
	}

	@Test
	public void verifyBookADemoUrl() {
        System.out.println("##verifyBookADemoUrl##");

        Browser browser = new Browser(TLDriverFactory.getDriver());
        browser.goToHomePage(homePage);

		BridgePageTopNav bridgePageTopNav = new BridgePageTopNav(TLDriverFactory.getDriver());

		System.out.println("#### PAGEOBJECT INITIALIZED ####");

		bridgePageTopNav.clickOnBookADemoLink();
		String bookADemoUrl = TLDriverFactory.getDriver().getCurrentUrl();

		Assert.assertEquals(bookADemoUrl, "https://www.getbridge.com/demo");

		String bookADemoPageTitle = bridgePageTopNav.getTextBookADemoPageTitle();

		Assert.assertEquals(bookADemoPageTitle, "What’s your type?");
	}
}
