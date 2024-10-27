package com.testscript;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Page.TypeOptions;

public class OpenAndClickonButton {

	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	@Test
	public void TypeintoTextBoxWithType_SetDelayOption_And_ClickOnButton() throws InterruptedException {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate(url);
		page.getByPlaceholder("Username").type("Admin");
	//	page.type(".oxd-input oxd-input--active","Admin",new TypeOptions().setDelay(500));
		page.getByPlaceholder("password").type("admin123");
		Thread.sleep(1500);
		
		page.click("type=\"submit\"");
		browser.close();

	}
}
