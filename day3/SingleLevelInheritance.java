package com.day3;
//scenario vehical

class Vehical {
	// declaring comman functionality,all vehical have one engine

	void noOfEngine() {
        System.out.println("Iam from vehical class");
		System.out.println("I have one engine");
		System.out.println("-----------------");
	}
}

	// reuse of code
	class TwoWheller extends Vehical {
		
//it extends vehical properties
		
		void noOfWheeles() {
            System.out.println("Iam from Two wheller class");
			System.out.println("I have two wheeles");
			System.out.println("-------------------");
		}

	}

	class Bike extends TwoWheller {
//it extends Twowheller properties
		
		void brandName() {
            System.out.println("Iam from Bike class");
			System.out.println("Brand name is : Honda ");
			System.out.println("-----------------------");
		}
	

}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		Bike splinder = new Bike();
		
		splinder.noOfEngine();
		splinder.noOfWheeles();
		splinder.brandName();

	}

}

