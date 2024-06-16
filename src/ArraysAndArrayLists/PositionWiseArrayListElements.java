package ArraysAndArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class PositionWiseArrayListElements {
	
	public static void getPositionOfArrayListElements(ArrayList<Integer>arr)
	{
		for(int i=0; i<arr.size();i++)
		{
			System.out.println("Elememt at position"+i+"="+arr.get(i));
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		getPositionOfArrayListElements(arr);
	}
	

}
