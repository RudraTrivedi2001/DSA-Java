package com.Recursion.Java.in;

public class CheckSortedArray {
	
	static void sortedOrNot(int arr[], int i) {
		
		
	
		if(i >= arr.length -1) {
			System.out.println("sorted");
			return;
		}
		
		if(arr[i] > arr[i+ 1]) {
			
			System.out.println("Not sorted");
			return;
		}
		i++;
		
		
		sortedOrNot(arr, i++);
		
		
	}
	
	
	
public static void main(String[] args) {
	
	
	int arr[] = {2,4,23,8,9};
	
	sortedOrNot(arr, 0);
	
}
}
