package com.stack.java.in;

import java.util.Stack;

public class StackCollectionFramework {
    // Specify the type of Stack to ensure type safety
    static Stack<Integer> s = new Stack<>();

    public static void main(String[] args) {
        // Pushing elements onto the stack
        s.push(32);
        s.push(36);
        s.push(39);
        s.push(30);
        s.push(31);
        s.push(35);

        // Process the stack while it's not empty
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
