package Methods;

public class EvenOddCalculator {
	
	public static void evenOddCal(int num)
	{
		if(num%2==0)
		{
			System.out.println("It's an even number");
		}
		else
		{
			System.out.println("It's an odd number");
		}
	}

	public static void main(String[] args) {
		evenOddCal(16);

	}

}
