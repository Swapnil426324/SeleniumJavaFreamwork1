package com.excel;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		ExcelUtils excel = new ExcelUtils("C:\\\\SeleniumTesting\\\\SeleniumFramework\\\\excel\\\\data.xlsx", "Sheet1");
	    excel.getRowCount();
	    excel.getcellStringdata(0, 0);
	    excel.getcellNumericdata(1, 1);
	}

}
