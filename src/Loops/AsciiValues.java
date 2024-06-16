package Loops;

public class AsciiValues {
/*8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.*/
	
	
	public static void main(String[] args) {
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println("The ascii value of"+ch+"="+(int)ch);
		}
System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for(char ch='a';ch<='z';ch++)
		{
			System.out.println("The ascii value of"+ch+"="+(int)ch);
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for(char ch='0';ch<='9';ch++)
		{
			System.out.println("The ascii value of"+ch+"="+(int)ch);
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		char cr ='A';
		while(cr<='Z')
		{
			System.out.println((int)cr);
			cr++;
		}
		
		
	}

}
