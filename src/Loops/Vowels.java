package Loops;

public class Vowels {
/*Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.*/
	
	public static void vowelsDetector()
	{
		char[]vowels = {'a','e','i','o','u'};
		
		for(char ch='a'; ch<='z';ch++)
		{
			for(int i=0; i<vowels.length; i++)
			{
				if(ch==vowels[i])
				{
					System.out.print(ch);
				}
			}
			
			
			
		}
		
	}
	public static void main(String[] args) {
		vowelsDetector();

	}

}
