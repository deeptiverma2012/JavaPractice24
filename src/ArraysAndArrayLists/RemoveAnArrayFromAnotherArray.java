package ArraysAndArrayLists;

import java.util.ArrayList;

public class RemoveAnArrayFromAnotherArray {

	public static void main(String[] args) {
		
		ArrayList<String> days =new ArrayList<String>();
		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Satuday");
		days.add("Sunday");
		
		ArrayList<String> newDays = new ArrayList<String>();
		newDays.add("Sunday");
		newDays.add("Monday");
		newDays.add("Sunday");
		
		days.removeAll(newDays);
		System.out.println(days);
		
		
		
		

	}

}
