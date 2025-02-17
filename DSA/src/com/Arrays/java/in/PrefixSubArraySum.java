package com.Arrays.java.in;

public class PrefixSubArraySum
{
	
	public static int prefixSum(int arr[])
	{
		int prefixArr[] = new int[arr.length];
		prefixArr[ 0] = arr[0];
		
		for(int i =1; i< prefixArr.length; i++) {
			
			prefixArr[i]  = prefixArr[i-1] + arr[i]; 
			
		}
		int maxSum = 0; 
		for (int i = 0; i < prefixArr.length; i++)
		{
			
			int start = i;
			int currSum = 0;
			
			for (int j = i; j < prefixArr.length; j++)
			{
				int end = j;
				
				
				currSum = start == 0 ? prefixArr[end] :    prefixArr[end] - prefixArr[start -1];
				
				if(currSum > maxSum) {
					maxSum = currSum;
				}
				
			}
			
		}
		
		
		return maxSum;
		
	}
	
	
	
	public static void main(String[] args)
	{
		int arr[] = {1,-2,6,-1,3};
		
		int maxSum = prefixSum(arr);
		System.out.println("Max sum is " + maxSum);
	}

}
