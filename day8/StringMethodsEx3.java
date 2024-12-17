package com.day8;

public class StringMethodsEx3 {
	
	

	public static void main(String[] args) {
		
		String s1 = new String("java");
		String s2 = new String("Java");//reinitailize
		
//		System.out.println(s1 == s2);//false
//		//System.out.println(s1.equalsIgnoreCase(s2));//false
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s1));
	}

}
