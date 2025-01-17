package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.GoogleSearchPage;

public class GoogleSearchPageTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();

	}
	
	public static void googleSearch() {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		//goto the google.com
		driver.get("https://google.com/");
		
		GoogleSearchPage.textbox_serach(driver).sendKeys("automaton step by step");
		GoogleSearchPage.button_serach(driver).click();
		//close browser
		//driver.close();
		System.out.println("Test completed succussfully");
		
	}

}
