package com.testscript;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandlingCheckBox {
	
	@Test
	public void veriyCheckbox() throws InterruptedException
	{
		String url = "http://www.tizag.com/htmlT/htmlcheckboxes.php";
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate(url);
		Thread.sleep(500);
		Locator checkboxs = page.locator("[type=checkbox]");
		System.err.println(checkboxs.count());
		for(int index=0;index<checkboxs.count();index++)
		{
			checkboxs.nth(index).click();
			Thread.sleep(500);
		}
		Thread.sleep(500);
		browser.close();

	}
	
	@Test
	public void clickonSingleCheckBox() throws InterruptedException
	{
		String url = "http://www.tizag.com/htmlT/htmlcheckboxes.php";
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate(url);
		Thread.sleep(500);
		page.check("[value='soccer']");
	
		Thread.sleep(500);
		
		
		
		Thread.sleep(500);
		browser.close();

	}

}
