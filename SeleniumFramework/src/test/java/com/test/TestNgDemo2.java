package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo2 {

	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

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

	}

}
