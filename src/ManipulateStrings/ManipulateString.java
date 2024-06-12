package ManipulateStrings;

public class ManipulateString {

	public static void main(String[] args) {
		String S= "I love Java";
		System.out.println("I love 'Java'");
		System.out.println("I love \"Java\"");
		System.out.println("\"I love Java\"");
		
		String domain = "Java|Python|Ruby|Jscript";
		
		String arr[]= domain.split("\\|");
		System.out.println(arr[0]);
		
		String domain1 = "Java.Python.Ruby.Jscript";
		String arr1[]= domain1.split("\\.");
		System.out.println(arr1[0]);
		
		String lang = "xXHelloSeleniumxxXTestingxxXAutomationxXxxJava";
		String lanArr[]= lang.split("xX");
		System.out.println(lanArr[0]);//blank output
		System.out.println(lanArr[1]);
		System.out.println(lanArr[2]);
		System.out.println(lanArr[3]);
		System.out.println(lanArr[4]);
		
		String St = "This is my Life My life my rules";
		System.out.println(St.charAt(5));
		System.out.println(St.codePointAt(5));
		System.out.println(St.indexOf('L'));
		System.out.println(St.indexOf('m', 11));
		System.out.println(St.indexOf('m',St.indexOf("fe")+1));
		System.out.println(St.indexOf('e', St.indexOf("ru")));
		
		
	}

}
