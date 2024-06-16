package Loops;

import java.util.ArrayList;
import java.util.List;

public class PrintingOddAndEven {
/* Print all odd and even numbers between 1 to 100*/
	
	public static void printOddNEvenNum(int startNum, int endNum)
	{
		List<Integer> evenLi = new ArrayList<Integer>();
		List<Integer> oddLi = new ArrayList<Integer>();
		for(int i=startNum; i<=endNum;i++)
		{
			if(i%2==0)
			{
				evenLi.add(i);
				
			}
			else
			{
				 oddLi.add(i);				
			}
		}
		System.out.println("Even Numbers:");
		for(int e:evenLi)
		{
			
			System.out.println(e);
		}
		System.out.println("Odd Numbers:");
		for( int o: oddLi)
		{
			
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		 printOddNEvenNum(1, 100);
		 
		

		 }

	}


