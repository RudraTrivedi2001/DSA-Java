package com.Arrays.java.in;

import java.util.Iterator;

public class RotateArray2 
{
public static void main(String[] args)
{
	
	
	int arr[] = {1,2,3,4,5,6,7};	
	
	reverse(arr, 3);
	
	for (int i = 0; i < arr.length; i++) 
	{
		System.out.print(arr[i] + " ");
		
	}
}

private static void reverse(int[] arr, int i) {
	
	int k = 3;
	int start = 0;
	int end = arr.length -1;
	
	rotate(arr, start,end); //rotate whole array
	
	rotate(arr, start, k);    // rotate array from start to the k
	
	rotate(arr, k+1, end); //rotate the remaning side of the array
	
	
}

private static void rotate(int[] arr, int start, int end)
{
	int temp = 0;
	while(start < end)
	{
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++ ;
		end --;
	}
	
}
}
