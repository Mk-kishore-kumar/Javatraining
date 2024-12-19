package com.day10;

import java.util.LinkedList;
import java.util.Queue;

//queue is subineterface of collection
//achieve the queue with help of linked list so linked list rules will apply
//acc duplicate
//no connection between list and queue
public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer>  queue = new LinkedList<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(null);
		queue.offer(null);
		
		System.out.println(queue);//10 20 30 40
		
		queue.poll();//remove 10
		
		System.out.println(queue);
		

	}

}
