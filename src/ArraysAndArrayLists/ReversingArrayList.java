package ArraysAndArrayLists;

import java.util.ArrayList;

public class ReversingArrayList {
	/*Reverse this array List:
ArrayList<String> studentNames = new ArrayList<String>();
                studentNames.add("Varun");

                studentNames.add("Reena");

                studentNames.add("Naveen");

                studentNames.add("Robin");

          studentNames.add("Peter");

*/
	
	public static void reversingtheArrayList(ArrayList<String> arr)
	{
		int i=arr.size()-1;
		for(String e: arr)
		{
			System.out.println(arr.get(i));
			i--;
		}
	}
	
//	public static void reversingtheArrayList(ArrayList<String> arr)
//	{
//		for(int i=arr.size()-1; i>=0;i--)
//		{
//			System.out.println(arr.get(i));
//		}
//	}

	public static void main(String[] args) {
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Varun");
		studentNames.add("Reena");
		studentNames.add("Naveen");
		 studentNames.add("Robin");
		studentNames.add("Peter");
		
		reversingtheArrayList(studentNames);

	}

}
