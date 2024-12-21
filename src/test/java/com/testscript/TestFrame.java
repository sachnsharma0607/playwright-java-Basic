package com.testscript;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Locator.ClickOptions;


public class TestFrame {

	@Test
	public void testframe()
	{
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
 
		Page page = browser.newPage();
		page.navigate("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		
		
		
		
		page.frameLocator("[name='iframeResult']").locator("body > button").click(new ClickOptions().setTimeout(2000));
 
		Locator frames = page.locator("iframe");
		
		System.out.println(frames.count());
		
		
		
		for(int i=0; i<frames.count(); i++) {
			
			System.out.println(frames.nth(i).getAttribute("id"));
			
		}
		
		browser.close();
	}
}
