package Methods;

import java.util.Scanner;

public class Circle {

	static final float pi = 3.14f;
	
	
	public static double circumferenceOfCircle(float pi, double r) 
	{
		double circumference = 2*pi*r;
		return circumference;
	}
	
	public static double areaOfaCircle(float pi, double r){
		
		double area = pi*r*r;
		return area;
	}
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter radius:");
		
		double radius = scan.nextDouble();
		
		double circumference = circumferenceOfCircle(pi, radius);
		System.out.println("The circumference of circle is:"+ circumference);
		
		double area = circumferenceOfCircle(pi, radius) ;
		System.out.println("The area of a circle is:"+area);
		
		

	}

}
