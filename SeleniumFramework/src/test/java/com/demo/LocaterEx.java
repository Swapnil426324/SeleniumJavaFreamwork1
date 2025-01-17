package com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterEx {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		//using findElement
		
		//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Automation step by step");
		//driver.findElement(By.id("APjFqb")).sendKeys("Automation step by step");
		

		// using findElements
		List <WebElement> list = driver.findElements(By.xpath("//input"));
        int count = list.size();
        System.out.println("count of input elements is :- "+count);

	}

}
