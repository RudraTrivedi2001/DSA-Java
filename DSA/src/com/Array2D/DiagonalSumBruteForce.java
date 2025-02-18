package com.Array2D;

import java.util.Iterator;

public class DiagonalSumBruteForce {

	public static void main(String[] args) 
	{
		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		
		
		int n = arr.length; 
		int m = arr[0].length;
		
		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++) 
			{
				if(i == j)
				{
					sum += arr[i][j];
				}
				else if(i + j == n-1) 
				{
					sum += arr[i][j];
				}
			}
		}
		
		System.out.println(sum);
	

	}

}
