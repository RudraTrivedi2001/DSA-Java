package SortingAlgorithms;

import java.util.Iterator;

public class SelectionSort {	
	
	public static void main(String[] args) 
	{
		
		int arr[] = {5,4,1,3,2};
		
		

		int temp = 0;
		for (int i = 0; i < arr.length -1; i++)   //no reason to compare the last element lopp will run for n-2 iterations
		{
			int minPos = i;         //assuming the minimum or smallest number is in pos i =0;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[minPos] > arr[j])
				{
					minPos= j;
					
				}
			}
			//swap
			temp = arr[i];
			arr[i] = arr[minPos];
			arr[minPos] = temp;
			
			
		}
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
		}

	}

}
