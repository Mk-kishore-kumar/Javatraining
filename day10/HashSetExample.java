package com.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//only one nyull value
public class HashSetExample {

	public static void main(String[] args) {
		
       Set<Integer> set = new HashSet<>(); 
       
       set.add(10);
       set.add(30);
       set.add(20);
       set.add(40);
       //set.add(10);
       set.add(null);
       set.add(null);
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
