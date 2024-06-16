package ArraysAndArrayLists;

import java.util.Arrays;

public class ArrayCopy {
/*Array Copy in Java*/
	
	public static void copyArray(int[]arr, int[]arr1)
	{
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
			arr1[j]= arr[i];
			j++;
		}
		
		System.out.println(Arrays.toString(arr1));
	}
	public static void main(String[] args) {
		int arr[] = { 1, 8, 3 };
		int arr1[] = new int[arr.length];
		
		copyArray(arr, arr1);

	}

}
