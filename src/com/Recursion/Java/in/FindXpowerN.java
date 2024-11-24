package com.Recursion.Java.in;




public class FindXpowerN {
	
	static int findXpowerN(int x, int n) {
		
		if(n==0) {
			return 1;
		}
		
		int xPower = x * findXpowerN(x, n-1);
		return xPower;
		
	}
public static void main(String[] args) {
	System.out.println(findXpowerN(2, 10));       //complexity is On
}
}
