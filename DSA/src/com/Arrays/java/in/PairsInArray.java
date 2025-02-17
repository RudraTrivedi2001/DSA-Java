package com.Arrays.java.in;

public class PairsInArray
{
	public static void pairs(int[] arr) 
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 1+i; j < arr.length; j++) 
			{
				System.out.print("(" + arr[i] + ", " + arr[j] + " )");
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void main(String[] args) 
	{
		int arr[]  = {1,2,3,4,5,6};
		pairs(arr);
	}

}
