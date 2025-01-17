package com.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

	}


	
	@Test(dataProvider = "tes1tData")
	public void test1(String username, String password){
		
		System.out.println(username +" | "+password);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.findElement(By.name("name=\"username\"")).sendKeys("Admin");
	    driver.findElement(By.id("name=\"password\"")).sendKeys("admin123");
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	
	@DataProvider(name = "tes1tData")
	public Object [] [] getData() {
		String excelPath = "C:\\SeleniumTesting\\SeleniumFramework\\excel\\data.xlsx";
		Object data[][] = testData(excelPath, "Sheet1");
		return data;
	}

	public  Object[][] testData(String excelPath, String sheetName) {
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getCoulmnCount();
	    
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String celldata = excel.getcellStringdata(i, j);
				System.out.println(celldata);
				
				data[i][j] = celldata;
			}
			System.out.println();
		}
		return data;
	}
}
