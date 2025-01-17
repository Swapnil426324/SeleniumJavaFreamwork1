package com.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.log4j.Log4jDemo;
import com.propertiesfile.PropertiesFileEx;

public class TestNgDemo {

	WebDriver driver = null;
	public static String browserName=null;
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		PropertiesFileEx.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","drivers/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		logger.info("Browser startrd");
	}

	@Test
	public void googleSearch() {

		// goto the google.com
		driver.get("https://google.com/");

		// enter text in serarch box
		driver.findElement(By.name("q")).sendKeys("Automation step by step");

		// click on serch button
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
	}

	@AfterTest
	public void tearDownTest() {
		// close browser
		driver.close();
		System.out.println("Test completed succussfully");
        PropertiesFileEx.setProperties();
	}

}
