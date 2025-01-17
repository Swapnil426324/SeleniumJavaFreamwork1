package com.autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		test();
	}

	public static void test() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://tinyupload.com/");
        driver.findElement(By.name("uploades_file")).click();
        
        Runtime.getRuntime().exec("C:\\Users\\SwapnilAlaskar\\Documents\\FileUploadScript.exe");
        Thread.sleep(3000);
		
	}
}
