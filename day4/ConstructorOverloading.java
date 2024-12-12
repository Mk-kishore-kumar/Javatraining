package com.day4;

class OverLoading1 {
	
	OverLoading1(int a) {
		
		this(10,20);
		
		int fact = 1;
		for(int i = 1; i <= a; i++) {
			
			fact = fact * i;
		}
		
		System.out.println("The factorial of "+a+" is "+fact);
		
		
	}
	
       OverLoading1(int a,int b) {
    	   
		this("welcome iam constructor overloading");
		
		System.out.println("Addition of Two number is: "+(a+b));
	}
   
      OverLoading1(String message) {
    	  
		 this(10.5f, 20.2f);
		 
	   System.out.println(message);
		
	}
      OverLoading1(float a, float b) {
    	  
    	  System.out.println(a+b);
      }
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		
		OverLoading1 overloading = new OverLoading1(5);
		
		
	}

}
