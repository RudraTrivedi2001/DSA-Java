package SortingAlgorithms;

public class BubbleSort 
{/** Compare 5 & 3 → Swap → [3, 5, 8, 1]
Compare 5 & 8 → No Swap → [3, 5, 8, 1]
Compare 8 & 1 → Swap → [3, 5, 1, 8]
Repeat until sorted → [1, 3, 5, 8]  **/
 public static int[] bubble(int[] arr)
 {
	 
	 int temp =0;
	 for (int i = 0; i < arr.length; i++) 
	 {
		for (int j = 0; j < arr.length -i -1; j++) {
			
			if(arr[j] > arr[j + 1] )
			{
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
			
			
		}
	 }
	 return arr;
	 
	 
	 
 }
	
	
	public static void main(String[] args)
	{
		int arr[] = {24,4,6,8,9,20,2,3};
		
		int sorted[] = bubble(arr);
		for (int i = 0; i < sorted.length; i++)
		{
			System.out.println(sorted[i]);
		}
		
	}
	
	
	
}
