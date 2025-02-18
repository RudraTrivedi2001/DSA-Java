package com.Arrays.java.in;

public class TrappingRainwaterQ 
{
	/*
	💡 Problem Statement:
	Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, 
	compute how much water it can trap after raining.
	*/
	static int width =1 ; // Har bar ka width 1 mana hai
	
	public static void main(String[] args)
	{
		// Bar heights ka array
		int height[] = {4,2,0,3,2,5};
		
		// Left max aur Right max arrays create kar rahe hain
		int lm[] = leftmax(height);
		int rm[] = rightmax(height);
		
		// Left max array print kar rahe hain
		for (int i : lm) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// Right max array print kar rahe hain
		for (int i : rm) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// Total trapped water calculate kar rahe hain
		int trappedWater = waterTrapped(height,lm, rm);
		System.out.println("Water Trapped is " + trappedWater);
	}

	private static int waterTrapped(int[] height, int[] lm, int[] rm) {
		// Har index par pani ki height ka calculation
		int totalWaterTrapped = 0;
		for (int i = 0; i < height.length; i++)
		{
			// Water level minimum of left max aur right max hoga
			int waterLevel = Math.min(rm[i], lm[i]);
			// Us bar ke andar kitna pani aa sakta hai
			int waterInBar = (waterLevel - height[i]) * width;
			
			// Total pani ka sum kar rahe hain
			totalWaterTrapped += waterInBar;
		}
		return totalWaterTrapped;
	}

	private static int[] rightmax(int[] height)     
	{
		int n = height.length;
		int rm[] = new int[n];
		rm[n-1] = height[n-1]; // Sabse right ka right max wahi hoga
		
		// Right se traverse kar rahe hain
		for (int i = n-2; i >= 0; i--) 
		{
			// Agar current height, previous right max se bada hai to update karo
			if(height[i] > rm[i+1] )  
			{
				rm[i] = height[i];    
			}else              
			{
				rm[i] = rm[i+ 1]; // Nahi to pehle ka hi max use karo
			}
		}
		return rm;
	}

	private static int[] leftmax(int[] height)
	{
		int lm[] = new int[height.length ];
		lm[0] = height[0]; // Leftmost bar ka left max wahi hoga
		
		// Left se traverse kar rahe hain
		for (int i = 1; i < height.length; i++) 
		{
			// Agar current height, previous left max se bada hai to update karo
			if(height[i] > lm[i-1] )  
			{
				lm[i] = height[i];    
			}else              
			{
				lm[i] = lm[i-1]; // Nahi to pehle ka hi max use karo
			}
		}
		return lm;
	}
}
