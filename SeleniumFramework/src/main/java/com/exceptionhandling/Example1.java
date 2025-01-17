package com.exceptionhandling;

public class Example1 {

	public static void main(String[] args) {
	
		try {
			demo();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void demo() throws Exception{
	
			System.out.println("Hello word...!");
		    //throw new ArithmeticException();
			int i=1/0;
			System.out.println("Completed");
		
	}

}
