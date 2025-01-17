package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.pages.GoogleSearchPageObject;

public class GoogleSearchPageObjectTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchPageTest();

	}
	
	public static void googleSearchPageTest() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	    GoogleSearchPageObject search = new GoogleSearchPageObject(driver);
	    driver.get("https://google.com/");
	    search.setTextInSearchBox("abcd");
	    search.clickSearchButton();
	}

}
