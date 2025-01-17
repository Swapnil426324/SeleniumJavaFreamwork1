package com.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		System.out.println("\n Hello World... ! \n");
		
		logger.trace("This is trace message");
		logger.info("this is information message");
		logger.error("This is error message");
		logger.warn("This is warn msg");
		logger.fatal("This is fatal msg");
		System.out.println("\n Completed");
	}

}
