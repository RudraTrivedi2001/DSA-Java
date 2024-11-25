package com.LinkedList.java.in;

// Class representing a Linked List
public class LinkedList {

    // Define a Node class for the linked list
    public static class Node {
        public int data; // The data that this node holds
        Node next; // Reference to the next node in the linked list

        // Constructor to initialize the data when a Node object is created
        public Node(int data) {
            this.data = data; // Assign the data value
            this.next = null; // Initialize the next reference to null (no connection yet)
        }
    }

    // Static variables for the head and tail of the linked list
    public static Node head; // Points to the first node in the linked list
    public static Node tail; // Points to the last node in the linked list

    // Method to print the linked list
    public void printLinkedList() {
        // Check if the linked list is empty
        if (head == null) {
            System.out.println("Linked list is empty"); // Print a message if no nodes exist
            return; // Exit the method
        }

        // Create a temporary node starting from the head
        Node temp = head;

        // Traverse the linked list
        while (temp != null) { // Loop until the last node (null)
            System.out.print(temp.data + " ---> "); // Print the data of the current node
            temp = temp.next; // Move to the next node
        }
        System.out.println("null"); // Indicate the end of the linked list
    }

    // Add a node at the beginning of the linked list
    public void addNodeAtFirstPosition(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) { // If the linked list is empty
            head = tail = newNode; // Set the new node as both head and tail
            return; // Exit the method
        }
        newNode.next = head; // Link the new node to the current head
        head = newNode; // Update the head to point to the new node
    }

    // Add a node at the end of the linked list
    public void addNodeAtLastPosition(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) { // If the linked list is empty
            head = tail = newNode; // Set the new node as both head and tail
            return; // Exit the method
        }
        tail.next = newNode; // Link the current tail node to the new node
        tail = newNode; // Update the tail to point to the new node
    }

    // Remove the first node from the linked list
    public void removeFirst() {
        if (head == null) { // If the linked list is empty
            System.out.println("Linked list is empty. No node to remove.");
            return; // Exit the method
        }
        System.out.println("Removing the first node with value: " + head.data); // Print the data being removed
        head = head.next; // Update the head to point to the next node
        if (head == null) { // If the linked list becomes empty
            tail = null; // Update the tail to null as well
        }
    }

    // Remove the last node from the linked list
    public void removeLast() {
        if (head == null) { // If the linked list is empty
            System.out.println("Linked list is empty. No node to remove.");
            return; // Exit the method
        }
        if (head.next == null) { // If there's only one node in the list
            System.out.println("Removing the last node with value: " + head.data);
            head = tail = null; // Set both head and tail to null
            return; // Exit the method
        }
        Node temp = head; // Start from the head
        while (temp.next != tail) { // Traverse to the second-to-last node
            temp = temp.next; // Move to the next node
        }
        System.out.println("Removing the last node with value: " + tail.data); // Print the data being removed
        temp.next = null; // Remove the last node by setting the next of the second-to-last node to null
        tail = temp; // Update the tail to the second-to-last node
    }

    // Remove a node from the middle of the linked list at a specific index
    public void removeNodeFromMiddle(int index) {
        if (head == null) { // If the linked list is empty
            System.out.println("Linked list is empty. Cannot remove any node.");
            return; // Exit the method
        }

        if (index == 0) { // If the node to be removed is the first node
            removeFirst(); // Call the method to remove the first node
            return; // Exit the method
        }

        Node temp = head; // Start from the head
        int i = 0; // Initialize a counter
        while (i < index - 1 && temp.next != null) { // Traverse to the node before the target index
            temp = temp.next; // Move to the next node
            i++; // Increment the counter
        }

        if (temp.next == null) { // If the index is out of bounds
            System.out.println("Index " + index + " is out of bounds. No node removed.");
            return; // Exit the method
        }

        System.out.println("Removing the node at index " + index + " with value: " + temp.next.data); // Print the data being removed
        temp.next = temp.next.next; // Skip the node at the target index

        if (temp.next == null) { // If the removed node was the tail
            tail = temp; // Update the tail
        }
    }

    // Add a node at a specific index
    public void addMiddle(int index, int data) {
        if (index == 0) { // If adding at the first position
            addNodeAtFirstPosition(data); // Call the method to add at the beginning
            return; // Exit the method
        }
        Node newNode = new Node(data); // Create a new node
        if (head == null) { // If the linked list is empty
            System.out.println("The linked list is empty, so we can't add anything in the middle");
            return; // Exit the method
        }
        Node temp = head; // Start from the head
        int i = 0; // Initialize a counter
        while (i < index - 1 && temp != null) { // Traverse to the node before the target index
            temp = temp.next; // Move to the next node
            i++; // Increment the counter
        }
        if (temp == null) { // If the index is out of bounds
            System.out.println("Index out of bounds. Cannot add the node.");
            return; // Exit the method
        }
        newNode.next = temp.next; // Link the new node to the target position
        temp.next = newNode; // Link the previous node to the new node
    }

    // Main method for testing the linked list functionality
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); // Create an instance of the LinkedList

        // Add nodes to the linked list
        ll.addNodeAtLastPosition(5);
        ll.addNodeAtLastPosition(10);
        ll.addNodeAtLastPosition(15);
        ll.addNodeAtFirstPosition(1);
        ll.addMiddle(2, 8);

        // Print the initial state of the linked list
        System.out.println("Initial Linked List:");
        ll.printLinkedList(); // Expected: 1 ---> 5 ---> 8 ---> 10 ---> 15 ---> null

        // Remove nodes from different positions
        ll.removeFirst();
        System.out.println("\nAfter removing the first node:");
        ll.printLinkedList(); // Expected: 5 ---> 8 ---> 10 ---> 15 ---> null

        ll.removeLast();
        System.out.println("\nAfter removing the last node:");
        ll.printLinkedList(); // Expected: 5 ---> 8 ---> 10 ---> null

        ll.removeNodeFromMiddle(1);
        System.out.println("\nAfter removing the node at index 1:");
        ll.printLinkedList(); // Expected: 5 ---> 10 ---> null
    }
}
