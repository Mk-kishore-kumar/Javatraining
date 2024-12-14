package com.day6;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		try {
		//int a = 10 / 0;
			throw new ArithmeticException("cannot divide by zero");
		}
		catch(ArithmeticException e) {
			
			System.out.println(e.getMessage());
			
		}
	}

}
