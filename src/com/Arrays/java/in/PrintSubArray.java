package com.Arrays.java.in;

public class PrintSubArray {
    public static void main(String[] args) {
        // Define an input array with elements: 0, 1, 2, 3
        int arr[] = {0, 1, 2, 3};
        int totalSubArrays = 0;
        // Outer loop: 'i' is the starting index of the subarray.
        // It runs from index 0 to the last index of the array.
        
        for (int i = 0; i < arr.length; i++) {
            
            // Middle loop: 'j' is the ending index of the subarray.
            // For each starting index 'i', 'j' starts at 'i' and goes to the end of the array.
            for (int j = i; j < arr.length; j++) {
                
                // Inner loop: 'k' is used to iterate from the starting index 'i' to the ending index 'j'.
                // This loop prints all elements of the current subarray.
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");  // Print each element followed by a space.
                    
                }
                totalSubArrays++;
                // After printing one subarray, print a separator line to distinguish subarrays.
                System.out.println("__________");
            }
            // After printing all subarrays starting from index 'i', print an extra separator line.
            System.out.println("__________");
      }
        System.out.println("Total Sub Arrays "+totalSubArrays);
    }
    
    
}

