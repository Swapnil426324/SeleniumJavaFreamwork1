package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	private static WebElement element = null;

	public static WebElement textbox_serach(WebDriver driver) {
		element = driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement button_serach(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		return element;
	}	
}
