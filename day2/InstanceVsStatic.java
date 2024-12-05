package com.day2;


public class InstanceVsStatic {
	
	static int b=30;//global to all object(Static area)
	
	int a = 10; //instance variable(non-static),heap

	public static void main(String[] args) {
		
		InstanceVsStatic obj1 = new InstanceVsStatic();
		InstanceVsStatic obj2 = new InstanceVsStatic();
		System.out.println("Instance variable have seperate copy");
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a=20;
		System.out.println("After reinitialize");
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		System.out.println("Static variable have only one copy");
		
		
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		obj1.b=40;
		
		System.out.println("After reinitialize");
		
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		
		
	}

}
