package Loops;

public class Loops1 {
/*1. WAP to print following output:
I am Batman﻿

I am Batman﻿

I am Batman﻿

I am Batman

I am Batman*/
	
	public static void printString(int num, String msg)
	{
		int i=0;
		while(i<num)
		{
			System.out.println(msg);
			i++;
		}
	}
	public static void printStringwithForLoop(int num, String msg)
	{
		for(int i=0; i<num;i++)
		{
			System.out.println(msg);
		}
	}
	
	
	public static void main(String[] args) {
		 printString(5, "I am Batman");
		 System.out.println("***************************************************");
		 printStringwithForLoop(5, "I am Batman");

	}

}
