package com.Recursion.Java.in;

public class SumOfNaturalNumbers {
	
	
	static int sum(int n) {
		if(n<=0) {
			return 0;
		}
		
		
		int sumOfNatural = n + sum(n-1);
		return sumOfNatural;
		
		
		
	}
	
	
	
   public static void main(String[] args) {
	
	 System.out.println(  sum(5));
	   
}
}
