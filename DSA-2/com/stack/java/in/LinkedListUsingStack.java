package com.stack.java.in;

public class LinkedListUsingStack {
    
    // Node class represents each element in the stack
    // Each node contains the data and a reference to the next node in the stack
    public static class Node {
        int data;  // The data contained in the node
        Node next; // Reference to the next node in the stack

        // Constructor to create a new node with the given data
        Node(int data) {
            this.data = data;
            this.next = null;  // Initially, next is null because it's the last node in the stack
        }
    }

    // Head points to the top of the stack (the first element)
    public static Node head;

    // Stack class contains the methods to simulate stack operations
    public static class Stack {
        
        // Push method to add an element to the stack
        public static void push(int data) {
            // Create a new node with the given data
            Node newNode = new Node(data);
            
            // If the stack is empty (head is null), the new node becomes the head (top element)
            if (head == null) {
                head = newNode;
                return;  // Exit the method
            }

            // If the stack is not empty, insert the new node at the top (head) of the stack
            newNode.next = head;  // Point new node's next to the current head
            head = newNode;       // Make the new node the head of the stack
        }

        // Pop method to remove and return the top element from the stack
        public static int pop() {
            // If the stack is empty (head is null), return -1 (indicating an error or empty stack)
            if (head == null) {
                return -1;
            }

            // Retrieve the data of the current top element (head)
            int top = head.data;
            
            // Move the head to the next node (effectively removing the top element from the stack)
            head = head.next;

            // Return the data of the popped element
            return top;
        }

        // Peek method to view the top element without removing it
        public static int peek() {
            // If the stack is empty, return -1 indicating there's no top element
            if (head == null) {
                return -1;
            }
            
            // Return the data of the current top element (head)
            return head.data;
        }

        // Method to check if the stack is empty
        public static boolean isEmpty() {
            // Return true if head is null (indicating the stack is empty), otherwise false
            return head == null;
        }
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        // Create a new Stack object
        Stack s = new Stack();
        
        // Push elements onto the stack
        s.push(3);
        s.push(6);
        s.push(3);
        s.push(7);
        s.push(8);
        s.push(34);

        // While the stack is not empty, perform operations
        while (!s.isEmpty()) {
            // Peek the top element and print it (without removing it)
            System.out.println("Element on top of the stack is " + s.peek());
            
            // Pop the top element from the stack and print the popped value
            System.out.println("Element popped " + " element data " + s.pop());

            // Print the new top element after the pop operation
            // This shows the new head of the stack
            System.out.println("New head data is " + s.peek());
        }
    }
}
