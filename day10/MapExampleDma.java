package com.day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExampleDma {
//unorder 
	//override previous one when duplicate key
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		map.put(20,"java");
		map.put(10,"python");
		map.put(30,"PHP");
		map.put(50,".net");
		map.put(null,null);
		map.put(null,"j");
		
		System.out.println(map);
		map.remove(null);
		System.out.println(map);
		System.out.println(map.get(20));//java
		
		System.out.println(map.size());//4
		
		System.out.println(map.isEmpty());//false
		System.out.println(map.containsKey(10));//true
		System.out.println(map.containsValue(".netj"));
		
		//way1
		Set<Integer> keys = map.keySet();
		
		System.out.println(keys);// it comes with all the key in the form of set
		
		for(Integer key: keys) {
			
			System.out.println(key +" => "+ map.get(key));
		}
		
		System.out.println();
		//using iterartor
		
		Iterator<Integer> it = keys.iterator();
		
		System.out.println(it);
		
		while(it.hasNext()) {
			
			Integer key = it.next();
			System.out.println(key+" "+ map.get(key));
			
		}
		
		//way 2 is binding both key,value
		//entry is class
		Set<Entry<Integer,String>> entries = map.entrySet();
		
		System.out.println(entries);
		
		for(Entry<Integer,String> entry : entries) {
			System.out.println(entry.getKey() +"=>"+entry.getValue());
		}
		
		Iterator<Entry<Integer,String>> it1 = entries.iterator();
		
		while(it1.hasNext()) {
			Entry<Integer,String> entry = it1.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		

	}

}
