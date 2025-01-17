package com.excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	//constructor
	
	public ExcelUtils(String excelPath, String sheetName) {
		//workbook = new XSSFWorkbook("C:\\SeleniumTesting\\SeleniumFramework\\excel\\data.xlsx");
		try {
			workbook = new XSSFWorkbook(excelPath);
	        sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	  	   
	}
	
	public static void main(String[] args) {
		
			//getRowCount();
			getcellStringdata(0, 0);
			getcellNumericdata(1, 1);
		
	}

	public static int getRowCount() {
		 int rowCount=0;
		 
		 rowCount = sheet.getPhysicalNumberOfRows();
		 System.out.println("No of rows : "+rowCount);
		 return rowCount;
	}
	
	public static int getCoulmnCount() {
		 int colCount=0;
		 
		 colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		 System.out.println("No of columns : "+colCount);
		 return colCount;
	}
	
	public static String getcellStringdata(int rownum, int colnum){
		String cellData=null;
		try {
			
	        cellData = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
	       // System.out.println(cellData);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return cellData;
	}
	
	public static void getcellNumericdata(int rowNum, int colNum) {
		double cellData=0;
		try {
			
	         cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
	        System.out.println(cellData);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		//return cellData;
	}
}
