package com.day8;

public class ThreeWaysOfString {

	public static void main(String[] args) {
		
		String s1 = "java";//1 way directly object
		
		String s2 = new String("Python");//2 passing String in constructor
		
		char ch[] = {'h','i'};//3. created one char array convert to String object
		
		
		String s3 = new String(ch);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("Address of each object");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("String directly store because its object");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		

}
	}
