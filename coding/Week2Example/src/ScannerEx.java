/**
 * 
 */

/**
 * Filename: ScannerEx.java
	Author: Shelley Lapkowski
	Date: Sep 15, 2023 10:09:41 a.m.
	Student Id: 1170811
	Stduent Name: Opendra Oli
	Course: Coding For Testing
 */
import java.util.*;
public class ScannerEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String firstName;
		String lastName;
		String address;
		char likePizza;
		
		System.out.println("\t\t\t\tWelcome to my Info Gathering System !");
		System.out.println("\t\t\t\t*************************************");
		
		//Creating new objects
		Scanner input = new Scanner(System.in);
		
		//Entering new input from keyboard
		System.out.println("Enter the first name");
		firstName = input.next();
		System.out.println("Enter the last name");
		lastName = input.next();
		
		//adding nextline to flush EOL from buffer
		input.nextLine();
		System.out.println("Enter the address");
		address = input.nextLine();
		System.out.println("Do you like pizza? If yes enter Y otherwise N !");
		likePizza = input.next().charAt(0);
		
		//print results
		System.out.println("First name "+firstName);
		System.out.println("Last name "+lastName);
		System.out.println("Address " +address);
		System.out.println("Do I like pizza? " +likePizza);
		
		//close scanner
		input.close();
		
	}

}
