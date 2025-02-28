package com.re_run_testcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnylizer implements IRetryAnalyzer {

	private int retryCount = 0;
	private static final int maxRetryCount = 5;

	@Override
	public boolean retry(ITestResult result) {
		if (retryCount < maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}
}
