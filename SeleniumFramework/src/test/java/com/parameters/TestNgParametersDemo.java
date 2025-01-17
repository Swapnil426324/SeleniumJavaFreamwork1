package com.parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParametersDemo {

	@Test
	@Parameters({"MyName"})
	public void test(@Optional("Swapnil") String name) {
		System.out.println("Name : "+name);
	}
}
