package com.testscript;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
 
public class HandlingShadowRootElements {
 
	@Test
	public void shadowroot() {
 
 
 
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
 
		Page page = browser.newPage();
		page.navigate("chrome://downloads/");
		
		
		page.locator("#searchInput").type("Java");
 
 
	}
	
	
	@Test
	public void shadowrootTest(){
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
 
		Page page = browser.newPage();
		page.navigate("https://books-pwakit.appspot.com/");
		
		
		page.locator("#input").type("Java");
 
	}
	
	}
 
