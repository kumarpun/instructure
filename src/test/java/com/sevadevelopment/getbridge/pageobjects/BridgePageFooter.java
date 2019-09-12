package com.sevadevelopment.getbridge.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BridgePageFooter extends BasePageObject {

	@FindBy(className = "feature-title")
	WebElement getElementForCommonClassName;

	@FindBy(xpath = "//*[@id=\"footer-top-links\"]/div/a[1]")
	WebElement accessibility;

	@FindBy(xpath = "//*[@id=\"jive-body-main\"]/div[2]")
	WebElement getTextAccessibility;

	@FindBy(xpath = "//*[@id=\"footer-top-links\"]/div/a[2]")
	WebElement privacyPolicy;

	@FindBy(xpath = "//*[@id=\"spotMtext\"]/div[1]")
	WebElement getTextPrivacyPolicy;

	@FindBy(xpath = "//*[@id=\"footer-top-links\"]/div/a[3]")
	WebElement termsOfUse;

	@FindBy(className = "PRtitle2")
	WebElement getTextTermsOfUsePage;

	@FindBy(xpath = "//*[@id=\"footer-top-links\"]/div/a[4]")
	WebElement getContactSalesNumber;

	@FindBy(xpath = "//*[@id=\"features\"]/div/a[1]")
	WebElement management;

	@FindBy(xpath = "//*[@id=\"block-mainpagecontent-2\"]/section/section[1]/div/div[1]")
	WebElement getTextManagement;

	@FindBy(xpath = "//*[@id=\"features\"]/div/a[2]")
	WebElement timelineModule;

	@FindBy(xpath = "//*[@id=\"features\"]/div/a[3]")
	WebElement skillsAssessment;

	@FindBy(xpath = "//*[@id=\"features\"]/div/a[4]")
	WebElement goalsAndTasks;

	@FindBy(xpath = "//*[@id=\"features\"]/div/a[5]")
	WebElement robustReporting;

	@FindBy(xpath = "//*[@id=\"features\"]/div/a[6]")
	WebElement retain;

	@FindBy(xpath = "//*[@id=\"features\"]/div/a[7]")
	WebElement contentServices;

	@FindBy(xpath = "//*[@id=\"features\"]/div/a[8]")
	WebElement offTheShelfCourses;

	@FindBy(xpath = "//*[@id=\"features\"]/div/a[9]")
	WebElement arcVideo;

	@FindBy(xpath = "//*[@id=\"features\"]/div/a[10]")
	WebElement learnFromYourLearning;

	@FindBy(xpath = "//*[@id=\"features\"]/div/a[11]")
	WebElement managerDashboard;

	@FindBy(xpath = "//*[@id=\"features\"]/div/a[12]")
	WebElement admin;

	@FindBy(xpath = "//*[@id=\"features\"]/div/a[13]")
	WebElement easyToUse;

	@FindBy(xpath = "//*[@id=\"features\"]/div/a[14]")
	WebElement anytimeAnywhere;

	@FindBy(xpath = "//*[@id=\"footer-phone\"]/a")
	WebElement getContactTelNo;

	@FindBy(xpath = "//*[@id=\"footer-email\"]/a")
	WebElement getContactEmail;

	@FindBy(xpath = "//*[@id=\"footer-address\"]/a")
	WebElement getContactLocationUrl;

	@FindBy(xpath = "//*[@id=\"footer-address\"]/a/text()[1]")
	WebElement getContactLocationText1;

	@FindBy(xpath = "//*[@id=\"footer-address\"]/a/text()[2]")
	WebElement getContactLocationText2;

	@FindBy(xpath = "//*[@id=\"footer-social-icons\"]/a[1]")
	WebElement getFbUrl;

	@FindBy(xpath = "//*[@id=\"footer-social-icons\"]/a[2]")
	WebElement getTwitterUrl;

	@FindBy(xpath = "//*[@id=\"footer-social-icons\"]/a[3]")
	WebElement getYoutubeUrl;

	@FindBy(xpath = "//*[@id=\"footer-social-icons\"]/a[4]")
	WebElement getLinkedInUrl;

	@FindBy(xpath = "//*[@id=\"footer-legal-links\"]/div/a[1]")
	WebElement supportTerms;

	@FindBy(xpath = "//*[@id=\"support-body-text\"]/div/div[1]/h3")
	WebElement getTextSupportTerms;

	@FindBy(xpath = "//*[@id=\"footer-legal-links\"]/div/a[2]")
	WebElement bottomPrivacyPolicy;

	@FindBy(id = "spotMtext")
	WebElement getTextBottomPrivacyPolicy;

	@FindBy(xpath = "//*[@id=\"footer-legal-links\"]/div/a[3]")
	WebElement bottomTermsOfUse;

	@FindBy(className = "PRtitle2")
	WebElement getTextBottomTermsOfUse;

	@FindBy(xpath = "//*[@id=\"footer-legal-links\"]/div/a[4]")
	WebElement bottomAccessibility;

	@FindBy(xpath = "//*[@id=\"jive-body-main\"]/div[2]")
	WebElement getTextBottomAccessibility;

	@FindBy(xpath = "//*[@id=\"footer-legal-links\"]/div/a[5]")
	WebElement bottomGDPR;

	@FindBy(xpath = "//*[@id=\"jive-body-main\"]/div[2]")
	WebElement getTextBottomGDPR;

	@FindBy(xpath = "//*[@id=\"main\"]/h2[1]")
	WebElement bottomNews;

	@FindBy(xpath = "//*[@id=\"main\"]/h2[1]")
	WebElement getTextBottomNews;

	public BridgePageFooter(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50000)", "");
		System.out.println(this.driver + "OOOOOOOOOOOOO" + driver);
	}

	public String getTextForCommonClassNamePage() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getElementForCommonClassName)).getText();
	}

	public void clickOnAccessibilityLink() {
		webDriverWait.until(ExpectedConditions.visibilityOf(accessibility)).click();
	}

	public String getTextAccessibilityPage() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getTextAccessibility)).getText();
	}

	public void clickOnPrivacyPolicyLink() {
		webDriverWait.until(ExpectedConditions.visibilityOf(privacyPolicy)).click();
	}

	public void clickOnTermsOfUse() {
		webDriverWait.until(ExpectedConditions.visibilityOf(termsOfUse)).click();
	}

	public String getTextTermsOfUsePage() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getTextTermsOfUsePage)).getText();
	}

	public String getContactSalesNumber() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getContactSalesNumber)).getAttribute("href");
	}

	public void clickOnManagement() {
		webDriverWait.until(ExpectedConditions.visibilityOf(management)).click();
	}

	public String getTextManagementPage() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getTextManagement)).getText();
	}

	public void clickOnTimelineModule() {
		webDriverWait.until(ExpectedConditions.visibilityOf(timelineModule)).click();
	}

	public void clickOnSkillsAssessment() {
		webDriverWait.until(ExpectedConditions.visibilityOf(skillsAssessment)).click();
	}

	public void clickOnGoalsAndTasks() {
		webDriverWait.until(ExpectedConditions.visibilityOf(goalsAndTasks)).click();
	}

	public void clickOnRobustReporting() {
		webDriverWait.until(ExpectedConditions.visibilityOf(robustReporting)).click();
	}

	public void clickOnRetain() {
		webDriverWait.until(ExpectedConditions.visibilityOf(retain)).click();
	}

	public void clickOnContentServices() {
		webDriverWait.until(ExpectedConditions.visibilityOf(contentServices)).click();
	}

	public void clickOnOffTheShelfCourses() {
		webDriverWait.until(ExpectedConditions.visibilityOf(offTheShelfCourses)).click();
	}

	public void clickOnArcVideo() {
		webDriverWait.until(ExpectedConditions.visibilityOf(arcVideo)).click();
	}

	public void clickOnLearnFromYourLearning() {
		webDriverWait.until(ExpectedConditions.visibilityOf(learnFromYourLearning)).click();
	}

	public void clickOnManagerDashboard() {
		webDriverWait.until(ExpectedConditions.visibilityOf(managerDashboard)).click();
	}

	public void clickOnAdmin() {
		webDriverWait.until(ExpectedConditions.visibilityOf(admin)).click();
	}

	public void clickOnEasyToUse() {
		webDriverWait.until(ExpectedConditions.visibilityOf(easyToUse)).click();
	}

	public void clickOnAnytimeAnywhere() {
		webDriverWait.until(ExpectedConditions.visibilityOf(anytimeAnywhere)).click();
	}

	public String getTextPrivacyPolicyPage() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getTextPrivacyPolicy)).getText();
	}

	public String getTextContactTelNo() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getContactTelNo)).getAttribute("href");
	}

	public String getTextContactEmail() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getContactEmail)).getAttribute("href");
	}

	public String getTextContactLocationUrl() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getContactLocationUrl)).getAttribute("href");
	}

	public String getTextContactLocationText1() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getContactLocationText1)).getText();
	}

	public String getTextContactLocationText2() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getContactLocationText2)).getText();
	}

	public String getTextFbUrl() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getFbUrl)).getAttribute("href");
	}

	public String getTextTwitterUrl() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getTwitterUrl)).getAttribute("href");
	}

	public String getTextYoutubeUrl() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getYoutubeUrl)).getAttribute("href");
	}

	public String getTextLinkedinUrl() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getLinkedInUrl)).getAttribute("href");
	}

	public void clickOnSupportTerms() {
		webDriverWait.until(ExpectedConditions.visibilityOf(supportTerms)).click();
	}

	public String getTextSupportTermsPage() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getTextSupportTerms)).getText();
	}

	public void clickOnBottomPrivacyPolicy() {
		webDriverWait.until(ExpectedConditions.visibilityOf(bottomPrivacyPolicy)).click();
	}

	public String getTextBottomPrivacyPolicyPage() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getTextBottomPrivacyPolicy)).getText();
	}

	public void clickOnBottomTermsOfUse() {
		webDriverWait.until(ExpectedConditions.visibilityOf(bottomTermsOfUse)).click();
	}

	public String getTextBottomTermsOfUsePage() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getTextBottomTermsOfUse)).getText();
	}

	public void clickOnBottomAccessibility() {
		webDriverWait.until(ExpectedConditions.visibilityOf(bottomAccessibility)).click();
	}

	public String getTextBottomAccessibilityPage() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getTextBottomAccessibility)).getText();
	}

	public void clickOnBottomGDPR() {
		webDriverWait.until(ExpectedConditions.visibilityOf(bottomGDPR)).click();
	}

	public String getTextBottomGDPRPage() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getTextBottomGDPR)).getText();
	}

	public void clickOnBottomNews() {
		webDriverWait.until(ExpectedConditions.visibilityOf(bottomNews)).click();
	}

	public String getTextBottomNewsPage() {
		return webDriverWait.until(ExpectedConditions.visibilityOf(getTextBottomNews)).getText();
	}
}
