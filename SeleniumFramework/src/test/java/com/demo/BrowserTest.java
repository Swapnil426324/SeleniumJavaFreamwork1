package com.demo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {

		//String projectPath = System.getProperty("user.dir");
		//System.out.println("projectPath : " + projectPath);
		//System.setProperty("webdriver.gecko.driver","drivers/geckodriver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		System.setProperty("webdriver.ie.driver","C:\\SeleniumTesting\\SeleniumFramework\\drivers\\iedriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.selenium.dev/");

		driver.close();
	}
}
