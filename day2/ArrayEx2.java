package com.day2;


import java.util.Scanner;


public class ArrayEx2 {

	public static void main(String[] args) {
		int countodd=0;
		int counteven=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter size of Array");
		
		int size=sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter array elements");
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] % 2 == 0)
			{
				counteven++;
			}
			else if(arr[i] % 2 != 0)
			{
				countodd++;
			}
		}
		
		System.out.println("The count of odd is "+ countodd +" count of Even elements is: "+counteven);
		
	}
}
		