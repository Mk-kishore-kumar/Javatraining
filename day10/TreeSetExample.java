package com.day10;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//no duplicate
//no index
//sorted order
//no null
//we cannot compare null with integer

//object generic any object

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//we cannot go with object generic we get class cast exception
		
		//how to reverse ,by using collections class methods
       Set<Integer> set = new TreeSet<>(Collections.reverseOrder()); 
       
       set.add(10);
       set.add(30);
       set.add(20);
       set.add(40);
       //set.add(10);
//       set.add(null);// we cannot compRE NULL
//       set.add(null);
       System.out.println(set.add(10));//not alloww duplicate hashset,set
       System.out.println(set);
       
       System.out.println(set.isEmpty());
       System.out.println(set.size());
       System.out.println(set.contains(10));
       
       //way1
       for(Integer i : set) {
    	   
    	   System.out.println(i);
       }
       
       System.out.println();
       
       //way2
       //need to import it is interface ,method
       Iterator<Integer> it = set.iterator();
       
       while(it.hasNext()) {
    	   
    	   System.out.println(it.next());
    	   
       }
       
	}

}
