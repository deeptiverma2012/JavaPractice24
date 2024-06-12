package ManipulateStrings;
import java.util.Arrays;

public class StringManipulations {

	public static String reverseStringOrder(String str) {
		
		String newStr[]= str.split(" ");
		System.out.println(Arrays.toString(newStr));
		
		String revStr = "";
		for(int i = newStr.length-1;i>=0;i--)
		{
			revStr = revStr +" "+ newStr[i];
		}
		
		System.out.println(revStr);
		
		return revStr;
		
		
	}
	
	public static void revEntireString(String ip)
	{
		String newip = "";
		for(int i=ip.length()-1; i>=0;i--)
		{
			newip = newip+ip.charAt(i);
		}
		System.out.println(newip);
	}
	
	public static void revEntireWord(String ip)
	{
		String st[] = ip.split(" ");
		String newip = "";
		
		for(int i= 0; i<=st.length-1;i++)
		{
			StringBuilder sb = new StringBuilder(st[i]);
			newip=newip+" "+sb.reverse();
		}
		
		System.out.println(newip);
	}
	public static void main(String[] args) {
		

//		String S="I am the best to Best the am I";
//		
//		String reversedString = reverseStringOrder(S);
		
	String ip = "Selenium Automation is good";
//		revEntireString(ip);
	revEntireWord(ip);
		
	}

}
