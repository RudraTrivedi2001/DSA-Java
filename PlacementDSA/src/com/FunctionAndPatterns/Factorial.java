package com.FunctionAndPatterns;


public class Factorial {
	
	public static int factorial(int a ) {
		if(a <= 1) return 1;
		int value = 1; 
		for (int i = a; i > 1; i--)
		{
			value*=i; 
		}
		
		
		return value;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		int fact = factorial(0);
		System.out.println(fact);
	}

}
