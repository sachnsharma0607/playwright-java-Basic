package com.testscript;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class HandlingDropDown {

	@Test
	public void dropdown() {
		String url = "https://www.wikipedia.org/";
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate(url);
		try {
			Thread.sleep(1500);
			// select by text
			page.selectOption("select", "Deutsch");
			Thread.sleep(1500);
			// select by value
			page.selectOption("select", "fa");
			Thread.sleep(1500);

			// select by index

			page.selectOption("select", new SelectOption().setIndex(2));
			Thread.sleep(1500);

			// select by text
			page.selectOption("select", new SelectOption().setLabel("Deutsch"));

			Locator values = page.locator("select>option");
			System.err.println(values.count());
			
			for(int i=0;i<values.count();i++)
			{
				System.err.println(values.nth(i).innerText()+"-------------"+values.nth(i).getAttribute("lang"));
			}

			Thread.sleep(1500);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		browser.close();
	}
	
	@Test
	public void querySelectAll()
	{
		String url = "https://www.wikipedia.org/";
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate(url);
		
			try {
				Thread.sleep(1500);
				List<ElementHandle> values = page.querySelectorAll("select>option");
				for( ElementHandle value:values)
				{
					System.err.println(value.innerText()+"------------"+value.getAttribute("lang"));
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			browser.close();
			
	}
}
