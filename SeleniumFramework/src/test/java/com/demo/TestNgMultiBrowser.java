package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgMultiBrowser {

	WebDriver driver=null;
	String projectPath = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {
		System.out.println("Browser name :- "+browserName);
		System.out.println("Thread id :- "+Thread.currentThread().getId());
		
		if(browserName.equals("chrome")) {
			System.out.println("projectPath : "+projectPath);
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","drivers/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver","C:\\SeleniumTesting\\SeleniumFramework\\drivers\\iedriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	}
	
	@Test
	public void test1() throws Exception {
		driver.get("https://google.com");
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test completed sucessfully");
	}
}
