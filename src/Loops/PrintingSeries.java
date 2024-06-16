package Loops;

public class PrintingSeries {
/*9. Print the following series: 

1.0 2.0 3.0  ...... 10.0 

0 9 18 27 36 …99*/
	
	public static void printFloatingSeries(float num)
	{
		for(float i=1.0f;i<=num;i++)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void multiplesOfNine(int startNum, int endNum)
	{
		for(int i=startNum; i<=endNum;i++)
		{
			System.out.print(9*i+" ");
		}
	}
	public static void main(String[] args) {
		
		printFloatingSeries(10.0f);
		System.out.println();
		multiplesOfNine(0,11);
	}

}
