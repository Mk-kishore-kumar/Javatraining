package com.day8;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		
  //String s1  = "11/22/24";
  String s2 = "Welcome to the java word";
  
  StringTokenizer st = new StringTokenizer(s2," ");
  
  System.out.println(st.countTokens());
  while(st.hasMoreTokens()) {
	  
	  System.out.println(st.nextToken());
  }
	}

}
