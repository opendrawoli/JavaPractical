/**
 * Filename: SwitchExample.java
	Author: Shelley Lapkowski
		Date: Sep 19, 2023 11:30:31 AM
			Student Name: Opendra Oli
				Student Id : 1170811

 */

/**
 * @author OPend
 *Filename: SwitchExample.java
	Author: Shelley Lapkowski
		Date: Sep 19, 2023 11:30:31 AM
			Student Name: Opendra Oli
				Student Id : 1170811

 */
import java.util.Scanner;
public class SwitchExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int doorNumber;
		String price;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want !");
		doorNumber = scan.nextInt();
		switch (doorNumber) {
		  case 1:
			price = "500";
		    break;
		  case 2:
			price = "tropical cruise =$250";
		    break;
		  case 3:
			price = "live goat = $250 ";
			break;
		  case 4:
			price = "house warming gift = $100";
			break;
		  default:
			price = "nothing";
		    
		}
		scan.close();
		System.out.println(price);
	}
	

}
