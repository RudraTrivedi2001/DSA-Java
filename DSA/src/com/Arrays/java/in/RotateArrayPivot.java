package com.Arrays.java.in;

import java.util.Scanner;

public class RotateArrayPivot {
    
    /* 
    Aapko ek sorted array diya hai jo pivot index k par rotate ho chuka hai. Aapko array ko k positions se rotate karna hai.
    💡 Example:
    Agar array arr = [0, 1, 2, 4, 5, 6, 7] hai aur k = 3 hai,
    toh output [4, 5, 6, 7, 0, 1, 2] hoga.
    
    ✅ Step-by-Step Approach:
    Step 1: Calculate Pivot (Rotation Count)
    Agar k > n ho jaye, toh k = k % n karna hoga.
    Kyunki k se zyada rotations karna ka koi sense nahi hai.
    🔹 Example:
    Agar arr = [1,2,3,4,5] aur k = 7, toh
    k % 5 = 2 hoga, toh k = 2 se rotate karna padega.
    
    Step 2: Reverse the Whole Array
    Pehle pura array ko reverse kar do.
    Yeh last elements ko pehle le aata hai.
    🔹 Example:
    
    Original Array:  [0, 1, 2, 4, 5, 6, 7]
    After Full Reverse: [7, 6, 5, 4, 2, 1, 0]
    
    Step 3: Reverse First k Elements
    Sirf pehle k elements ko reverse karo.
    Yeh k elements ko wapas sorted order mein le aata hai.
    🔹 Example (k = 3):
    
    Array After Full Reverse:  [7, 6, 5, 4, 2, 1, 0]
    Reverse First 3 Elements: [4, 5, 6, 7, 2, 1, 0]
    
    Step 4: Reverse Remaining Elements
    Bache hue elements ko reverse karo.
    Yeh unko original order mein wapas le aata hai.
    🔹 Example:
    Array Before Last Reverse:  [4, 5, 6, 7, 2, 1, 0]
    Reverse Last Elements: [4, 5, 6, 7, 0, 1, 2]
    🔥 Final Rotated Array: [4, 5, 6, 7, 0, 1, 2]
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pivot Index");
        
        int k = 3;
        
        int arr[] = {0, 1, 2, 4, 5, 6, 7};
    
        rotateArray(arr, k);
    
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        int end = n - 1;
        
        // Step 1: Reverse the whole array
        reverse(arr, 0, end); 
        
        // Step 2: Reverse first k elements
        reverse(arr, 0, k ); 
        
        // Step 3: Reverse remaining elements
        reverse(arr, k+1, end); 
    }

    private static void reverse(int[] arr, int start, int end) {
        int temp  = 0;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
}
