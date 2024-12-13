package com.day5;

interface VehiclePlan {//this is plan
	
	void noOfEngine();
	void noOfWheels();
	void brandName();
}

abstract class ActualVehical implements VehiclePlan {
	
	 public void noOfEngine() {
		 
		 System.out.println("I have one engine");
	 }
	 	
}

class Bikes extends ActualVehical {

	@Override
	public void noOfWheels() {
		
		System.out.println("I have two wheel");
	}

	@Override
	public void brandName() {
		
		System.out.println("Bullet");
	}
	
	  
}
public class InterfaceExample4 {
	
	

	public static void main(String[] args) {
		    
		VehiclePlan vehicalplan ;
		vehicalplan = new Bikes();
		vehicalplan.brandName();
		vehicalplan.noOfWheels();
		vehicalplan.noOfEngine();
		
	}

}
