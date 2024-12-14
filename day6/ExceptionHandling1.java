package com.day6;

public class ExceptionHandling1 {

	   
	public static void main(String[] args) {
		
		System.out.println("Before exception");
		
		try {
			
		//int a = 10 / 0;
		//int a = Integer.parseInt("Abc");
			
//			int a = Integer.parseInt("123");
//			int b = 10 / 0;
			
			int arr[] =  new int[-7];//go to gloable type
			
		//pass supertype only at end 	
		
		
		}
		catch(ArithmeticException e) {
			
			System.out.println("A");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("B");
		}
		catch(NumberFormatException e) {
			
			System.out.println("C");
		}
		catch(Exception e) {
			
		 e.printStackTrace();
		 
		}
		
		System.out.println("After excution");

	}

}
