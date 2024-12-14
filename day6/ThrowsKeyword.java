package com.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyword {
	
	void myMethod1() throws FileNotFoundException {// Business logic
		
		FileReader red = new FileReader("partha.txt");
	}
	
	void myMethod() {// This is caller he have to handle that exception
		
		try {
			myMethod1();
		}
		catch(FileNotFoundException e) {
			
			System.out.println("Partha file not found");
			
		}
		
	}

	public static void main(String[] args)  {
		
		

	}

}
