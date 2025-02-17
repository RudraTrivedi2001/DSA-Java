package SortingAlgorithms;

public class InsertionSort {
    public static int[] insertionSort(int arr[]) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) { // First element already sorted maan ke chalte hain
            int key = arr[i];  // Current element store karlo
            int j = i - 1;  // Peeche wale element ko compare karne ke liye
            
            // Jab tak peeche ka element bada hai, aage shift karte jao
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift kar rahe hain
                j--;
            }
            
            arr[j + 1] = key; // Sahi jagah insert karo
        }
        
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2}; // Input array
        
        arr = insertionSort(arr); // Sorting function call
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // Sorted array print hoga
        }
    }
}
