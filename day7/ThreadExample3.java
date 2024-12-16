package com.day7;


 class Multithreading5 extends Thread {
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
public class ThreadExample3 {

	
	public static void main(String[] args) throws InterruptedException{
		
		Multithreading5 t1 = new Multithreading5();
		t1.setName("t1");
		t1.start();
		
		try {
			
			Thread.sleep(3000);
			
			}
		catch(InterruptedException e) {
			
		}
		t1.join();
		
		
		System.out.println("Main ended");
		}
		
	}

 
