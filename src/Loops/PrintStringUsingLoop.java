package Loops;

public class PrintStringUsingLoop {
/*4. Write a program in Java to print "Hello World" ten times using while loop*/
	public static void printString(int num, String msg)
	{
		int i=1;
		while(i<=num)
		{
			System.out.println(msg);
			i++;
		}
	}
	public static void main(String[] args) {
		printString(10, "Hello World");

	}

}
