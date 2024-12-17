package com.day8;

public class Palindrome {
 
	public static void main(String[] args) {
		String s1 = new String("Java");
		s1 = s1.concat("World");
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("Partha");
		if(sb.toString().equals(sb.reverse().toString()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not pallindrome");
		}
	}
 
}
 
