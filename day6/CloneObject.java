package com.day6;

public class CloneObject {
	
	int a = 10;

	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneObject obj1 = new CloneObject();//object1
		
		CloneObject obj2 = (CloneObject) obj1.clone();//object 2
		
		obj1.a=20;
		
		System.out.println(obj2.a);
		System.out.println(obj1.a);
        System.out.println(obj1.hashCode());         
        System.out.println(obj2.hashCode());         
	}

}
