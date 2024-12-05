package com.day2;

public class ArrayMemoryAllocation {

	public static void main(String[] args) {
		
		int arr[][] = {{1, 2}, {3, 4, 5, 6}, {7, 8, 9}};//after comma
		
		System.out.println("This is length");
		System.out.println("outer 1d arraylength:"+arr.length);//3
		System.out.println(arr[0].length);//2
		System.out.println(arr[1].length);//4
		System.out.println(arr[2].length);//3
		
		System.out.println("Array to Array");
		
		for (int i = 0; i < arr.length; i++) {
			
			for(int j=0; j<arr[i].length ;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			
			System.out.println();
		}
		
		System.out.println("Using Enhanced ForLoop");
		
		for(int i[] : arr) {// sending 1, 1d array for each iterartion 
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
