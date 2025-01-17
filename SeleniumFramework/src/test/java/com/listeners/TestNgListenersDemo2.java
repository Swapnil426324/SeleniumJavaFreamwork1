package com.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.listeners.TestNgListeners.class)
public class TestNgListenersDemo2 {
@Test
public void test04() {
	System.out.println("I am inside Test 4");
}

@Test
public void test05() {
	System.out.println("I am inside Test 5");
	Assert.assertTrue(false);
}

@Test
public void test06() {
	System.out.println("I am inside Test 3");
	throw new SkipException("This is skipped");
}
}
