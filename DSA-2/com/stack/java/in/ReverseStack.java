package com.stack.java.in;

import java.util.ArrayList;

public class ReverseStack {

    static class Stack {
        static ArrayList<Integer> al = new ArrayList<Integer>();

        // Method to push an element to the stack
        static void push(int data) {
            al.add(data);
        }

        // Method to pop an element from the stack
        static int pop() {
            if (al.isEmpty()) {
                return -1; // If the stack is empty, return -1
            }
            int data = al.get(al.size() - 1);
            al.remove(al.size() - 1);
            return data;
        }

        // Method to peek at the top element of the stack
        static int peek() {
            if (al.isEmpty()) {
                return -1;
            }
            return al.get(al.size() - 1);
        }
        
        // Method to push an element at the bottom of the stack
        static void pushAtBottom(int data) {
            if (al.isEmpty()) {
                al.add(data); // If the stack is empty, simply add the element
                return;
            }
            int top = pop(); // Pop the top element
            pushAtBottom(data); // Recursively push the data at the bottom
            push(top); // Push the popped element back on top
        }

        // Method to reverse the stack using recursion
        static void reverseStack() {
            if (al.isEmpty()) {
                return; // Base case: if the stack is empty, stop recursion
            }
            int popped = pop(); // Pop the top element
            reverseStack(); // Recursively reverse the rest of the stack
            pushAtBottom(popped); // Push the popped element at the bottom
        }

        // Utility method to print the stack elements
        static void printStack() {
            if (al.isEmpty()) {
                System.out.println("Nothing to print");
            } else {
                for (int num : al) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // Push elements onto the stack
        Stack.push(33);
        Stack.push(44);
        Stack.push(55);
        Stack.push(66);

        // Print the initial stack
        System.out.println("Initial Stack:");
        Stack.printStack();

        // Reverse the stack once and print the top element
        Stack.reverseStack();
        System.out.println("Top after 1st reverse: " + Stack.peek());

        // Reverse the stack again to restore original order and print the top element
        Stack.reverseStack();
        System.out.println("Top after 2nd reverse: " + Stack.peek());

        // Print the final stack after all reversals
        System.out.println("Final Stack:");
        Stack.printStack();
    }
}
