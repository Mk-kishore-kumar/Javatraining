package com.day7;

public class Anonyms {

	 interface Inner4 {
		 
		 void display();
		 
	 }
	public static void main(String[] args) {
		
		Inner4 obj = new Inner4() {

			@Override
			public void display() {
				System.out.println("Annoymous inner class");
			}
		};
		
		obj.display();
			
		

	}

}
