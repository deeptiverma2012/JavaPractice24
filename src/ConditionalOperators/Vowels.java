package ConditionalOperators;

public class Vowels {

	public static void isCharVowel(char ch)
	{
		switch(ch)
		{
		case 'a':
			System.out.println("Its a vowel"+" "+ ch);
			break;
		case 'e':
			System.out.println("Its a vowel"+" "+ ch);
			break;
		case 'i':
			System.out.println("Its a vowel"+ " "+ ch);
			break;
		case 'o':
			System.out.println("Its a vowel"+ " "+ ch);
			break;
		case 'u':
			System.out.println("Its a vowel"+ " "+ ch);
			break;
			default:
				System.out.println("Consonant"+" "+ ch);
				break;
			
		}
	}
	public static void main(String[] args) {
		isCharVowel('m');

	}

}
