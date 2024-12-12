package com.day4;

class Vehical {
	
	void noOfEngine() {
		
		System.out.println("I have one engine");
	}
	
	void noOfWheels() {
		
		System.out.println("Cannot define here");
	}
	
}

class TwoWheeler extends Vehical {
	
	void noOfWheels() {
		
		System.out.println("I have two wheels");
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		TwoWheeler  obj = new TwoWheeler();
		obj.noOfWheels();
		Vehical  obj2 = new Vehical();
		obj2.noOfWheels();
		
	}

}
