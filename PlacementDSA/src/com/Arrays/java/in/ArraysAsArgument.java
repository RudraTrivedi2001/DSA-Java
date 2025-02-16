package com.Arrays.java.in;

public class ArraysAsArgument 
{
	
	
	public static void example(int arr[])
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args)
	{
		
		int[] arr = {1,2,3,4,5,6,7};
	example(arr);	
	}

}
