package Methods;

import java.util.Scanner;

public class MultiplicationUsingScanner {

	
	public static double multiplier(double a, double b)
	{
		double result = a*b;
		return result;
		
	}
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first digit:");
		double d1 = scan.nextDouble();
		
		System.out.println("Please enter second digit:");
		double d2 = scan.nextDouble();

		double result = multiplier(d1, d2);
		System.out.println("Multiplication result is:"+ result);
		
		
	}

}
