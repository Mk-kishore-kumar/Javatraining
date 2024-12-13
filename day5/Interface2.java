package com.day5;

// Implements Multiple Interfaces

interface Myinterface1 {// not class
	
	
	
	void myAbstractMethod1();//by default public ,abstract
	
	
}

interface Myinterface2 {
	
	void myAbstractMethod2(); 
}

class MyNormalClass1 implements Myinterface1, Myinterface2 {

	@Override
	public void myAbstractMethod1() {
		
		System.out.println("My abstract method-1");
		
	}

	@Override
	public void myAbstractMethod2() {
		
		System.out.println("My abstract method-2");
	}
	
	
}
public class Interface2 {
	

	public static void main(String[] args) {
		
		MyNormalClass1 concrete = new MyNormalClass1();
		
		concrete.myAbstractMethod1();
		concrete.myAbstractMethod2();
		
		
//		Myinterface concrete ;
//		concrete = new MyNormalClass();
//		concrete.myAbstractMethod1();
//		concrete.myAbstractMethod2();
//		

	}

}

