package com.Array2D;


import java.util.Scanner;

public class Print2Darray 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Type no. of rows = ");
		int n = sc.nextInt();
		System.out.println();
		System.out.println("Type no. of col = ");
		int m = sc.nextInt();
		
		int arr[][] = new int [n][m];    //n*m : n= row m = col
		
	
		
		for (int i = 0; i < n; i++) 
		{
	       for (int j = 0; j < m; j++)
	       {
	    	   System.out.println("Type the values for row " + i + " and column " + j );
			arr[i][j] = sc.nextInt();
		   }
	    }
		
		
		printArray(arr);
		
	}
	
	
	
	public static void printArray(int arr[][] )
	{
		for (int r = 0; r < arr.length; r++) 
		{
	       for (int c = 0; c < arr.length; c++)
	       {
	    	   System.out.print(arr[r][c] + " ");
			
		   }
	       System.out.println();
	    }
	}

}
