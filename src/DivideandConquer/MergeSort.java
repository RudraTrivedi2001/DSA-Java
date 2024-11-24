
/**
 * Merge Sort in Ascending Order 
 */
package DivideandConquer;

public class MergeSort {

    /**
     * Helper function to print the sorted array.
     * This function iterates over the array and prints each element.
     * 
     * @param arr The array to print.
     */
    static void printSortedArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Add a newline for better formatting
    }

    /**
     * This function implements the MergeSort algorithm using recursion.
     * MergeSort is a **divide and conquer** algorithm that recursively divides the array
     * into smaller subarrays, sorts them, and then merges them back together.
     * 
     * Key Concepts:
     * - **Divide**: Divide the array into two halves.
     * - **Conquer**: Recursively sort each half.
     * - **Combine**: Merge the two sorted halves into a single sorted array.
     * 
     * @param arr The array to sort.
     * @param si  The starting index of the subarray.
     * @param ei  The ending index of the subarray.
     */
    static void mergeSort(int arr[], int si, int ei) {
        // Base case: If the subarray has one or zero elements, it is already sorted.
        if (si >= ei) {
            return;
        }

        // Calculate the middle index of the current subarray
        // This avoids integer overflow compared to (si + ei) / 2
        int mid = si + (ei - si) / 2;

        // Recursively sort the left half of the array
        mergeSort(arr, si, mid);

        // Recursively sort the right half of the array
        mergeSort(arr, mid + 1, ei);

        // Merge the two sorted halves
        merge(arr, mid, si, ei);
    }

    /**
     * This function merges two sorted subarrays into a single sorted array.
     * The two subarrays are:
     * - Left: arr[si...mid]
     * - Right: arr[mid+1...ei]
     * 
     * The merged result is stored back into the original array `arr`.
     * 
     * Key Concepts:
     * - Use a temporary array to hold the merged result.
     * - Compare elements from both subarrays and add the smaller one to the temp array.
     * - After merging, copy the temp array back into the original array.
     * 
     * @param arr The original array containing the two sorted subarrays.
     * @param mid The middle index separating the two subarrays.
     * @param si  The starting index of the left subarray.
     * @param ei  The ending index of the right subarray.
     */
    static void merge(int arr[], int mid, int si, int ei) {
        // Temporary array to store the merged result
        int temp[] = new int[ei - si + 1];

        // Pointers for left subarray, right subarray, and temp array
        int i = si;       // Pointer for the left subarray (arr[si...mid])
        int j = mid + 1;  // Pointer for the right subarray (arr[mid+1...ei])
        int k = 0;        // Pointer for the temp array

        // Compare elements from both subarrays and add the smaller one to the temp array
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++; // Move the left subarray pointer
            } else {
                temp[k] = arr[j];
                j++; // Move the right subarray pointer
            }
            k++; // Move the temp array pointer
        }

        // Add any remaining elements from the left subarray
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Add any remaining elements from the right subarray
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy the sorted elements from the temp array back into the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    
    public static void main(String[] args) {
        // Input array to be sorted
        int arr[] = {4, 5, 6, 7, 3};


        mergeSort(arr, 0, arr.length - 1);

        
        printSortedArray(arr);
    }
}
