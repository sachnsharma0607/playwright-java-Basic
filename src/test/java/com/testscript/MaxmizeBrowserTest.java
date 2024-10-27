package com.testscript;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Page.TypeOptions;

public class MaxmizeBrowserTest {

	@Test
	public void maximizeWindow() throws InterruptedException {
		String url="https://www.docker.com/play-with-docker/";
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double height = screenSize.getHeight();
		double width = screenSize.getWidth();
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browserContext = browser
				.newContext(new Browser.NewContextOptions().setViewportSize((int) width, (int) height));
		// BrowserContext browserContext = browser.newContext(new
		// Browser.NewContextOptions().setViewportSize(1536 ,864));
		Page page = browserContext.newPage();
		page.navigate(url);
		Thread.sleep(1500);
		browser.close();
	}

	@Test
	public void play_maximized() throws InterruptedException {
		String url="https://www.browserstack.com/dg/turboscale-playwright-docker?utm_source=google&utm_medium=cpc&utm_platform=paidads&utm_content=717809087205&utm_campaign=Search-NB-Global-TurboScale-Micro-Journey&utm_campaigncode=playwright-docker+9302383&utm_term=e+playwright%20docker&gad_source=1&gclid=CjwKCAjwyfe4BhAWEiwAkIL8sPEFpbzsGN3zabFYQgtn633OfKP5x5HeDfSFaX4Umay5iadckI9F1BoCd_MQAvD_BwE";
		
		Playwright playwright = Playwright.create();
		ArrayList<String> argument = new ArrayList<>();
		// argument.add("--start-maximized");
		argument.add("--start-maximized");

		Browser browser = playwright.chromium()
				.launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(argument));
		BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page page = browserContext.newPage();
		page.navigate(url);
		Thread.sleep(1500);
		browser.close();
	}
}
