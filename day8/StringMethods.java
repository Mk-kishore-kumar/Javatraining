package com.day8;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1 = "Java";
		
		System.out.println(s1.length());//4
		System.out.println(s1.charAt(1));//a
		System.out.println(s1.concat(" World"));//java_world
		System.out.println(s1.equals("java"));//false because case sensitive
		System.out.println(s1.equalsIgnoreCase("java"));//true
		System.out.println(s1.indexOf('a'));//1
		System.out.println(s1.lastIndexOf('a'));//3
		System.out.println(s1.indexOf('b'));//-1
		
		
		System.out.println(s1.startsWith("ja"));//its casesensitive only string
		System.out.println(s1.startsWith("Ja"));
		System.out.println(s1.endsWith("ha"));
		
		System.out.println(s1.replace('a', 'z'));//jzvz
		
		System.out.println(s1.toUpperCase());//JAVA
		System.out.println(s1.toLowerCase());//java
		
		String s2 = "Java World";
		
		System.out.println(s2.substring(3,7));// a_Wo (end - 1)
		System.out.println(s2.substring(3));//a_World
		
		System.out.println(s1.compareTo(s2));
		
		

	}

}
