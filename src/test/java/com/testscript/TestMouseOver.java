package com.testscript;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
 
public class TestMouseOver {
 
	@Test
	public void  moveMouseTest() throws InterruptedException {
 
 
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
 
		Page page = browser.newPage();
		page.navigate("https://www.way2automation.com/");
 
		
		page.locator("//*[@id=\"menu-item-27580\"]/a/span[2]").hover();
		Thread.sleep(500);
		page.locator("//*[@id=\"menu-item-27592\"]/a").click();
	page.close();
 
	}
 
}