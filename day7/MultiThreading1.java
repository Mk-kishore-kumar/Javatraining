package com.day7;

public class MultiThreading1 extends Thread{
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() +" My thread is running");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {// TODO Auto-generated method stub
		
		Thread  t = Thread.currentThread();
		System.out.println(t);
		
		
		
		
		System.out.println(t.getPriority());
		System.out.println(t.getName());
		System.out.println(t.getState());
		
		MultiThreading1 t1 = new MultiThreading1();
		t1.setName("T1");
		t1.start();
		
		
		MultiThreading1 t2 = new MultiThreading1();
		t2.setName("T2");
		t2.start();
		
		System.out.println("Main ended");
	}

}
