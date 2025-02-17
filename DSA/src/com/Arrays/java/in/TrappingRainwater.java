package com.Arrays.java.in;


public class TrappingRainwater {

	public static int rainWaterTrapped(int arr[], int width) 
	
	{
		
		
		//step 1 create a Leftmax auxilarly array
		
		int leftMax[] = new int[arr.length];
		
		leftMax[0] = arr[0];
		
		for (int i = 1; i < leftMax.length; i++) 
		{
			if(leftMax[i-1]< arr[i]) 
			{
				leftMax[i] = arr[i];
				
			}else
			{
				leftMax[i] = leftMax[i-1];
			}
		}
		
		
		//step 2 Create a right max also start from the end of the array
		
		
		int rightmax[] = new int[arr.length];
		
		rightmax[rightmax.length -1] = arr[arr.length -1];
		
		for (int i = rightmax.length -2; i >= 0; i--)
		{
			
			if(rightmax[i+1]< arr[i]) 
			{
				rightmax[i] = arr[i];
				
			}else
			{
				rightmax[i] = rightmax[i+1];
			}
			
		}
		
		//step 3 now you have got both the LM and RM for each bar so the minimum of the two will be waterlevel of the bar
		//to calculate the trapped water formulae used ---> (w - x) * width...........w = min of lm and rm for a bar;
		
		int trappedWater = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			int currentTrappedWater = 0;
		    int waterLevel = Math.min(leftMax[i], rightmax[i]);
			
			currentTrappedWater = Math.max(0,(waterLevel - arr[i] ) * width); 
			trappedWater = trappedWater + currentTrappedWater;
			
		}
		
		return trappedWater;
		
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		
		
		
        int arr[] = {4,2,0,6,3,2,5};
        int width = 1;
     int waterTrapped =    rainWaterTrapped(arr, width);
     System.out.println(waterTrapped);
     
 
	}

}
