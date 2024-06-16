package ArraysAndArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingFromArrayList {

	/*Write a Java program to remove the third element from an array list. */
	public static void removingSpecifiedValueFromArrayList(ArrayList<String> arr, int indexNo)
	{
		for(int i=0; i<arr.size(); i++ )
		{
			
			System.out.println(arr.get(i));
			
		}
		arr.remove(indexNo);
		System.out.println(arr);
		
	}
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>(Arrays.asList("Red","Green","Blue","White","Black","Pink"));

		removingSpecifiedValueFromArrayList( colors,4);
	}

}
