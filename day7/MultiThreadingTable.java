package com.day7;


class TwoTable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("2 * "+i+" = "+ (i*2));
			
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	
}

class FiveTable extends Thread {
	@Override
	public void run() {
for (int i = 1; i <= 10; i++) {
			
			System.err.println("5 * "+i+" = "+ (i*5));
			
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	}
	

public class MultiThreadingTable {

	public static void main(String[] args) {
		
		Thread obj1 = new Thread(new TwoTable());
		obj1.setName("Two");
		obj1.start();
		try {
			obj1.join();
			System.out.println("-----------------");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FiveTable obj2 = new FiveTable();
		obj2.setName("Five");
		obj2.start();
		
		try {
			obj2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("iam  main");

	}

}
