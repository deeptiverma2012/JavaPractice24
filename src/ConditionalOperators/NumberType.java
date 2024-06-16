package ConditionalOperators;

public class NumberType {

	
	public static void NumType(int num)
	{
		if(num<0)
		{
			System.out.println("Its a negative number");
		}
		else
		{
			System.out.println("Its a positive number");
		}
	}
	public static void main(String[] args) {
		
		NumType(-35);
		NumType(11);
	}

}
