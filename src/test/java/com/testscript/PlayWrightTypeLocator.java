package com.testscript;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlayWrightTypeLocator {

	
	@Test
	public void typeLocaor()
	{
		String url="https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AeZLP9_V0ECXfSI_92VuZm_0u6Br9MhSc4fSP6mZNviiQoNPvroN8GAjUiLaW-u61zfwZCASOhP_&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1596904780%3A1734467811211071&ddm=1";
		String userName="sachin@gmail.com";	
		Playwright playwright = Playwright.create();
		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate(url);
		page.locator("[type=email]").type(userName);;
		
		
		try {
			Thread.sleep(5000);
			page.locator("text=Next").click();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		browser.close();
	}
	
	@Test
	public void typeLocaor_click()
	{
		String url="https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AeZLP9_V0ECXfSI_92VuZm_0u6Br9MhSc4fSP6mZNviiQoNPvroN8GAjUiLaW-u61zfwZCASOhP_&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1596904780%3A1734467811211071&ddm=1";
		String userName="sachin@gmail.com";	
		Playwright playwright = Playwright.create();
		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate(url);
		page.locator("[type=email]").type(userName);;
		
		
		try {
			Thread.sleep(5000);
			page.locator("button:has-text('Next')").click();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		browser.close();
	}
}
