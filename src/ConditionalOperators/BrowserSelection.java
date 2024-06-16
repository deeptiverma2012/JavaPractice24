package ConditionalOperators;

public class BrowserSelection {

	public static void selectBrowser(String browserName)
	{
		switch(browserName.toLowerCase().trim())
		{
		case "chrome":
			System.out.println("Launch chrome browser");
			break;
		case "edge":
			System.out.println("Launch edge browser");
			break;
		case "firefox":
			System.out.println("Launch firefox browser");
			break;
		case "safari":
			System.out.println("Launch safari browser");
			break;
			
			default:
				System.out.println("Please pass the right browser name");
				break;
			
		}
		
	}
	
	public static void selectBrowserUsingIfElse(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.out.println("Launching Chrome Browser");
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.out.println("Launching firefox Browser");
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			System.out.println("Launching edge Browser");
		}
		else if(browserName.equalsIgnoreCase("safari"))
		{
			System.out.println("Launching safari Browser");
		}
		else
		{
			System.out.println("Please pass the right browser name");
		}
	}
	public static void main(String[] args) {
		selectBrowser("Chrome");
		selectBrowser("Deepti");
		selectBrowserUsingIfElse("SAFARI");
		selectBrowserUsingIfElse("deepti");
		
	}

}
