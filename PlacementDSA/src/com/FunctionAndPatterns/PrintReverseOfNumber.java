package com.FunctionAndPatterns;

public class PrintReverseOfNumber {
	
	
	
	public static void reverse (int n )
	{
		
     while(n > 0)
     {
    	 
    	int last = n % 10;
    	System.out.print(last);
		 n = n /10;

     }
    
		
	}
	public static void main(String[] args)
	{
		reverse(1011);
	}

}
