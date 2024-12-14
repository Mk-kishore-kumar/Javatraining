package com.day6;

class A {
	
	
	
}

class b extends A {
	
	
}
public class BasicException extends A {
	
     int a = 10;
	
	public static void main(String[] args) {
		System.out.println("Before exception");
		
		//int a = 10 / 0;  Arithmetic exception
		
		//int arr[] = {10,20,30};
		
		//int arr[] = new int[] {10,20,30};
		
		
		
		//System.out.println(arr[3]);//Array index out of bound exception
		
		//int arr[] = new int[-5];// negative arraysize exception
		
		//int a = Integer.parseInt("ABC");// Number format exception
		
//		BasicException obj = null;
//		
//		System.out.println(obj.a);//null pointer exception
//		
//		System.out.println("After exception");
		
		A obj1 = new b();
		
		BasicException B1 = (BasicException) obj1;
		
	}

}
