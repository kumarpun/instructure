
package com.sevadevelopment.getbridge.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevadevelopment.getbridge.pageobjects.BridgePageFooter;
import com.sevadevelopment.utility.Browser;
import com.sevadevelopment.utility.TLDriverFactory;

public class TestBridgeFooterLinks extends BaseTest {
	
	@Test(enabled=true)
	public void verifyAccessibilityUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnAccessibilityLink();

		String accessibilityUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(accessibilityUrl);
		Assert.assertEquals(accessibilityUrl, "https://community.bridgeapp.com/docs/DOC-1629");

		// verify accessibility redirected page contents
		String accessibilityRedirectedPage = bridgePageFooter.getTextAccessibilityPage();
		Assert.assertTrue(accessibilityRedirectedPage.contains("Bridge Voluntary Product Accessibility Template"));
		Assert.assertTrue(accessibilityRedirectedPage.contains("Web Content Accessibility Guidelines 2.0"));
	}

	@Test(enabled=true)
	public void verifyPrivacyPolicyUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnPrivacyPolicyLink();
		String accessibilityUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(accessibilityUrl);
		Assert.assertEquals(accessibilityUrl, "https://www.instructure.com/policies/privacy/");

		// verify Privacy Policy redirected page contents
		String privacyPolicyRedirectedPage = bridgePageFooter.getTextPrivacyPolicyPage();
		Assert.assertTrue(privacyPolicyRedirectedPage.contains("Instructure Privacy Policy"));
	}

	@Test(enabled=true)
	public void verifyTermsOfUseUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnTermsOfUse();
		String termsOfUseUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(termsOfUseUrl);
		Assert.assertEquals(termsOfUseUrl, "https://www.getbridge.com/policies/terms-of-use");

		// verify Terms of Use redirected page contents
		String termsOfUsePage = bridgePageFooter.getTextTermsOfUsePage();
		Assert.assertTrue(termsOfUsePage.contains("Terms of Use"));
	}

	@Test(enabled=true)
	public void verifyContactSalesUrl() throws Exception {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		String contactSalesNumber = bridgePageFooter.getContactSalesNumber();
		System.out.println(contactSalesNumber);
		Assert.assertEquals(contactSalesNumber, "tel:+1-877-576-5364");
	}

	@Test(enabled=true)
	public void verifyManagementUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnManagement();
		String managementUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(managementUrl);
		Assert.assertEquals(managementUrl, "https://www.getbridge.com/features/continuous-1%3A1-management");

		// verify management redirected page contents
		String managementRedirectedPage = bridgePageFooter.getTextForCommonClassNamePage();
		Assert.assertTrue(managementRedirectedPage.contains("Continuous 1:1 Management"));
	}

	@Test(enabled=true)
	public void verifyTimelineModuleUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnTimelineModule();
		String timelineModuleUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(timelineModuleUrl);
		Assert.assertEquals(timelineModuleUrl, "https://www.getbridge.com/features/employee-timeline");

		// verify timeline module redirected page contents
		String timelineModuleRedirectedPage = bridgePageFooter.getTextForCommonClassNamePage();
		Assert.assertTrue(timelineModuleRedirectedPage.contains("Employee Timeline"));
	}

	@Test(enabled=true)
	public void verifySkillsAsseessmentUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnSkillsAssessment();
		String skillsAsseessmentUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(skillsAsseessmentUrl);
		Assert.assertEquals(skillsAsseessmentUrl, "https://www.getbridge.com/features/skills-assessment");

		// verify skills management redirected page contents
		String skillsAssessmentRedirectedPage = bridgePageFooter.getTextForCommonClassNamePage();
		Assert.assertTrue(skillsAssessmentRedirectedPage.contains("Skills Assessment"));
	}

	@Test(enabled=true)
	public void verifyGoalsAndTasksUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnGoalsAndTasks();
		String goalsAndTasksUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(goalsAndTasksUrl);
		Assert.assertEquals(goalsAndTasksUrl, "https://www.getbridge.com/features/goals-and-tasks");

		// verify goals and tasks redirected page contents
		String goalsAndTasksRedirectedPage = bridgePageFooter.getTextForCommonClassNamePage();
		Assert.assertTrue(goalsAndTasksRedirectedPage.contains("Goals and Tasks"));
	}

	@Test(enabled=true)
	public void verifyRobustReportingUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnRobustReporting();
		String robustReportingUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(robustReportingUrl);
		Assert.assertEquals(robustReportingUrl, "https://www.getbridge.com/features/robust-reporting");

		// verify robust reporting redirected page contents
		String robustReportingRedirectedPage = bridgePageFooter.getTextForCommonClassNamePage();
		Assert.assertTrue(robustReportingRedirectedPage.contains("Robust Reporting"));
	}

	@Test(enabled=true)
	public void verifyRetainUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnRetain();
		String retainUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(retainUrl);
		Assert.assertEquals(retainUrl, "https://www.getbridge.com/features/retain");

		// verify retain redirected page contents
		String retainRedirectedPage = bridgePageFooter.getTextForCommonClassNamePage();
		Assert.assertTrue(retainRedirectedPage.contains("Retain"));
	}

	@Test(enabled=true)
	public void verifyContentServicesUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnContentServices();
		String contentServicesUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(contentServicesUrl);
		Assert.assertEquals(contentServicesUrl, "https://www.getbridge.com/features/content-services");

		// verify content services redirected page contents
		String contentServicesRedirectedPage = bridgePageFooter.getTextForCommonClassNamePage();
		Assert.assertTrue(contentServicesRedirectedPage.contains("Content Services"));
	}

	@Test(enabled=true)
	public void verifyOffTheShelfCoursesUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnOffTheShelfCourses();
		String offTheShelfCoursesUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(offTheShelfCoursesUrl);
		Assert.assertEquals(offTheShelfCoursesUrl, "https://www.getbridge.com/features/lms-content");

		// verify off the shelf courses redirected page contents
		String offTheShelfCoursesRedirectedPage = bridgePageFooter.getTextForCommonClassNamePage();
		Assert.assertTrue(offTheShelfCoursesRedirectedPage.contains("Off-the-Shelf-Courses"));
	}

	@Test(enabled=true)
	public void verifyArcVideoUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnArcVideo();
		String arcVideoUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(arcVideoUrl);
		Assert.assertEquals(arcVideoUrl, "https://www.getbridge.com/features/arc-video-for-bridge");

		// verify arc video redirected page contents
		String arcVideoRedirectedPage = bridgePageFooter.getTextForCommonClassNamePage();
		Assert.assertTrue(arcVideoRedirectedPage.contains("Arc Video"));
	}

	@Test(enabled=true)
	public void verifyLearnFromYourLearningUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnLearnFromYourLearning();
		String learnFromYourLearningUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(learnFromYourLearningUrl);
		Assert.assertEquals(learnFromYourLearningUrl, "https://www.getbridge.com/features/learn-more");

		// verify learn more redirected page contents
		String learnMoreRedirectedPage = bridgePageFooter.getTextForCommonClassNamePage();
		Assert.assertTrue(learnMoreRedirectedPage.contains("Learn from your Learning"));
	}

	@Test(enabled=true)
	public void verifyManagerDashboardUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnManagerDashboard();
		String managerDashboardUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(managerDashboardUrl);
		Assert.assertEquals(managerDashboardUrl, "https://www.getbridge.com/features/manager-dashboard");

		// verify manager dashboard redirected page contents
		String managerDashboardRedirectedPage = bridgePageFooter.getTextForCommonClassNamePage();
		Assert.assertTrue(managerDashboardRedirectedPage.contains("Manager Dashboard"));
	}

	@Test(enabled=true)
	public void verifyAdminUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnAdmin();
		String adminUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(adminUrl);
		Assert.assertEquals(adminUrl, "https://www.getbridge.com/features/admin-features");

		// verify admin redirected page contents
		String adminRedirectedPage = bridgePageFooter.getTextForCommonClassNamePage();
		Assert.assertTrue(adminRedirectedPage.contains("Admin"));
	}

	@Test(enabled=true)
	public void verifyEasyToUseUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnEasyToUse();
		String easyToUseUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(easyToUseUrl);
		Assert.assertEquals(easyToUseUrl, "https://www.getbridge.com/features/ease-of-use");

		// verify easy to use redirected page contents
		String easyToUseRedirectedPage = bridgePageFooter.getTextForCommonClassNamePage();
		Assert.assertTrue(easyToUseRedirectedPage.contains("Easy to Use, Easy to Love"));
	}

	@Test(enabled=true)
	public void verifyAnytimeAnywhereUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnAnytimeAnywhere();
		String anytimeAnywhereUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(anytimeAnywhereUrl);
		Assert.assertEquals(anytimeAnywhereUrl, "https://www.getbridge.com/features/learn-anywhere");

		// verify anytime anywhere redirected page contents
		String anytimeAnywhereRedirectedPage = bridgePageFooter.getTextForCommonClassNamePage();
		Assert.assertTrue(anytimeAnywhereRedirectedPage.contains("Anytime, Anywhere Learning"));
	}

	@Test(enabled=true)
	public void verifyContactTelephoneEmailAndLocation() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		String contactTelNo = bridgePageFooter.getTextContactTelNo();
		Assert.assertEquals(contactTelNo, "tel:+1877.576.5364");

		String contactEmail = bridgePageFooter.getTextContactEmail();
		Assert.assertEquals(contactEmail, "mailto:info@getbridge.com");

		String contactLocationUrl = bridgePageFooter.getTextContactLocationUrl();
		Assert.assertEquals(contactLocationUrl, "https://goo.gl/maps/zrKJGEnDyhu");

		String contactLocationText1 = bridgePageFooter.getTextContactLocationText1();
		Assert.assertEquals(contactLocationText1, "6630 South 3000 east, Suite 700");

		String contactLocationText2 = bridgePageFooter.getTextContactLocationText2();
		Assert.assertEquals(contactLocationText2, "Salt Lake City, UT 84121");
	}

	@Test(enabled=true)
	public void verifySocialNetworkPagesUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		String fbUrl = bridgePageFooter.getTextFbUrl();
		Assert.assertEquals(fbUrl, "https://www.facebook.com/GetBridge/");

		String twitterUrl = bridgePageFooter.getTextTwitterUrl();
		Assert.assertEquals(twitterUrl, "https://twitter.com/getbridge");

		String youtubeUrl = bridgePageFooter.getTextYoutubeUrl();
		Assert.assertEquals(youtubeUrl, "https://www.youtube.com/user/bridgelms");

		String linkedinUrl = bridgePageFooter.getTextLinkedinUrl();
		Assert.assertEquals(linkedinUrl, "https://www.linkedin.com/showcase/get-bridge/");
	}

	@Test(enabled=true)
	public void verifyBottomSupportTermsUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnSupportTerms();
		String supportTermsUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(supportTermsUrl);
		Assert.assertEquals(supportTermsUrl, "https://www.getbridge.com/support-terms");

		// verify support terms redirected page contents
		String supportTermsRedirectedPage = bridgePageFooter.getTextSupportTermsPage();
		Assert.assertTrue(supportTermsRedirectedPage.contains("Support Terms"));
	}

	@Test(enabled=true)
	public void verifyBottomPrivacyPolicyUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnBottomPrivacyPolicy();
		String bottomPrivacyPolicyUrl = TLDriverFactory.getDriver().getCurrentUrl();
		Assert.assertEquals(bottomPrivacyPolicyUrl, "https://www.instructure.com/policies/privacy/");

		// verify bottom privacy policy redirected page contents
		String privacyPolicyRedirectedPage = bridgePageFooter.getTextBottomPrivacyPolicyPage();
		Assert.assertTrue(privacyPolicyRedirectedPage.contains("Instructure Privacy Policy"));
	}

	@Test(enabled=true)
	public void verifyBottomTermsOfUseUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnBottomTermsOfUse();
		String bottomTermsOfUseUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(bottomTermsOfUseUrl);
		Assert.assertEquals(bottomTermsOfUseUrl, "https://www.getbridge.com/policies/terms-of-use");

		// verify bottom terms of use redirected page contents
		String supportTermsRedirectedPage = bridgePageFooter.getTextBottomTermsOfUsePage();
		Assert.assertTrue(supportTermsRedirectedPage.contains("Terms of Use"));
	}

	@Test(enabled=true)
	public void verifyBottomAccessibilityUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnBottomAccessibility();
		String bottomAccessibilityUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(bottomAccessibilityUrl);
		Assert.assertEquals(bottomAccessibilityUrl, "https://community.bridgeapp.com/docs/DOC-1629");

		// verify bottom accessibility redirected page contents
		String bottomAccessibilityRedirectedPage = bridgePageFooter.getTextBottomAccessibilityPage();
		Assert.assertTrue(
				bottomAccessibilityRedirectedPage.contains("Bridge Voluntary Product Accessibility Template"));
		Assert.assertTrue(bottomAccessibilityRedirectedPage.contains("Web Content Accessibility Guidelines 2.0"));
	}

	@Test(enabled=true)
	public void verifyBottomGDPRUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnBottomGDPR();
		String bottomGDPRUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(bottomGDPRUrl);
		Assert.assertEquals(bottomGDPRUrl, "https://www.getbridge.com/policies/gdpr");

		// verify bottom GDPR redirected page contents
		String bottomGDPRRedirectedPage = bridgePageFooter.getTextBottomGDPRPage();
		Assert.assertTrue(bottomGDPRRedirectedPage.contains("THE GENERAL DATA PROTECTION REGULATION (GDPR)"));
	}

	@Test(enabled=true)
	public void verifyBottomNewsUrl() {
		Browser browser = new Browser(TLDriverFactory.getDriver());
		browser.goToHomePage(homePage);

		BridgePageFooter bridgePageFooter = new BridgePageFooter(TLDriverFactory.getDriver());

		bridgePageFooter.clickOnBottomNews();
		String bottomNewsUrl = TLDriverFactory.getDriver().getCurrentUrl();
		System.out.println(bottomNewsUrl);
		Assert.assertEquals(bottomNewsUrl, "https://www.getbridge.com/news");

		// verify bottom news redirected page contents
		String bottomNewsRedirectedPage = bridgePageFooter.getTextBottomNewsPage();
		Assert.assertTrue(bottomNewsRedirectedPage.contains("Bridge News"));
	}

}
