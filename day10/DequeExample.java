package com.day10;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
//deque both side prform
//array is base of all ds
//queue is subineterface of collection
//achieve the queue with help of linked list so linked list rules will apply
//acc duplicate
//no connection between list and queue
public class DequeExample {

	public static void main(String[] args) {
		Deque<Integer>  d = new LinkedList<>();
		d.offer(10);
		d.offer(20);
		d.offer(30);
		d.offer(40);
	    d.offerFirst(91);
	    d.offerLast(100);
		d.offer(null);
		d.offer(null);
		
		System.out.println(d);//10 20 30 40
		
		d.poll();//remove 10
		
		System.out.println(d);
		
		d.pollLast();
		System.out.println(d);
		
		
		

	}

}
