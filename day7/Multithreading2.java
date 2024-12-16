package com.day7;

public class Multithreading2 extends Thread {
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

	public static void main(String[] args) {// TODO Auto-generated method stub

		Multithreading2 t2 = new Multithreading2();
		t2.setName("T2");
		t2.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}

		System.out.println(t2.getState());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		System.out.println("Main End");
		
		System.out.println(t2.getState());
		
	}

}
