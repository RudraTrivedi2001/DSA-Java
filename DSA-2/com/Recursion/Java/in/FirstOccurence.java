package com.Recursion.Java.in;

public class FirstOccurence {
	
	static void firstApperance(int arr[], int key,int i) {
		
		
		
		if(i>=arr.length) {
			System.out.println("There is no element " + key + " in this array ");
			return;
			
		}
		
		
		if(arr[i] == key) {
			
			System.out.println("The key is at this index " + i);
			return;
		}
		
		i++;
 		
		firstApperance(arr, key,i );
		
	}
	
	
public static void main(String[] args) {
	int arr[] = {2,4,5,6,6,7,8,6,3,3};
	firstApperance(arr, 3, 0);
}
}
