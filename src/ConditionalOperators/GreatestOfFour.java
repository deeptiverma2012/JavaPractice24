package ConditionalOperators;

public class GreatestOfFour {
	
	public static void greatestNumCalc(int n1, int n2, int n3, int n4)
	{
		if(n1>n2 && n1>n3 && n1>n4 )
		{
			System.out.println("n1 is the greatest number:"+n1);
		}
		else if(n2>n1 && n2>n3 && n1>n4 )
		{
			System.out.println("n2 is the greatest number:"+n2);
		}
		else if(n3>n1 && n3>n2 && n3>n4 )
		{
			System.out.println("n3 is the greatest number:"+n3);
		}
		else
		{
			System.out.println("n4 is the greatest");
		}
		
	}

	public static void main(String[] args) {
		greatestNumCalc(28,78,87,97);

	}

}
