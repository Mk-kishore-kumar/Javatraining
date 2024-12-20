package com.day11;

import java.util.StringJoiner;

public class StringJoinerClass {

	public static void main(String[] args) {
		
		StringJoiner joiner1 = new StringJoiner(",");//separetor ,prefix, suffix
		joiner1.add("red");
		joiner1.add("green");
		joiner1.add("blue");
		String result = joiner1.toString();
		System.out.println(result);
		
		StringJoiner joiner = new StringJoiner(",","[","]");//separetor ,prefix, suffix
		joiner.add("red");
		joiner.add("green");
		joiner.add("blue");
		String result1 = joiner.toString();
		System.out.println(result1);
	}

}
