package com.Arrays.java.in;

public class SumOfSubArrays {
	
	public static void main(String[] args) {
		
		int arr[] = {2,4,6,8,10};
		
		for(int i = 0; i < arr.length; i++ ) {
			int start = i;
			
			
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				int end = j;
				
				
				for (int k = start; k <= end; k++) {
					
					
					System.out.print(arr[k] + " ");
					
					sum += arr[k];
				}
				System.out.println();
				System.out.println("Sum  of sub Array = " + sum);
				
			}
			System.out.println();
		}
		
	}
	
	

}
