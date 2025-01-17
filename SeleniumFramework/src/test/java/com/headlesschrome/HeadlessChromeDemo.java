package com.headlesschrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=chrome");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		
		driver.close();
		
		System.out.println("completed");		
	}
}
