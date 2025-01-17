package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("--Test start :- "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("--Test sucessful :- "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("--Test failure :- "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("-- Test Test skipped :- "+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("-- Test Finish "+context.getName());
		
	}

}
