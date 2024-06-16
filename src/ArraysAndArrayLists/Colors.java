package ArraysAndArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Colors {
/* Write a Java program to create a new array list, which contains all color names.
                 --add some colors (string) 
                ---and print out the colorslist using loops.*/
	
	public static void colorsNames()
	{
		ArrayList <String> colors = new ArrayList<String>(Arrays.asList("Red","Green","Blue","Black","Purple","Magenta","White"));
		for(String e: colors)
		{
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		
		colorsNames();
	}

}
