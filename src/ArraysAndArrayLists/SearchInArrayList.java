package ArraysAndArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchInArrayList {

	public static void searchForValue(ArrayList<String>arr,String value)
	{
		for(String e:arr)
		{
			if(value.equals(e))
			{	
				System.out.println("Found the value:"+value);
				break;
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<String> days = new ArrayList<String>(Arrays.asList("Mon","Tue","Wed","Thur","Fri","Sat","Sun"));
		System.out.println(days);
		searchForValue(days,"Fri");

	}

}
