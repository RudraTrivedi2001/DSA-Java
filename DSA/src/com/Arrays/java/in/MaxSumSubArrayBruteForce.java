package com.Arrays.java.in;

import java.util.Iterator;

public class MaxSumSubArrayBruteForce 
{
	
	
 public static void main(String[] args) {
	
	 
	 int arr[] = {2,4,6,8,10};
	
	 int temp = 0;
	 for (int i = 0; i < arr.length; i++) {
		 int start = i;
		 for (int j = i; j < arr.length; j++) {
			 int sum = 0;
			int end = j;
			
			for (int k = start; k <=end; k++) {
				sum+= arr[k];
				
			}
			if(sum>= temp) {
				temp = sum;
			}
			
			
		}
		 
		
	}
	 
	 System.out.println(temp);
}

}
