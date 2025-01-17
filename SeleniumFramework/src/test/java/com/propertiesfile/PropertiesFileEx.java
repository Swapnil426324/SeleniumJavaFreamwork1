package com.propertiesfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import com.test.TestNgDemo;

public class PropertiesFileEx {
	static Properties properties = new Properties();
	static String projectPath = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	}
	
	public static void getProperties(){
		try {
		    //Properties properties = new Properties();
		    //String projectPath = System.getProperty("user.dir");
		    //System.out.println(projectPath);
			FileInputStream input = new FileInputStream("src/test/java/com/propertiesfile/config.properties");
			properties.load(input);
			String browser = properties.getProperty("browser");
			System.out.println(browser);
			TestNgDemo.browserName = browser;
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	
	public static void setProperties(){
		try {
		   
		    FileOutputStream output = new FileOutputStream("src/test/java/com/propertiesfile/config.properties");
			//properties.setProperty("browser", "chrome");
			properties.setProperty("result", "pass");
			properties.store(output, null);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}

}
