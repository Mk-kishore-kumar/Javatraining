package com.day5;

abstract class MyAbstarct {
	
	abstract void myAbstractMethod1();
	abstract void myAbstractMethod2();
	
	void myMethod() {
		
		System.out.println("Abstarct method/concrete method");
		
	}
	
}

   class concreteClass extends MyAbstarct {

	@Override
	void myAbstractMethod1() {
		
		System.out.println(" My abstract method-1");
		
	}

	@Override
	void myAbstractMethod2() {
		
		System.out.println(" My abstract method-2");
		
	}
	
	   
} 
public class Abstraction  {

	public static void main(String[] args) {
		//we cannot create object because its incomplete class
		//MyAbstarct ob1 = new MyAbstarct compile time error
		//we can declare the reference
		
		MyAbstarct obj = new concreteClass();
		
		obj.myAbstractMethod1();
		obj.myAbstractMethod2();
		obj.myMethod();
	}

}
