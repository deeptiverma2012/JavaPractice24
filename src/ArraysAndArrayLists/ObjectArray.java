package ArraysAndArrayLists;

import java.util.Arrays;

public class ObjectArray {
/*Write a program to create a static Array, having following cricket data:
                        --name, age, team name, DOB, gender, Strike Rate
                        --Try to create multiple Object Arrays for different players 
                        --Try to print all the values of each player on the console*/
	
	
	public static void cricketTeamData(String name, int age, String teamName, String dob, char gender, float strikeRate)
	{
		Object teamData[]= {name,age,teamName,dob,gender,strikeRate};
//		for(int i=0; i<teamData.length;i++)
//		{
//			System.out.println(teamData[i]);
//		}
		System.out.println(Arrays.toString(teamData));
		
	}
	public static void main(String[] args) {
		cricketTeamData("Deepti", 36, "Indian Winners", "01-01-1990", 'F', 56.9f);
		cricketTeamData("Swati", 40, "Indian Winners", "01-01-1990", 'F', 40.2f);
		cricketTeamData("Preeti", 50, "Indian Winners", "01-01-1990", 'F', 15.8f);
	}

}
