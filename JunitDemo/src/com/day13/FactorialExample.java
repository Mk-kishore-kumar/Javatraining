package com.day13;

public class FactorialExample {

	public int getFactorial(int number) {
		
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}

		return fact;
	}

}
