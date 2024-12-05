package com.day2;

import java.util.Scanner;


public class ArrayEx3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("enter size of Array");
		
		int size=sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter array elements");
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++) {
			
			
			int countdup=0;
		
		int find=arr[i];
		
		for (int j = i+1;j < arr.length; j++) {
			
			
			if(arr[j]==find && arr[j] != -1)
			{
				countdup++;
				arr[j]=-1;
				
			}
			
		}
		if(countdup >0)
		{
			count++;
			
		}
		}
		
		System.out.println("The count of duplicate is "+ count );
		
	}
}
		