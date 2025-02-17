package com.Arrays.java.in;

public class BuyAndSellStocks 
{
	
	public static int maxProfit(int[] prices) 
	{
		
		//step 1 create a var named buyPrice 
		int buyPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		buyPrice = prices[0]; // Assume First day you will buy stock so BP will be whatever the stock price is that day
		for (int i = 1; i < prices.length; i++)
		{
			int profit = 0;                    
			int sellingPrice  = prices[i];
			if(buyPrice < sellingPrice)   //case 1 : if BP is bigger than SP calculate profit 
			{
				profit = sellingPrice - buyPrice; 
			}else            //Case 2: BP is smaller than SP then BP will become SP. We are doing this to buy stock in lowest price 
			{
				buyPrice = sellingPrice;
			}
			if(profit > maxProfit) 
			{
				  maxProfit = profit;
			}
			
			
		}
		
		return maxProfit;
		
		
		
	}
	
	public static void main(String[] args)
	{
		
		int prices[] = {7,1,5,3,6,4};
		int max = maxProfit(prices);
		System.out.println(max);
		
	}

}
