package com.day4;


class Vehical2 {
	
	void vehicalFunctionalities() {
		System.out.println(" All vehical using petrol or deisel to move from one palce to another place");
		
	}
	
	
}

class Car2 extends Vehical2 {
	
	Wheel1 wheel =null;
	
	Car2(Wheel1 wheel) {
		this.wheel= wheel;
		
	}
	
	void carFunctionalities() {
		
		System.out.println("Each car has its own name,brand");
	}
	
	void carWheelFunctionalities() {
		
		wheel.wheelFunctionalities();
	}
	
	
}

class Wheel1 {
	
	void wheelFunctionalities() {
		
		System.out.println("Bike need 2 wheels");
		System.out.println("car need 4 wheels");
		System.out.println("The wheel has its own brand name and price");
		
	}
	
}
public class Has_A_Relation {

	public static void main(String[] args) {
		
		Wheel1 wheel = new Wheel1();
		
		Car2 car = new Car2(wheel);
		car.vehicalFunctionalities();
		car.carFunctionalities();
		car.carWheelFunctionalities();
	}

}
