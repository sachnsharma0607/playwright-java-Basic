package com.testscript;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;

import com.microsoft.playwright.BrowserType;

import com.microsoft.playwright.Locator;

import com.microsoft.playwright.Page;

import com.microsoft.playwright.Playwright;



public class TestSliders {


@Test
public void silderTest() throws InterruptedException {





Playwright playwright = Playwright.create();

Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));



Page page = browser.newPage();

page.navigate("https://jqueryui.com/resources/demos/slider/default.html");



Locator slider = page.locator("//*[@id=\"slider\"]/span");

try {

Thread.sleep(5000);

} catch (InterruptedException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

page.mouse().move(slider.boundingBox().x + slider.boundingBox().width/2, slider.boundingBox().y+slider.boundingBox().height/2);

page.mouse().down();
Thread.sleep(5000);

page.mouse().move(slider.boundingBox().x + 400, slider.boundingBox().y+slider.boundingBox().height/2);

page.mouse().up();

Thread.sleep(5000);

}



}

