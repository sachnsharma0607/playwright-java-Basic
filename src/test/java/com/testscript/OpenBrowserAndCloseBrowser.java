package com.testscript;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class OpenBrowserAndCloseBrowser {

	@Test
	public void openBrowserAndclose() {
		Playwright playwright = Playwright.create();
//	Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(100));4
		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://mvnrepository.com/artifact/com.microsoft.playwright");
		System.out.println("dfd");
		playwright.chromium().launch();
	}
}