package ConditionalOperators;

public class UberCarBooking {/*WAP to book the specific type of car from the Uber app using Switch - Case. 
Car Type: Mini, Sedan, SUV, Premium
If user passes wrong car type, print please select the right car type*/

	public static void bookACar(String carType)
	{
		switch(carType.toLowerCase().trim())
		{
			case "mini":
			System.out.println("You have selected a mini car");
			break;
			case "sedan":
				System.out.println("You have selected a sedan car");
				break;
			case "suv":
				System.out.println("You have selected a suv car");
				break;
			case "premium":
				System.out.println("You have selected a premium car");
				break;
				default:
					System.out.println("Please select the right car type");
					break;
		}
	}
	public static void main(String[] args) {
		bookACar("sumo");

	}

}
