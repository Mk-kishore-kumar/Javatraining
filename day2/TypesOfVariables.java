package com.day2;

//types of variables in java
public class TypesOfVariables {
    int b = 10; //Instance or Object variable
    
    static int c=20;//static or Class variable
    
	public static void main(String[] args) {
		
		int a = 30; //local variable
		
		System.out.println("Local variale: "+a);
		
		TypesOfVariables obj = new TypesOfVariables();
		
		System.out.println("Instance variable: "+obj.b);
		
		System.out.println("Static Variable: "+TypesOfVariables.c);
	}

}
