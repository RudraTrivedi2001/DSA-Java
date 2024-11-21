package com.Recursion.Java.in;

public class PrintNumberInDecOrder {
	
	
	public static void decOrder(int n) {
		
		if(n == 1) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		decOrder( n - 1 );
	}
	
	
	
	
	
	public static void main(String[] args) {
		decOrder(10);
	}

}
