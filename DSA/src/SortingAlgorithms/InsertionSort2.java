package SortingAlgorithms;
/*  
✅ Insertion Sort Question  

🔹 Problem Statement:  
Aapko ek **unsorted array of integers** diya gaya hai.  
Aapko **Insertion Sort** ka use karke is array ko sort karna hai.  

🔹 Example 1:  
Input: arr[] = [8, 4, 1, 5, 9, 2]  
Output: [1, 2, 4, 5, 8, 9]  

🔹 Example 2:  
Input: arr[] = [12, 11, 13, 5, 6]  
Output: [5, 6, 11, 12, 13]  

🔹 Constraints:  
- 1 ≤ N ≤ 10⁴  (N array ka size hai)  
- -10⁵ ≤ arr[i] ≤ 10⁵  (Array ke elements positive ya negative ho sakte hain)  

🔹 Follow-up Questions:  
1️⃣ Insertion Sort ka **worst case** aur **best case** time complexity kya hai?  
2️⃣ Kya aap Insertion Sort ko **nearly sorted** array ke liye optimize kar sakte hain?  
3️⃣ **Insertion Sort** aur **Bubble Sort** ka performance comparison kijiye.  
4️⃣ Real-world applications mein **Insertion Sort** kahaan use hota hai?  
*/

public class InsertionSort2 
{
	public static void main(String[] args) {
		int nums[] = {8, 4, 1, 5, 9, 2};
		
		for (int i = 1; i < nums.length; i++)    //assuming the element in the pos = 0 is already sorted
		{    
			
			int currentElement = nums[i] ;
			int previous = i - 1 ;
			
			
			while (previous>= 0 &&   nums[previous]  > currentElement)
			{
				nums[previous + 1] =  nums[previous];
				previous--;
			}
			
			nums[previous + 1] = currentElement;
		}
		
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}
	

}
