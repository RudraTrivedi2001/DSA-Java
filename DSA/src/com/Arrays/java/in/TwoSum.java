package com.Arrays.java.in;

import java.util.Iterator;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
    	
    	
    	
        int newArray[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int  j = 1 ; j<nums.length; j++ ){

                 if(nums[i]+ nums[j] == target){
                    newArray[0] = i;
                    newArray[1] = j;
                    return newArray; 
                 }
               
            }
        }       return newArray; 
    }
    
    public static void main(String[] args) {
    	
    	int arr[] = {9,0,0,9};
    	int target = 9;
    	
    	int newArr[];
    	
		newArr = twoSum(arr, target);
		
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
	
	}

}
