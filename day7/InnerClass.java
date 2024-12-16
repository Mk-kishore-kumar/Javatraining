package com.day7;

public class InnerClass {

	 class Inner1 {
		 
		 void display() {
			 System.out.println("Non-static class");
		 }
		 
		 
	 }
	 
	 static class Inner2 {
		 
		static void display() {
			 System.out.println("static method");
		 }
	 }
	 
	public static void main(String[] args) {
		
		//non static class
		InnerClass obj = new InnerClass();
		Inner1 inner = obj.new Inner1();
		inner.display();
		
		//static class
		Inner2 i2 = new InnerClass.Inner2();
		i2.display();
		Inner2.display();//
		
		
		
		
		
	}

}
