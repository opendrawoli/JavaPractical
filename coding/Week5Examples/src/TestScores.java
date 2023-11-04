/**
 *  Filename: TestScores.java
	Author: Shelley Lapkowski
	Date: Oct 3, 2023, 10:33:04 AM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description: Allow user to enter test scores and calculate average
 */
import java.util.Scanner;
public class TestScores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int scoreArray[];
		int sum=0;
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Enter the number of test would you like to enter");
		int numScores = myInput.nextInt();
		
		//Creating a array based on the size user entered
		scoreArray = new int[numScores];
		
		for(int index=0; index < scoreArray.length; index++)
		{
			//ask user for user
			System.out.println("Enter the score number #"+ (index+1));
			scoreArray[index] = myInput.nextInt();
			
			sum =sum+scoreArray[index];
		}
		System.out.println("The sum of score is:" +sum);
		int avg = sum/ scoreArray.length;
		System.out.println("The class average for this class was:" +avg);
		myInput.close();
	}

}
