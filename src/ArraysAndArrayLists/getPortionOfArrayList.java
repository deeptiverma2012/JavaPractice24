package ArraysAndArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class getPortionOfArrayList {

	public static void getSomePortionOfArrayList(ArrayList<String> arr, int startIndex,int endIndex)
	{
		ArrayList<String>arrNew = new ArrayList<String>(arr.subList(startIndex, endIndex));
		System.out.println(arrNew);
				
		
	}
	public static void main(String[] args) {
		
ArrayList<String> arr = new ArrayList<String>(Arrays.asList("Red","Green","Blue","Black","Vine","Pink","Purple","White","Magenta","Teal"));
getSomePortionOfArrayList(arr,2,5);
getSomePortionOfArrayList(arr,1,4);


	
	
	
	}

}
