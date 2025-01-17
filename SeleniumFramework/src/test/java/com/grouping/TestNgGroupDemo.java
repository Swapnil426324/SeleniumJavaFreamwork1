package com.grouping;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTestCase"})
public class TestNgGroupDemo {

	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("this is test 1");
	}
	
	@Test(groups = {"windows.regression"})
	public void test2() {
		System.out.println("this is test 2");
	}
	
	@Test(groups = {"linux.regression"})
	public void test3() {
		System.out.println("this is test 3");
	}
	
	@Test
	public void test4() {
		System.out.println("this is test 4");
	}
}
