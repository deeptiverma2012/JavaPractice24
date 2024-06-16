package ConditionalOperators;

public class HomeLoan {
/*WAP to define the interest rate on the basis of Loan type using Switch Case

Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan

For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan*/
	
	public static void rateOfInterest(String LoanType ,float salary)
	{
		float roi;
		switch(LoanType.toLowerCase().trim())
		{
		case "car loan":
			 roi = .07f;
			break;
			
		case "housing loan":
			 roi = .010f;
			 if(salary<35000)
			 {
				 System.out.println("Not Applicable For Housing Loan");
			 }
			 else
			 {
				 System.out.println("Applicable For Housing Loan");
			 }
			 
			break;
		case "personal loan":
			 roi = .05f;
			break;
			
		case "education loan":
			 roi = .03f;
			break;
			default:
				System.out.println("Please pass correct loan type");
			
			
			
		}
	}
	public static void main(String[] args) {
	
		rateOfInterest("Housing Loan", 1200000);
	}

}
