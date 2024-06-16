package ArraysAndArrayLists;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindingCommonElement {
/*Java Program to Find Common Elements Between Two Arrays
 * Input:  Array1 = [“Article”, “for”, “Geeks”, “for”, “Geeks”], 
            Array2 = [“Article”, “Geeks”, “Geeks”]
Output: [Article,Geeks]

Input:  Array1 = [“a”, “b”, “c”, “d”, “e”, “f”], 
            Array2 = [“b”, “d”, “e”, “h”, “g”, “c”]
Output: [b, c, d, e]*/
	
	public static void compareStringArrays(String arr[], String arr1[])
	{
		Set <String>set = new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0; j<arr1.length;j++)
			{
				if(arr[i]==arr1[j])
				{
					set.add(arr[i]);
					break;
				}
			}
			
			
		}
		
		for(String e: set)
		{
			System.out.print(e+" ");
		}
		
	}
	
	public static void compareCharArrays(char[] ch1, char[] ch2)
	{
		
		Set<Character> set = new HashSet<>();
		for(int i=0; i<ch1.length; i++)
		{
			for(int j=0; j<ch2.length; j++)
			{
				if(ch1[i]==ch2[j])
				{
					set.add(ch1[i]);
				}
			}
		}
		
		for(char c: set)
		{
			System.out.print(c+" ");
		}
	}
	
	public static void main(String[] args) {
		String Array1[] = {"Article", "for", "Geeks", "for", "Geeks"};
		String  Array2[] = {"Article", "Geeks", "Geeks"};
		
		String Array3[]= new String[Array2.length-1];
		
		compareStringArrays(Array1,Array2);
		
		System.out.println();
		char[] arr1 = {'a','b','c','d','e','f'};
		char[] arr2 = {'b','d','e','h','g','c'};
		
		 compareCharArrays(arr1,arr2);

	}

}
