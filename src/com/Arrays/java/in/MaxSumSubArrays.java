package com.Arrays.java.in;

public class MaxSumSubArrays {
	
	
	public static void sumSubArrays(int arr[]) 
	{
		int maxSum = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i; j < arr.length; j++) 
			{
				for (int k = i; k <= j; k++)
				{
					int subArraySum = arr[k];
				}
			}
			
		}
		
	}
	
	

	public static void main(String[] args)
	{
		
      int arr[] = {1,23,5,6,66,7};


	}

}
