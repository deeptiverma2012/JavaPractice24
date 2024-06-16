package ArraysAndArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class EmptyAnArrayList {
	
public static void emptyArrayList(ArrayList<Integer> arr)
{
	arr.clear();
	System.out.println("Printing an empty ArrayList:"+arr);
}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		emptyArrayList(arr);
		
	}
		

	

}
