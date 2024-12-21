package com.testscript;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class CountTheLink {

	@Test
	public void linkcount() {
		
		String url = "https://www.wikipedia.org/";
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate(url);
		Locator links = page.locator("a");
		System.out.println(links.count());
		for(int index=0;index<=links.count();index++) {
			System.err.println(links.nth(index)+"-------------"+links.nth(index).getAttribute("href"));
		}
		
	}
	
	
	@Test
	public void linkcountintoblock() {
		
		String url = "https://www.wikipedia.org/";
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate(url);
		Locator links = page.locator("//div[@class='other-project']//a");
		System.out.println(links.count());
		for(int index=0;index<links.count();index++) {
			System.err.println(links.nth(index)+"-------------"+links.nth(index).getAttribute("href"));
		}
		
	}
	
	@Test
	public void linkcountintoblock02() {
		
		String url = "https://www.wikipedia.org/";
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate(url);
		Locator block = page.locator("//div[@class='other-project']");
		Locator links=block.locator("a");
		System.out.println(links.count());
		for(int index=0;index<links.count();index++) {
			System.err.println(links.nth(index)+"-------------"+links.nth(index).getAttribute("href"));
		}
		
	}
}
