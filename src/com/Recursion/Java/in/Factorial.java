package com.Recursion.Java.in;

public class Factorial {
	
	static int calcFactorial(int n) {
		
		if(n ==0) {
			return 1;
			
		}
		
		int f = n * calcFactorial(n-1);
		return f;
		
	}

	
	public static void main(String[] args) {
		System.out.println("Factorial is " + calcFactorial(5));
	}
}
