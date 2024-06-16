package ConditionalOperators;

public class Environments {

	public static void getEnvironment(String env)
	{
		switch(env.toLowerCase().trim())
		{
			case "qa":
				System.out.println("Running tests on"+" "+env+" "+"environment");
				break;
			case "stage":
				System.out.println("Running tests on"+" "+env+" "+"environment");
				break;
			case "prod":
				System.out.println("Running tests on"+" "+env+" "+"environment");
				break;
			case "dev":
				System.out.println("Running tests on"+" "+env+" "+"environment");
				break;
			case "uat":
				System.out.println("Running tests on"+" "+env+" "+"environment");
				break;
				default:
					System.out.println("Not a valid environment:"+" "+env);
					break;
		}
	}
	public static void main(String[] args) {
		
		getEnvironment("QA");
		
		getEnvironment("Dev");
		getEnvironment("Deepti");
	}

}
