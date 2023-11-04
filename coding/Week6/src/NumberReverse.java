/**
 *  Filename: NumberReverse.java
	Author: Shelley Lapkowski
	Date: Oct 12, 2023, 10:12:15 PM
	Student Name: Opendra Oli
	Student Id : 1170811
 */
import java.util.Scanner;
public class NumberReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number of 3 digit");
		int number = scan.nextInt();
		int temp= number;
		int result = 0;
		 while(number>0)
		 {
			 int reminder = number%10;
			 result = result*10+reminder;
			 number = number/10;
		 }
		 
		 System.out.println("Reverse of given number "+temp+" is: "+result);
		scan.close();
		

	}

}
