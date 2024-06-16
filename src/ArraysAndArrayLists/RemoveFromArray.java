package ArraysAndArrayLists;

import java.util.Arrays;

public class RemoveFromArray {
 
	public static void removeValueFromArray(int[]arr, int num)
	{
		
		int arr1[]= new int[arr.length-1];
		  int j=0;   
		 for(int i= 0; i<arr.length; i++)
		{
			 
			if((arr[i]!= num))
			{
				arr1[j]=arr[i];
				j++;
			}
		}
		 System.out.println(Arrays.toString(arr1));
	}
	public static void main(String[] args) {
		int p[] = {1,4,5,2,3,22,31, 2}; 
		
		
		removeValueFromArray(p, 22);
	}

}
