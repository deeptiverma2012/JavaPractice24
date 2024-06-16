package Methods;

public class Factorial {
	
	public static int factorialCalculator(int num)
	{
		int fact=1;
		
		if(num == 0 && num ==1)
		{
			return 1;
		}
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
/*Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2 
Also,
1! = 1
0! = 1*/
		int fact = factorialCalculator(0);
		System.out.println(fact);

	}

}
