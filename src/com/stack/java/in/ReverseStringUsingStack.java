package com.stack.java.in;

import java.util.Stack;

public class ReverseStringUsingStack {
    
    // Declare a stack of characters to help with reversing the string
    static Stack<Character> s = new Stack<Character>(); 

    // Method to reverse the input string using the stack
    String reveerseString(String str) { 
        
        // Push each character of the string onto the stack
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));  // Push each character onto the stack
        }

        // StringBuilder to store the reversed string
        StringBuilder result = new StringBuilder(""); 
        
        // Pop characters from the stack and append them to the StringBuilder
        while (!s.isEmpty()) {
            char charr = s.pop();  // Pop the top element (last inserted character)
            result.append(charr);  // Append the character to the result
        }

        // Return the reversed string as a plain string (convert StringBuilder to String)
        return result.toString();  
    }

    public static void main(String[] args) {
        // Create an instance of ReverseStringUsingStack class
        ReverseStringUsingStack rs = new ReverseStringUsingStack();
        
        // Call the reverseString method and pass the string to be reversed
        String reversed = rs.reveerseString("abc");

        // Print the reversed string
        System.out.println(reversed);  // Output will be "cba"
    }
}

