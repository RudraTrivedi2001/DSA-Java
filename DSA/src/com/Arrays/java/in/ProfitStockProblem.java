package com.Arrays.java.in;

public class ProfitStockProblem {
	
	/*
	💡 Problem Statement:
	You are given an array `prices` where `prices[i]` is the price of a given stock on the `i`th day.
	You need to return the **maximum profit** you can achieve from this transaction.
	You may **buy** and **sell** only once.

	✅ Example 1:
	Input: prices = [7,1,5,3,6,4]
	Output: 5
	Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.

	✅ Example 2:
	Input: prices = [7,6,4,3,1]
	Output: 0
	Explanation: No transactions can be made since the prices only decrease.
	*/


	public static void main(String[] args)
	{
		int [] prices = {7,6,4,3,1};
		int maxprofit = 0;
		
	    int bp = prices[0];
		int profit = 0;
			
			for (int i =  1; i < prices.length; i++) 
			{
				int sp = prices[i];
				
				if(bp > sp)
				{
					profit = sp - bp;
					bp = sp;
					
				}else 
				{
					profit = sp-bp;
				}
				if(profit > maxprofit && profit>=0)
				{
					maxprofit = profit;
				}
				
			}
			System.out.println(maxprofit);
			
	}
		
	
		

}


