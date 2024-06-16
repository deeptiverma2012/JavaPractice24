package ArraysAndArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetriveValueFromArrayList {

	public static void getArrayListSpecificValue(ArrayList<Integer> arr, int indexNo)
	{
		int value=0;
		for(int i=0; i<arr.size(); i++)
		{
			 value = arr.get(indexNo);
		}
		System.out.println(value);
	}
	
	public static void setArrayListValue(ArrayList<Integer> arr, int indexNo, int value)
	{
		for(int i=0; i<arr.size(); i++)
		{
			arr.set(indexNo, value);
			System.out.println(arr.get(i));
		}
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(12);
		arr.add(15);
		arr.add(100);
		arr.add(55);
		getArrayListSpecificValue(arr,2);
		getArrayListSpecificValue(arr,3);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(45,15,19,98,65,57,54,35,23));
		setArrayListValue(arr1,1,51);
		
	}

}
