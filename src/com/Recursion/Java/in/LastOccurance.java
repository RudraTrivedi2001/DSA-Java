package com.Recursion.Java.in;

public class LastOccurance {
	
	static void findLastOccurence(int arr[], int key, int i) {
		
		
		

		if(i<0) {
			System.out.println("There is no element " + key );
			return;
		}
		
		if(arr[i] == key ) {
			System.out.println("The Last occurence of element is at index " + i);
			return;
		}
		
		findLastOccurence(arr, key, i-1);
		
		
	}
	
	public static void main(String[] args) {
		int arr[] = {4,9,0,0,3,6,7,0,4,5,6,7,8};
		int i = arr.length-1;
		findLastOccurence(arr, 55, i);
	}

}
