package com.day5;

abstract class Vehicle {
	
	void noOfEngine() {
		
		System.out.println("Having one engine");
	}
	
	abstract void noOfWheel();
	abstract void brandName();
	
}

class Bike extends Vehicle {

	@Override
	void noOfWheel() {
		
		System.out.println("Two wheels");
		
	}

	@Override
	void brandName() {
		
		System.out.println("Bullet");
	}
	
	
}

class Car extends Vehicle {
	
	void noOfWheel() {
		System.out.println("4 wheel");
	}
	
	void brandName() {
		
		System.out.println("Bmw");
	}
}
public class Abstraction2 {

	public static void main(String[] args) {
		
		//Car car = new Car(); same object
		Vehicle vec;
		
		System.out.println("---Bike object details---");
		 vec = new Bike();
		 System.out.println("Iam bike Address "+vec);
		 vec.noOfEngine();
		 vec.noOfWheel();
		 vec.brandName();//object get memory at run time;
		 
		 System.out.println("----car object details---");
		 //vec = car;
		 vec = new Car();  
		 System.out.println("Iam car address "+vec);
		 vec.brandName();
		 vec.noOfWheel();
		 vec.noOfEngine();
	}

}
