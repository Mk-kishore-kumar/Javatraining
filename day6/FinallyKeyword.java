package com.day6;

public class FinallyKeyword {

	public static void main(String[] args) {
		
		
		
		
    System.out.println("Before exception");
		
		try {
		
			int arr[] =  new int[-5];//go to gloable type
			
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
		catch(NegativeArraySizeException e) {
			
			System.out.println("D");
		}
		finally {
			System.out.println("Iam from finally block");
		}
		
		System.out.println("After excution");
		
	}

	}


