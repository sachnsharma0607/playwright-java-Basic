package com.testscript;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LanuchBrowser {
	String url = "https://www.browserstack.com/dg/turboscale-playwright-docker?utm_source=google&utm_medium=cpc&utm_platform=paidads&utm_content=717809087205&utm_campaign=Search-NB-Global-TurboScale-Micro-Journey&utm_campaigncode=playwright-docker+9302383&utm_term=e+playwright%20docker&gad_source=1&gclid=CjwKCAjwyfe4BhAWEiwAkIL8sPEFpbzsGN3zabFYQgtn633OfKP5x5HeDfSFaX4Umay5iadckI9F1BoCd_MQAvD_BwE";

	@Test
	public void firefoxBrowser() throws InterruptedException {
		Playwright playwright = Playwright.create();
		ArrayList<String> argument = new ArrayList<>();
		// argument.add("--start-maximized");
		argument.add("--start-maximized");

		Browser browser = playwright.firefox()
				.launch(new BrowserType.LaunchOptions().setChannel("firefox").setHeadless(false));
		// BrowserContext browserContext = browser.newContext(new
		// Browser.NewContextOptions().setViewportSize(null));
		Page page = browser.newPage();
		page.navigate(url);
		Thread.sleep(1500);
		browser.close();

	}

	@Test
	public void msEdgeBrowser() throws InterruptedException {
		Playwright playwright = Playwright.create();
		ArrayList<String> argument = new ArrayList<>();
		// argument.add("--start-maximized");
		argument.add("--start-maximized");

		Browser browser = playwright.chromium()
				.launch(new BrowserType.LaunchOptions().setChannel("msedge").setHeadless(false));
		// BrowserContext browserContext = browser.newContext(new
		// Browser.NewContextOptions().setViewportSize(null));
		Page page = browser.newPage();
		page.navigate(url);
		Thread.sleep(1500);
		browser.close();

	}

	@Test
	public void chromeBrowser() throws InterruptedException {
		Playwright playwright = Playwright.create();
		ArrayList<String> argument = new ArrayList<>();
		// argument.add("--start-maximized");
		argument.add("--start-maximized");
		url="https://www.selenium.dev/";
		Browser browser = playwright.chromium()
				.launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		// BrowserContext browserContext = browser.newContext(new
		// Browser.NewContextOptions().setViewportSize(null));
		Page page = browser.newPage();
		page.navigate(url);
		Thread.sleep(1500);
		browser.close();

	}
}
