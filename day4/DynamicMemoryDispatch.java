package com.day4;



class Vehical1 {
	
	public void capacity() {
		
		System.out.println("capacity is:");
	}
	
	  
}
class Bike extends Vehical1 {
	
	 public void capacity() {
		 
		 System.out.println("capacity is "+2);
		 
	 }
}

class Car extends Vehical1 {
	
	
	public void capacity() {
		
		System.out.println("capacity is"+5);
		
	}
}

class Bus extends Vehical1 {
	
	   public void capacity() {
		   
		   System.out.println("capacity is:"+10);
	   }
}

public class DynamicMemoryDispatch {
	
       
	public static void main(String[] args) {
		
		Vehical1 obj1 = new Bus();
		obj1.capacity();
		Vehical1 obj2 = new Car();
		obj2.capacity();
		
        
	}

}
