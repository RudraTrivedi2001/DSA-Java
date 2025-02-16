package com.Arrays.java.in;

public class FindLargest
{
	public static int findLargest(int[] arr)
	{
		int temp = 0;
		
		for(int i = 0; i< arr.length; i++)
		{
		
		if(arr[i] > temp ) 
		{
			temp = arr[i];
		}
		}
		return temp;
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		int arr[] = {22,33,55,66,789,11,77,99};
		int n = findLargest(arr);
		System.out.println(n);
	}


}
