package com.Array2D;

public class DiagonalSumOptimized {

	public static void main(String[] args) 
	{
		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		
		
		int n = arr.length; 
		int m = arr[0].length;
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			sum += arr[i][i];
			if(i != arr.length -1-i)
			{
			sum += arr[i][arr.length -1 -i];	
			}
		}
		System.out.println(sum);

	}

}
