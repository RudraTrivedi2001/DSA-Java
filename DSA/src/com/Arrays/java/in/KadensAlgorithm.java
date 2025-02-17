package com.Arrays.java.in;

public class KadensAlgorithm {
	
	
	public static int kadens(int arr[]) 
	{
		
		int maxSum = 0;
		int currentSum = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			currentSum = currentSum + arr[i];
			if(currentSum < 0) 
			{
				currentSum = 0;
			}
			
			if(maxSum < currentSum) 
			{
				maxSum = currentSum;
			}
			
		
			
			
		}
		return maxSum;
		
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {3, -2, 5, -1, 6, -3, 2, 7, -5, 2};
		int max = kadens(arr);
		
		System.out.println("Max Sum is " + max);
	}

}
