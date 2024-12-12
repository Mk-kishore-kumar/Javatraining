package com.day4;


class AccessModifier {
	
	 AccessModifier() {
		
		System.out.println("private constructor");
		
	}
	final int a =10;
	
	final void display() {
		
		System.out.println("iam final method");
		
	}
	
}

class Access extends AccessModifier {
	
//     final void display() {
//		
//		System.out.println("iam final method");
//		
//	}
	// final methosds cannot be overriden
	
	
	
	
	
}
public class FinalKeyword {
      int a;
      int b;
	private FinalKeyword(int a, int b){
		System.out.println(a+b);
		System.out.println("iam from private constructor");
	}
	
	public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier();
		System.out.println(am.a);
		 am.display();
		 
		 System.out.println("----------------");
		 
		 Access  a1 = new Access();
		 a1.display();
		 System.out.println(a1.a);
		 System.out.println("--------------");
		 
		 FinalKeyword f1 = new FinalKeyword(10,20);
		 
		 
	}

}
