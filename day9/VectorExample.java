package com.day9;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
// to traverse vector we use enumuration
	public static void main(String[] args) {
		
		Vector<Integer> vec = new Vector<>(3,2);//3 is initial capacity, 2 after fill increment by 2
          
		System.out.println(vec.size());//0
		System.out.println(vec.capacity()+"iam capacity");//3
		
		vec.add(10);
		
		System.out.println(vec.size());
		System.out.println(vec.capacity()+"iam capacity");
		vec.add(20);
		vec.add(30);

		System.out.println(vec.size());
		System.out.println(vec.capacity()+"iam capacity");
		
		vec.add(40);
		System.out.println(vec.size());
		System.out.println(vec.capacity()+"iam capacity");
		vec.add(60);
		System.out.println(vec.size());
		System.out.println(vec.capacity()+"iam capacity");
		
		vec.add(70);
		System.out.println(vec.size());
		System.out.println(vec.capacity()+"iam capacity");
		
		
		Enumeration<Integer> e = vec.elements();
		
		while(e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
		}
		
	}

}
