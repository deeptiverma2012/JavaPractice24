package DataTypes;

public class DataTypeQuestions {

	public static void addingStrings(String a, String b)
	{
		System.out.println(a+" "+b);
	}
	public static void concatStrings(String a, String b)
	{
		System.out.println(a+b);
	}
	
	public static void add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	public static void division(int num1, int num2)
	{
		int result = num1/num2;
		System.out.println(result);
	}
	
	public static double expressionCalculator(double a, double b, double c, double d)
	{
		double result = (a*b-b*b)/(c-d);
		return result;
		
	}
/*6. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
"Your Total  amount is. 3700".*/
	
	public static void sum(int a, int b, int c)
	{
		int sum = a+b+c;
		
		System.out.println("\""+"Your Total amount is."+" "+sum+"\""+".");
	}
/*Print the ASCII value of the character 'h'.*/
	
	public static void AsciiGenerator(char ch)
	{
		int asciiValue = (int) ch;
		System.out.println(asciiValue);
	}
/*Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.*/
	
	public static void asciiToChar(char ch)
	{
		int num = (int)ch+3;
		System.out.println((char)num);
	}
	
	/*Write a program to find the square of the number 3.9.*/
	
	public static double sqrtCalc(double d)
	{
		double sqrt = d*d;
		return sqrt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";

		String b = "Naveen K";

		addingStrings(a, b);
		add(74,36);
		
		division(50,3);
		double result = expressionCalculator(25.5,3.5,40.5,4.5);
		System.out.println(result);
		
		concatStrings("Hello Selenium","t");
		sum(100, 200, 3400);
		
		AsciiGenerator('A');
		 asciiToChar('d');
		double sqrt= sqrtCalc(3.9);
		
		System.out.println(sqrt);
		
		
		
	}

}
