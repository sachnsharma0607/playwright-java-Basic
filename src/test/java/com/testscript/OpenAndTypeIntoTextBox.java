package com.testscript;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.TypeOptions;
import com.microsoft.playwright.Playwright;

public class OpenAndTypeIntoTextBox {
	@Test
	public void TypeintoTextBox() throws InterruptedException {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://www.google.com/");
		page.locator("#APjFqb").type("selenium");
		Thread.sleep(1500);
		browser.close();

	}
	
	@Test
	public void TypeintoTextBoxWithType() throws InterruptedException {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://www.google.com/");
		page.type("#APjFqb","playwright");
		Thread.sleep(1500);
		browser.close();

	}
	
	@Test
	public void TypeintoTextBoxWithType_SetDelayOption() throws InterruptedException {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://www.google.com/");
		page.type("#APjFqb","playwright test for automation",new TypeOptions().setDelay(500));
		Thread.sleep(1500);
		browser.close();

	}

	
}
