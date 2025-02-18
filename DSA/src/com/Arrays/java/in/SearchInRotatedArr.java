package com.Arrays.java.in;

public class SearchInRotatedArr {

	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7};	
		int pivotIndex = 2;
		reverse(arr, pivotIndex);
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		
		int val = 4;
	
		int num = search(arr, val);
		
		System.out.println("after rotation at a pivot index => " + pivotIndex + " the number is in  position " + num);
		
		

	}
	
	
	public static int search(int[] arr, int val) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i] == val)
			{
				return i;
			}
			
		}
		    
		    
		return -1;
	
	}


	public static void reverse(int[] arr, int i) {
		
		int k = i;
		int start = 0;
		int end = arr.length -1;
		
		rotate(arr, start,end); //rotate whole array
		
		rotate(arr, start, k);    // rotate array from start to the k
		
		rotate(arr, k+1, end); //rotate the remaning side of the array
		
		
	}
	
	public static void rotate(int[] arr, int start, int end)
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


