package com.Arrays.java.in;

import java.util.Scanner;

public class LinearSearch 
{
	
	public static int linearSearch(int arr[], int key)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] == key) 
			{
				return i; 
			}
			
		}
		return 0;
		
		
	}
	
	public static int[] arrInput() 
	{
		System.out.println("Type the size of array");
		   Scanner sc = new Scanner(System.in);	
		    int n = sc.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter the array numbers");
			for (int i = 0; i < arr.length; i++)
			{
				
				arr[i] = sc.nextInt();
				
			}
			return arr;
	}
	
	public static void main(String[] args)
	{ 
	   
		int[] arr = arrInput();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Key you want find: ");
		int key = sc.nextInt();
		int i = linearSearch(arr,key);
		if(i >= 0)
		{
			System.out.println("Key is at index : " + i );
		}
		else 
		{
			System.out.println("Key is not in the array");
		}
		
		
	}

}
