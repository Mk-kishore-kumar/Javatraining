package com.day7;

// infuture we can extend multiple interface 
class Multithreading6 extends Thread implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " My thread is running");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
 }
public class ThreadExample4 {

	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new Multithreading6());
		t1.setName("kishore");
		t1.start();
	}

}
