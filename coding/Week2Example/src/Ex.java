/**
 * Filename: Ex.java
	Author: Shelley Lapkowski
		Date: Sep 19, 2023 11:00:45 AM
			Student Name: Opendra Oli
				Student Id : 1170811

 */

/**
 * @author OPend
 *Filename: Ex.java
	Author: Shelley Lapkowski
	  Date: Sep 19, 2023 11:00:45 AM
		Student Name: Opendra Oli
		  Student Id : 1170811

 */
import java.util.Scanner;
public class Ex {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a= sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		int result = (a>b)? a:b;
		
		System.out.println("Largest number is " +result);
		sc.close();	

	}

}
