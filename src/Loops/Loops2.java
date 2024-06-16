package Loops;

public class Loops2 {
/*2. WAP to print following output:
I am Batman 1
I am Batman 2
I am Batman 3
I am Batman 4
I am Batman 5
I am Batman 6
I am Batman 7
I am Batman 8
I am Batman 9*/
	
	public static void printStringUsingWhile(int num, String msg)
	{
		int i=1;
		while(i<num)
		{
			System.out.println(msg+" "+i);
			i++;			
		}
	}
	public static void printStringUsingFor(int num, String msg)
	{
		for(int i=1; i<num; i++)
		{
			System.out.println(msg+" "+i);
		}
	}
	
	public static void printStringUsingDoWhile(int num, String msg)
	{
		int i=1;
		do {
			System.out.println(msg+" "+i);
			i++;
		}
		while(i<num);
	}
	
	
	public static void main(String[] args) {
		 printStringUsingWhile(10 , "I am Batman");
		 System.out.println("**********************************");
		 printStringUsingFor(10 , "I am Batman");
		 System.out.println("**********************************");
		 
		 printStringUsingDoWhile(10 , "I am Batman");
	}

}
