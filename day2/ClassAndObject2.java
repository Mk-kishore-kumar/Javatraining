package com.day2;

class Mobile {
	String brandName;
	int ram;
	double price;
	
	Mobile(String brandName, int ram, double price) {//Constructor
		
		this.brandName = brandName;
		this.ram = ram;
		this.price = price;
		
		}
	
	public void displaydetails() {
		
		System.out.println("Brand :"+brandName);
		System.out.println("ram :"+ram);
		System.out.println("price :"+price);
		System.out.println("------------");
		System.out.println();
		
		}
	}

public class ClassAndObject2 {

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile("iphone",6,49000);
		m1.displaydetails();
		
		
		Mobile m2 = new Mobile("Redmi",8,29000);
		m2.displaydetails();
		
		
		
	}

}
