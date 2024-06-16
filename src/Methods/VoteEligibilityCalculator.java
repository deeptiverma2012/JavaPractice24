package Methods;


public class VoteEligibilityCalculator {
	
	/*A person is eligible to vote if his/her age is greater than or equal to 18.
	 Define a method to find out if he/she is eligible to﻿ vote. - return true/false*/
	
	public static boolean ElectionEligibilityCalculator(int age)
	{
		if(age>=18)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		

		boolean eligible = ElectionEligibilityCalculator(5);
		System.out.println(eligible);
	}

}
