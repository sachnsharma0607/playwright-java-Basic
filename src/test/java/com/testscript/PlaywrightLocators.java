package com.testscript;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Page.TypeOptions;

public class PlaywrightLocators {

@Test
public void playwrightlocators() throws InterruptedException
{
	Playwright playwright = Playwright.create();
	Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
	Page page = browser.newPage();
	page.navigate("https://www.google.com/");
	page.type("#APjFqb","playwright test for automation",new TypeOptions().setDelay(500));
	Thread.sleep(1500);
	browser.close();
}
}

