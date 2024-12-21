package com.testscript;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
 
public class HandlingBasicAuth {
 
	@Test
	public  void auththest() {
 
 
 
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setHttpCredentials("admin", "admin"));
		Page page = context.newPage();
		page.navigate("http://the-internet.herokuapp.com/basic_auth");
 
 
	}
 
}