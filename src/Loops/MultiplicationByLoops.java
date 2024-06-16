package Loops;

public class MultiplicationByLoops {
/*5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop*/
	
	public static void printMultipleUsingWhile(int num)
	{
		int i=1;
		while(i<=100)
		{
			System.out.println(num*i);
			i++;
		}
	}
	public static void printMultipleUsingDoWhile(int num)
	{
		int i=1;
		do {
			System.out.println(num*i);
			i++;
		}
		while(i<=100);
	}
	public static void printMultipleUsingForLoop(int num)
	{
		for(int i=1; i<=100;i++)
		{
			System.out.println(num*i);
		}
	}
	
	
	public static void main(String[] args) {
		
		printMultipleUsingWhile(5);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		printMultipleUsingDoWhile(5);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		printMultipleUsingForLoop(5);
	}

}
