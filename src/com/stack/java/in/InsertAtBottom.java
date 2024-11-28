package com.stack.java.in;

import java.util.Stack;

public class InsertAtBottom {
      
    // Static stack of integers
    static Stack<Integer> s = new Stack<Integer>();
    
    // Recursive function to insert an element at the bottom of the stack
    static void pushAtBottom(int data) {
        // Base case: If the stack is empty, simply push the element onto the stack
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // If the stack is not empty, pop the top element and store it
        int poppedData = s.pop();
        
        // Recursively call the function to insert the data at the bottom
        pushAtBottom(data);
        
        // After the element is inserted at the bottom, push the popped element back onto the stack
        s.push(poppedData);
    }

    public static void main(String[] args) {
        // Pushing some elements onto the stack
        s.push(32);
        s.push(36); 
        s.push(39);
        s.push(30);
        s.push(31);
        s.push(35);
        
        // Insert 3 at the bottom of the stack
        pushAtBottom(3);
        
        // Print the stack by popping elements until the stack is empty
        while (!s.isEmpty()) {
            // Print the current top element using peek
            System.out.println("Top element (peek): " + s.peek());

            // Pop the top element from the stack and print it
            System.out.println("Popped element: " + s.pop());

            // Print the new top element after popping
            if (!s.isEmpty()) {  // Only print peek if the stack is not empty
                System.out.println("New top element (peek): " + s.peek());
            }
        }
    }
}
