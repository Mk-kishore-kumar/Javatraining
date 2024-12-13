package com.day5;




interface Myinterface {// not class
	
	
	
	void myAbstractMethod1();//by default public ,abstract
	void myAbstractMethod2();
	
}

class MyNormalClass implements Myinterface {

	@Override
	public void myAbstractMethod1() {
		
		System.out.println("My abstract method-1");
		
	}

	@Override
	public void myAbstractMethod2() {
		
		System.out.println("My abstract method-2");
	}
	
	
}
public class Interface1 {
	

	public static void main(String[] args) {
		
		Myinterface concrete ;
		concrete = new MyNormalClass();
		concrete.myAbstractMethod1();
		concrete.myAbstractMethod2();
		

	}

}
