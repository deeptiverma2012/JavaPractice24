package Loops;

public class ReverseCounting {
	/*3. WAP to print 10 to 1 using for, while and do-while loop*/
	
	public static void reverseCountingUsingWhile(int minNum)
	{
		int i=10;
		while(i>=minNum)
		{
			System.out.println(i);
			i--;
		}
	}
	
	public static void reverseCountingUsingDoWhile(int minNum)
	{
		int i=10;
		do
		{
			System.out.println(i);
			i--;
		}
		while(i>=minNum);
			
	}

	public static void main(String[] args) {
		reverseCountingUsingWhile(1);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		reverseCountingUsingDoWhile(1);
	}

}
