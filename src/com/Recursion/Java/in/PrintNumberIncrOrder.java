package com.Recursion.Java.in;

public class PrintNumberIncrOrder {

	
	static void incrOrder(int n) {
		if(n<=0) {
			return;
		}
		incrOrder( n -1 );
		System.out.println(n);
		
	}
	
	
public static void main(String[] args) {
	incrOrder(10);
}
}
