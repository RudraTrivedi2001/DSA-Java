package com.FunctionAndPatterns;

public class PrimeOrNot {
	
	
	public static boolean isPrime(int a) {
		
		if(a <= 1) {
			return false;
			
		}
		
		if(a == 2) {
			return true;
		}
		for (int i = 2; i < a; i++) {
			if(a%i == 0) {
			return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		boolean prime = isPrime(2);
		System.out.println(prime);
	}

}
