package Loops;

public class UsingBreak {
/*Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".*/
	
	public static void multipleOf7()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
			if(i%7==0)
			{
				System.out.println("bye, see you tomorrow");
				break;
			}
		}
	}
	public static void main(String[] args) {
		multipleOf7();

	}

}
