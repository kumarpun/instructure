package com.sevadevelopment.getbridge.tests;

import static org.testng.Assert.assertTrue;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.sevadevelopment.getbridge.pageobjects.VideoPlayerHelper;
import com.sevadevelopment.utility.Browser;
import com.sevadevelopment.utility.TLDriverFactory;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestVideoPlayerDemo extends BaseTest {

	@Test(description = "To verify video source is available")
	public void verifyVideoSourceIsAvailable() throws Exception {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		VideoPlayerHelper videoPlayerHelper = new VideoPlayerHelper(TLDriverFactory.getDriver());

		String videoId = videoPlayerHelper.getTextWistiaVideoId();
		System.out.println("WISTIA-VIDEO-ID: " + videoId);

		RestAssured.baseURI = "https://fast.wistia.net/embed/iframe/" + videoId;
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get();

		String contentType = response.header("Content-Type");
		System.out.println("Header body response type: " + contentType);

		assertTrue(contentType.contains("text/html"));

	}
}
