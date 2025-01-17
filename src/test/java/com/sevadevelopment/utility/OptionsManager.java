package com.sevadevelopment.utility;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OptionsManager {

	// Get Chrome Options
	public ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-popup-blocking");

//		options.addArguments("--headless");
		// options.addArguments("--incognito");
//		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--no-sandbox");
		return options;
		/*
		 * ChromeDriverService service = new ChromeDriverService.Builder()
		 * .usingAnyFreePort() .build(); ChromeDriver driver = new ChromeDriver(service,
		 * options);
		 */
	}

	// Get Firefox Options
	public FirefoxOptions getFirefoxOptions() {
		FirefoxOptions options = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		// Accept Untrusted Certificates
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		// Use No Proxy Settings
		profile.setPreference("network.proxy.type", 0);
		// Set Firefox profile to capabilities
		options.setCapability(FirefoxDriver.PROFILE, profile);
		options.setHeadless(true);
		return options;
	}
}
