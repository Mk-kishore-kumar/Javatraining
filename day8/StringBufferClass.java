package com.day8;

public class StringBufferClass {

	public static void main(String[] args) {
		
		String s1 = new String("partha");// cleard by gc
		
		
		s1 = s1.concat("nanda");//parta nanda is another obj(new mem)
		
		System.out.println(s1);
		
		
		
		StringBuffer obj = new StringBuffer("kishore");//literals cannot pass directly
		obj.append("kumar");
		System.out.println(obj);
		
		

	}

}
