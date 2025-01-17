package com.dependency;

import org.testng.annotations.Test;

public class TestNgDependencyDemo {
	
	@Test(dependsOnGroups = {"sanity.*"})
	public void test01() {
		System.out.println("I am inside test 1");
	}
	
	@Test(groups="sanity1")
	public void test02() {
		System.out.println("I am inside test 2");
	}
	
	@Test(groups="sanity2")
	public void test03() {
		System.out.println("I am inside test 3");
	}

	
	// depend on groups
	/*
	 * @Test(dependsOnGroups = {"sanity1"}) public void test01() {
	 * System.out.println("I am inside test 1"); }
	 * 
	 * @Test(groups="sanity1") public void test02() {
	 * System.out.println("I am inside test 2"); }
	 * 
	 * @Test public void test03() { System.out.println("I am inside test 3"); }
	 */
	
	
	//depends on methods
	/*
	 * @Test(dependsOnMethods = {"test02","test03"}) public void test01() {
	 * System.out.println("I am inside test 1"); }
	 * 
	 * @Test public void test02() { System.out.println("I am inside test 2"); }
	 * 
	 * @Test public void test03() { System.out.println("I am inside test 3"); }
	 */
}
