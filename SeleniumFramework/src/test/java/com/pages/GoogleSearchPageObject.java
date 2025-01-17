package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {

	WebDriver driver = null;
	
	By textbox_search = By.id("APjFqb");
	By button_search = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	
	//constructor
	public GoogleSearchPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	//adding text for serch
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	//clickbutton
	public void clickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
}
