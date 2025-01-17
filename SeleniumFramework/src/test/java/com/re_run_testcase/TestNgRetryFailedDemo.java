package com.re_run_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgRetryFailedDemo {
	
	@Test
	public void test01() {
		System.out.println("I am inside test 1");
	}
	
	@Test
	public void test02() {
		System.out.println("I am inside test 2");
		//int i=1/0;
	}
	
	@Test(retryAnalyzer = com.re_run_testcase.RetryAnylizer.class)
	public void test03() {
		System.out.println("I am inside test 3");
		Assert.assertTrue(0>1);
	}
}
