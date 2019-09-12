package com.sevadevelopment.utility;

import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenerateTestReport {

	private static ExtentReports extent;
	private static ExtentTest logger;

	public GenerateTestReport(WebDriver driver) {
		super();
		extent = new ExtentReports("src/test/resources/extentReport.html", true);
		PageFactory.initElements(driver, this);
	}

	public void startReport(String browser, Method method) {
		logger = extent.startTest(method.getName() + "-In-" + browser + "-" + Thread.currentThread().getId());
	}

	public void getReport(String browser, ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(LogStatus.FAIL, "In " + browser + " browser, failed test case is " + result.getName());
			logger.log(LogStatus.FAIL, "In " + browser + " browser, failed test case error is " + result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(LogStatus.SKIP, "In " + browser + " browser, skipped test case is " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(LogStatus.PASS, "In " + browser + " browser, passed test case is " + result.getName());
		}
		extent.endTest(logger);
	}

	public void flushReport() {
		extent.addSystemInfo("Host Name", "Bridge Testing").addSystemInfo("Environment", "Automation Testing")
				.addSystemInfo("User Name", "Pravin Ray")
				.addSystemInfo("OS Architecture", System.getProperty("os.arch"));
		extent.loadConfig(new File("src/test/resources/extent-config.xml"));
		extent.flush();
//		extent.close();
	}
}
