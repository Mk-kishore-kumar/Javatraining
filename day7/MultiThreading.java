package com.day7;

public class MultiThreading {

	public static void main(String[] args) {
		Thread  t = Thread.currentThread();
		System.out.println(t);
		
		
		System.out.println(t.getPriority());
		System.out.println(t.getName());
		System.out.println(t.getState());
		try {
		t.stop();
		}
		catch(UnsupportedOperationException e){
		System.out.println(e.getMessage());
		}
		System.out.println(t.getState());
	}

}
