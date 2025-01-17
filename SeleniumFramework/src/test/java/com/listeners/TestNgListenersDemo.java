package com.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.listeners.TestNgListeners.class)
public class TestNgListenersDemo {
@Test
public void test01() {
	System.out.println("I am inside Test 1");
}

@Test
public void test02() {
	System.out.println("I am inside Test 2");
	Assert.assertTrue(false);
}

@Test
public void test03() {
	System.out.println("I am inside Test 3");
	throw new SkipException("This is skipped");
}
}
