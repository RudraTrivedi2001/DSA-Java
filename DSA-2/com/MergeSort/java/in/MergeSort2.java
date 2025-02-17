/**
 * Merge Sort in Descending Order
 */

package com.MergeSort.java.in;

public class MergeSort2 {

	
	public static void main(String[] args) {
		int arr[] = {3,5,6,7,8,9,2,22,45,24,57,35,7,2,2,5,24,5,68,67,6,76,564,53,434,23};
		
		mergeSort(arr, 0, arr.length-1);
		printArray(arr);
	}

       static void printArray(int[] arr) 
       {
		
    	   for (int i = 0; i < arr.length; i++) 
    	   {
			System.out.print(arr[i] + " ");
		}
    	  
		
	}

	static void mergeSort(int[] arr, int si, int ei) {
    	   
    	   if(si>=ei) {  //meaning there is only one sorted element in the arr 
    		   return;
    	   }
		int mid = si +(ei-si)/2;
		
		mergeSort(arr, si, mid); //left
		mergeSort(arr, mid+1, ei);  //right
		merge(arr, mid, si,ei);
		
	}

      static void merge(int[] arr, int mid, int si, int ei) {
	     int temp[] = new int[ei-si+1];
	     int i = si;
	     int j = mid+1;
	     int k = 0;
	     
	     
	     while(i<=mid && j<=ei)
	     {
	    	 if(arr[i] > arr[j]) 
	    	 {
	    		 temp[k] = arr[i];
	    		 i++; 
	    	 }else 
	    	 {
	    		 temp[k] = arr[j];
	    		 j++; 
	    	 }
	    	 k++;
	    	 
	     }
	     //if elements remaning in left side 
	     
	     while(i<=mid) 
	     {
	    	 temp[k] = arr[i];
	    	 i++; k++;
	     }
	     //if right side has elements remaning
	     while(j<=ei) 
	     {
	    	 temp[k] = arr[j];
	    	 j++; k++;
	    	 
	    	 
	     }
	     
	     //copy these temp[] values back to the original array
	     
	     for ( k = 0, i = si; k < temp.length; k++, i++)
	     {
			arr[i] = temp[k];
			
		}
		
	}
}
