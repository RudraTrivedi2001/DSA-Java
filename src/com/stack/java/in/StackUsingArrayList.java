package com.stack.java.in;

import java.util.ArrayList;

public class StackUsingArrayList {

    // Use a generic ArrayList to store integers
    static ArrayList<Integer> al = new ArrayList<>();

    // Stack class with static methods
    static class Stack {

        // Push method to add elements to the stack
        public static void push(int data) {
            al.add(data); // Add data to the end of the list (top of stack)
        }

        // Pop method to remove and return the top element from the stack
        public static int pop() {
            if (al.isEmpty()) {
                System.out.println("Nothing to pop");
                return -1; // Return -1 if the stack is empty
            }

            int data = al.get(al.size() - 1); // Get the top element
            al.remove(al.size() - 1); // Remove the top element
            return data;
        }

        // Peek method to return the top element without removing it
        public static int peek() {
            if (al.isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // Return -1 if the stack is empty
            }
            return al.get(al.size() - 1); // Return the top element
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        // Pushing some values onto the stack
        s.push(32);
        s.push(34);
        s.push(36);
        s.push(37);
        s.push(39);

        // Loop to pop and peek elements while the stack is not empty
        while (!al.isEmpty()) {
            System.out.println("Top element (peek): " + s.peek()); // Display the top element
            System.out.println("Popped element: " + s.pop()); // Pop and display the popped element
        }
    }
}

