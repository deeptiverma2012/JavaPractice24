package Methods;

public class NumberComparision {
	
	public static void NumCompairator(int a, int b, int c)
	{
		if(a>b && a>c)
		{
			System.out.println("a is the maximum number:"+ a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is the maximum number:"+ b);
		}
		else
		{
			System.out.println("c is the maximum number:"+ c);
		}
	}
			

	public static void main(String[] args) {
		NumCompairator(100,500,70);

	}

}
