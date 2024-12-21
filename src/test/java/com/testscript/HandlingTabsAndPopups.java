package com.testscript;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
 
public class HandlingTabsAndPopups {
 
	
	@Test
	public void tabtest() {
 
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
 
		Page page = browser.newPage();
		page.navigate("https://sso.teachable.com/secure/673/identity/sign_up/email");
 
		Page popup = page.waitForPopup(() -> {
 
			page.locator("text=Privacy Policy").nth(0).click();
 
		});
		
		popup.locator("//*[@id=\"header-sign-up-btn\"]").click();
		popup.locator("#name").type("Rahul Arora");
		
		popup.close();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.close();
		browser.close();
		playwright.close();
 
	}
 
}