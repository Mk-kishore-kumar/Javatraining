package com.day2;

import java.util.Arrays;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
    		
		int arr[] = {1, 6, 5, 4, 8};
		
		Arrays.sort(arr);
		
		System.out.println("After Sorting");
		
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
		System.out.println("After Reverse");
		
		for(int i=arr.length-1 ; i >= 0 ; i--)
		{
			
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
		System.out.println("Enhanced For Loop");
		for(int i: arr)
		{
			System.out.print(i+" ");
		}

	}

}
