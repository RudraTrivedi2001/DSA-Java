package com.Arrays.java.in;

public class ReverseArray 
{
	
	public static int[] reverse(int arr[])
	{
		
		int start = 0;
		int end = arr.length -1;
		int mid = (start + end )/2;
		int temp = 0;
		
		
		for(int i = 0; i <= mid ; i++ )
		{
			temp = arr[end - i];
			arr[end - i] = arr[start + i];
			arr[start+ i] = temp;
			
		}
			
		return arr;
	}
	
	
	
public static void main(String[] args)
{
	
	int arr[] = {4,55,66,33,22,5,1};
	int [] reverseArr = reverse(arr);
	for (int i = 0; i < reverseArr.length; i++)
	{
		System.out.print(reverseArr[i] + ", ");
	}
}
}
