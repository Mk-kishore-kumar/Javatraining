package com.day8;

public class StringClassMethods2 {

	public static void main(String[] args) {
		
		String s1 = "java";
		
		char[] arr= s1.toCharArray();
		
		//enhanced for loop
		
		for(char c : arr) {
			
			System.out.println(c);
		}
		
		//traverse by for loop
		
		for(int i = 0; i < s1.length(); i++) {
			
			System.out.println(s1.charAt(i));
		}
		
		
		
		//ex2
		
		String s2 ="welcome to java world";
		
		String temp[] = s2.split(" ");//return array ,store it in array
		
		for (String string : temp) {
			
			System.out.print(string);
		}

	}

}
