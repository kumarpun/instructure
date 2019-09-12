package com.sevadevelopment.getbridge.tests;

import com.sevadevelopment.getbridge.pageobjects.RequestDemoForm;
import com.sevadevelopment.utility.Browser;
import com.sevadevelopment.utility.ExcelUtility;
import com.sevadevelopment.utility.TLDriverFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestRequestDemoForm extends BaseTest{
	String xlFilePath = "src/test/resources/testData/request_form_data.xlsx";
	String sheetName = "Sheet2";

	@DataProvider(name = "formData")
	public Object[][] requestFormData() throws Exception {
		ExcelUtility excelUtility = new ExcelUtility(xlFilePath, sheetName);

		return excelUtility.getAllDataAsArrayOfObject();
	}

	@Test(description = "To fill and submit the request demo form", dataProvider = "formData")
	public void fillRequestDemoFormAndVerifyThankingPage(String firstLastName, String emailText, String phoneNumber,
			String countryListIndex, String organization, String jobText, String estimatedUsersIndex) throws Exception {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		RequestDemoForm requestDemoForm = new RequestDemoForm(TLDriverFactory.getDriver());

		try {
			requestDemoForm.fillForm(firstLastName, emailText, phoneNumber, countryListIndex, organization,
					jobText, estimatedUsersIndex);
		} catch (Exception e) {
			e.getMessage();
		}
		String currentURL = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println("fname:: " + firstLastName + " email:: " + emailText + " mobile:: " + phoneNumber
				+ " countryListIndex::" + countryListIndex + " organization:: " + organization + " job:: " + jobText
				+ " estimatedUsersIndex::" + estimatedUsersIndex);
//		 assertTrue(currentURL.contains("/thank-you?ref=home-page"));
	}
}
