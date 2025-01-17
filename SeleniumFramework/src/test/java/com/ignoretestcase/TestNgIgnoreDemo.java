package com.ignoretestcase;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNgIgnoreDemo {

	@Test
	//@Ignore
	public void test01() {
		System.out.println("I am inside test 1");
	}
	
	@Test
	public void test02() {
		System.out.println("I am inside test 2");
	}
	
	@Test
	public void test03() {
		System.out.println("I am inside test 3");
	}
}
