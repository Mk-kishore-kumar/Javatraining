package com.day6;


class AgeException extends Exception{// user defined Exception
	
	@Override
	public String toString() {
		
		return "Invalide age for Voteing";
	}
	
}
public class UserDefinedException {

	public static void main(String[] args) {
		
		int age = 10;
		
		if(age >= 18) {
			System.out.println("Welcome to vote");
		}
		else {
			try {
			throw new AgeException();//checked exception(Exception is checked exception it also handled)
			}
			catch(AgeException e) {
				
				System.out.println(e);
			}
		}

	}

}
