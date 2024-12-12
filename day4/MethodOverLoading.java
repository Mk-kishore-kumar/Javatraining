package com.day4;

class OverLoading {
	int method(int a) {
		
		int fact = 1;
		for(int i = 1; i <= a; i++) {
			
			fact = fact * i;
		}
		
		return fact;
		
	}
	
   void method(int a,int b) {
		
		System.out.println("Addition of Two number is: "+(a+b));
	}
   
   void method(String message) {
		
	   System.out.println(message);
		
	}
}
public class MethodOverLoading {
         
	public static void main(String[] args) {
		
		OverLoading overloading = new OverLoading();
		int fact=overloading.method(5);
		System.out.println(fact);
		overloading.method(10,20);
		overloading.method("Welcome to celcom");

	}

}
