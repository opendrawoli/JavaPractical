/**
 * 
 */

/**
 * Filename: GradeExample.java
	Author: Shelley Lapkowski
		Date: Sep 22, 2023 9:38:09 AM
			Student Name: Opendra Oli
				Student Id : 1170811
	DEscription: This will demonstrate the while and do-while loop

 */
import java.util.Scanner;
public class DemoWhileLoop {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int userInput = -1;
		
		do
		{
			System.out.println("Please enter a number or -1 to quit");
			userInput= input.nextInt();
			sum = sum+userInput;
		}while(userInput!= 0);
		System.out.println("sum="+sum);
		input.close();
	}
	

}
