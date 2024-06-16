package ArraysAndArrayLists;

import java.util.Arrays;

public class RemovindOccurrenceOfValue {
/*Remove all occurrences of an element from Array in Java*/
	
	public static void removingOccurrenceOfElement(int[]arr, int arr1[], int key)
	{
		int j=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]!=key)
			{
				arr1[j]=arr[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr1));
	}
	public static void main(String[] args) {
		
/*Input: array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 }, key = 3
Output: [9, 2, 1, 7, 2, 5]*/
		
		/*Input: array = { 10, 20, 10, 30, 50, 10 }, key = 10
Output: [20, 30, 50]*/
		
//		int[] array= { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
//		int[] arr= new int[array.length-3];
//		
//		int j=0;
//		for(int i=0; i<array.length;i++)
//		{
//			if(array[i]!=3)
//			{
//				arr[j]=array[i];
//				j++;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
	int	arr []= { 10, 20, 10, 30, 50, 10 };
	int	arr1 []= new int[arr.length-3];
	int key = 10;
	removingOccurrenceOfElement(arr,arr1,key);
		
		

	}

}
