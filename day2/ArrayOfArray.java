package com.day2;

import java.util.Scanner;

public class ArrayOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[][] =new int[3][];
		
		arr[0]=new int[] {1, 2};
		arr[1]=new int[] {3, 4, 5, 6};
		arr[2]=new int[] {7, 8, 9};
		
		System.out.println("Array Elements are");
		
		for(int i[]: arr) {
			for(int j: i) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
		
		
		
		
	}

}
