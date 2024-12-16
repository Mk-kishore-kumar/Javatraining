package com.day7;

public class InnerClass3 {

	
	
	static class Inner4 {
		
		static void display() {
			
			System.out.println("Local inner Class");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		Inner4 obj2 = new Inner4();
		
		obj2.display();
		Inner4.display();
		
		class Inner3 {
			
			void display() {
				
				System.out.println("Local inner Class");
			}
		}
		
		Inner3 obj = new Inner3();
		
		obj.display();
		
		


	}

}
