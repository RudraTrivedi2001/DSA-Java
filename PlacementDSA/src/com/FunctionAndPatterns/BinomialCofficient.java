package com.FunctionAndPatterns;

public class BinomialCofficient {
	
	public static int factorial(int a ) {
		if(a <= 1) return 1;
		int value = 1; 
		for (int i = a; i > 1; i--)
		{
			value*=i; 
		}
		
		
		return value;
	}
	
	public static int binomialCofficient(int n, int r ) {
		if (n < r || r < 0) return 0; // Edge case handling
		int value = factorial(n)/(factorial(r)*factorial(n - r));
		
		return value;
		
	}
	
	
	public static void main(String[] args) 
	{
		int cofficient  = binomialCofficient(11, 3);
		
		System.out.println(cofficient);
	}

}
