package Methods;

public class MethodOverloading {

	
	public static void calculation(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
		
	}
	public static void calculation(int a, int b, float c) {
		float sum = a+b+c;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		calculation(1,2,3);
		calculation(1,2,3.0f);
		

	}

}
