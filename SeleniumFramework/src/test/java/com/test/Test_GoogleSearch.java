package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_GoogleSearch {

	public static void main(String[] args) {
		googleSearch();

	}
	
	public static void googleSearch() {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//goto the google.com
		driver.get("https://google.com/");
		
		//enter text in serarch box
		driver.findElement(By.name("q")).sendKeys("Aoutomation step by step");
		
		// click on serch button
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		
		//close browser
		driver.close();
		System.out.println("Test completed succussfully");
		
	}

}
