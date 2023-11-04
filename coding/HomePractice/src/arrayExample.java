/**
 *  Filename: arrayExample.java
	Professor: Shelley Lapkowski
	Date: Oct 27, 2023, 9:30:21 AM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description:
 */
import java.util.Scanner;
public class arrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the size of the array: ");
		        int size = scanner.nextInt();

		        // Create an integer array of the specified size
		        int[] array = new int[size];

		        System.out.println("Enter " + size + " elements:");

		        for (int i = 0; i < size; i++) {
		            System.out.print("Element " + (i + 1) + ": ");
		            array[i] = scanner.nextInt();
		        }

		        // Display the elements in the array
		        System.out.println("You entered the following elements:");

		        for (int i = 0; i < size; i++) {
		            System.out.println("Element " + (i + 1) + ": " + array[i]);
		        }

		        // Close the scanner
		        scanner.close();
		    }



}
