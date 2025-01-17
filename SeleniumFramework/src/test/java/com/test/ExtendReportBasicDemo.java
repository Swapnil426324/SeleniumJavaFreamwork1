package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");

		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Serach Test One", "This is test to validate goole search validity");
        
        String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting Test Case");
		driver.get("https://google.com/");
		test1.pass("Navigate to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("Entered text in serchbox");

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		test1.pass("Click on serch button");
		
		driver.close();
		test1.pass("Close the browser");
		
		test1.info("Test Completed");
		
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test2 = extent.createTest("Google Serach Test Two", "This is test to validate goole search validity");
      
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		test2.log(Status.INFO, "Starting Test Case");
		driver.get("https://google.com/");
		test2.pass("Navigate to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test2.pass("Entered text in serchbox");

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		test2.fail("Click on serch button");
		
		driver.close();
		test2.pass("Close the browser");
		
		test2.info("Test Completed");
		
		// calling flush writes everything to the log file
        extent.flush();
	}

}
