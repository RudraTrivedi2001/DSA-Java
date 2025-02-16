package com.FunctionAndPatterns;



public class CharacterPattern
{
	
	
	public static void pattern(int n) 
	{
		
		for (int i = 0; i < n ; i++) 
		{
			for (int j = 0; j <= i; j++)
			{
				int ascii = 'A' + j;
				char value = (char) (ascii);
				System.out.print(value);
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args)
	{
		
		pattern(5);
		
	}

}
