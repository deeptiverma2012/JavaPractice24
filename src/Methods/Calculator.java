package Methods;

public class Calculator {
//addition/subtraction/division/multiplication 
	
	public static void addition(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	public static void subtraction(int a, int b)
	{
		int sub = a-b;
		System.out.println(sub);
	}
	
	public static void division(int a, int b)
	{
		int div = a/b;
		System.out.println(div);
	}
	
	public static void multiplication(int a, int b)
	{
		int mul = a*b;
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
	
		addition(1,2);
		subtraction(10,12);
		division(100,12);
		multiplication(5,5);
	}

}
