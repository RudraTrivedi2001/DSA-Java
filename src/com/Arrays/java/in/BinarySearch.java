package com.Arrays.java.in;

public class BinarySearch 
{
      
	private static int binarySearch(int[] arr, int key) 
	{
		int start = 0;
		int end = arr.length - 1;
		
		
		while(start <= end) 
		{
			int mid = (start + end)/2;
			if(key == arr[mid])      //step 1 when key == arr[mid]
			{
				return mid; 
			}
			
			else if(key > arr[mid])   //if key is greater than arr[mid]
			{
				start = mid + 1;
				
			}else if(key < arr[mid] )   //if key is less than arr[mid]
			{
				end = mid - 1;
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {1,4,5,66,77,88,99,101};
		int n = binarySearch(arr,5);
		
		if(n >= 0) 
		{
			System.out.println("The key is present at index: " + n);
		}else 
		{
			System.out.println("Key is not present");
		}
		
	}

	
}
