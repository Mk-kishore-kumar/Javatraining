package com.day2;

public class TypesOfMethod {
      void myMethod1() {
    	  System.out.println("Instance Method!!");
      }
      
      static void myMethod2() {
    	  
    	  System.out.println("Static Method!!");
      }
      
      
	public static void main(String[] args) {
		
		TypesOfMethod t1 = new TypesOfMethod();
		
		t1.myMethod1();
		 
		TypesOfMethod.myMethod2();
		

	}

}
