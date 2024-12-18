package com.day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
	
		
		
		List<Integer> list = new LinkedList<>();
		
		list.add(10);//adding object
		list.add(20);
		list.add(30);//directly beacuse auto boxing
		list.add(10);
		list.add(7);
		list.add(13);
		System.out.println(list);
//		list.add(1,25);
//		
//		
//		System.out.println(list);
//		System.out.println(list.get(0));
//		
//		list.remove(0);//remove based on index,overroiden in list interface
//		
//		System.out.println(list);
//		
//		list.set(0, null);
//		System.out.println(list);
//		
//		System.out.println(list.contains(10));//true
//		
//		System.out.println(list.size());//4
//		
//		System.out.println(list.isEmpty());//false
//	   
		
		//1way
	     for (int i = 0; i < list.size(); i++) {
	    	 
			System.out.print(list.get(i));
		}
	     System.out.println();
		
		//2way
	     
	     for(Integer i: list) {
	    	 
	    	 System.out.print(i);
	     }
	     System.out.println();
	     
	     //3way iterater
	     list.set(0, 20);
	     
	     
	     Iterator<Integer> it= list.iterator();
	     
	     while(it.hasNext()) {
	    	 Integer t = it.next();
	    	 if(t % 2 == 1) {
	    		 it.remove();
	    	 }
	    	 
	     }
	     System.out.println(list);
	     
	}

}
