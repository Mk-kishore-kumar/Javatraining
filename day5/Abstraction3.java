package com.day5;

//Abstract class with constructor

abstract class Vehicle1 {
	
	Vehicle1(int a) {
		this();
		System.out.println("Abstract class constructor");
	}
   Vehicle1() {
		
		System.out.println("Abstract class constructor2");
	}
	void noOfEngine() {
		
		System.out.println("Having one engine");
	}
	
	abstract void noOfWheel();
	abstract void brandName();
	
}

class Bike1 extends Vehicle1 {

	Bike1() {// default constructor 
		
		super(10);
		
	}
	@Override
	void noOfWheel() {
		
		System.out.println("Two wheels");
		
	}

	@Override
	void brandName() {
		
		System.out.println("Bullet");
	}
	
	
}


public class Abstraction3 {

	public static void main(String[] args) {
		
		//Car car = new Car(); same object
		Vehicle1 vec;
		
		System.out.println("---Bike object details---");
		 vec = new Bike1();
		 vec.noOfEngine();
		 vec.noOfWheel();
		 vec.brandName();//object get memory at run time;
		 
		
	}

}

