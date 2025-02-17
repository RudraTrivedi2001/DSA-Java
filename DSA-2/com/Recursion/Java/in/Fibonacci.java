package com.Recursion.Java.in;

public class Fibonacci {
	
	
	
	
	static int fibNumber(int n) {
		
		if(n == 1) {
			return 1;
		}
		if(n == 0) {
			return 0;
		}
		
		int fnminus1 = fibNumber(n-1);
		int fnminus2 = fibNumber(n-2);
		int fib = fnminus1 + fnminus2;
		return fib;
		
	}

	public static void main(String[] args) {
	System.out.println(fibNumber(6));

	}

}
