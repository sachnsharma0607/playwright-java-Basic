package com.testscript;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Page.TypeOptions;

public class PlaywrightLocators {

	@Test
	public void idlocatorusedByhash()
	{
		String url="https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AeZLP9_V0ECXfSI_92VuZm_0u6Br9MhSc4fSP6mZNviiQoNPvroN8GAjUiLaW-u61zfwZCASOhP_&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1596904780%3A1734467811211071&ddm=1";
		String userName="sachin01@gmail.com";	
		Playwright playwright = Playwright.create();
		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate(url);
		page.locator("#identifierId").type(userName);;
		//page.locator("[id='identifierId']").type(userName);;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		browser.close();
	}
	
	@Test
	public void idlocatorusedById()
	{
		String url="https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AeZLP9_V0ECXfSI_92VuZm_0u6Br9MhSc4fSP6mZNviiQoNPvroN8GAjUiLaW-u61zfwZCASOhP_&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1596904780%3A1734467811211071&ddm=1";
		String userName="sachin02@gmail.com";	
		Playwright playwright = Playwright.create();
		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate(url);
		//page.locator("#identifierId").type(userName);;
		page.locator("[id='identifierId']").type(userName);;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		browser.close();
	}
	@Test
	public void typetwoArgument()
	{
		String url="https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AeZLP9_V0ECXfSI_92VuZm_0u6Br9MhSc4fSP6mZNviiQoNPvroN8GAjUiLaW-u61zfwZCASOhP_&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1596904780%3A1734467811211071&ddm=1";
		String userName="sachin03@gmail.com";	
		Playwright playwright = Playwright.create();
		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate(url);
		//page.locator("#identifierId").type(userName);;
		page.type("#identifierId",userName);;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		browser.close();
	}
	
	@Test
	public void typetwoArgumentwithSetDelayMethod()
	{
		String url="https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AeZLP9_V0ECXfSI_92VuZm_0u6Br9MhSc4fSP6mZNviiQoNPvroN8GAjUiLaW-u61zfwZCASOhP_&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1596904780%3A1734467811211071&ddm=1";
		String userName="sachin04@gmail.com";	
		Playwright playwright = Playwright.create();
		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate(url);
		//page.locator("#identifierId").type(userName);;
		page.type("#identifierId",userName,new TypeOptions().setDelay(100));;
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		browser.close();
	}
	
	
	@Test
	public void typetwoArgumentwith_idandSetDelayMethod()
	{
		String url="https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AeZLP9_V0ECXfSI_92VuZm_0u6Br9MhSc4fSP6mZNviiQoNPvroN8GAjUiLaW-u61zfwZCASOhP_&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1596904780%3A1734467811211071&ddm=1";
		String userName="sachinDelay@gmail.com";	
		Playwright playwright = Playwright.create();
		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate(url);
		//page.locator("#identifierId").type(userName);;
		page.type("id=identifierId",userName,new TypeOptions().setDelay(100));;
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		browser.close();
	}
	
}