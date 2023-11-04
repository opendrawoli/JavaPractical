/**
 * Filename: IfElseExample.java
	Author: Shelley Lapkowski
		Date: Sep 19, 2023 9:24:39 PM
			Student Name: Opendra Oli
				Student Id : 1170811

 */

/**
 * @author OPend
 *Filename: IfElseExample.java
	Author: Shelley Lapkowski
		Date: Sep 19, 2023 9:24:39 PM
			Student Name: Opendra Oli
				Student Id : 1170811

 */
import java.util.Scanner;
public class IfElseExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String fname;
		String lname;
		String address;
		double phone;
		int age;
		char liked;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first name?");
		fname = scan.next();
		System.out.println("Enter the last name?");
		lname = scan.next();
		scan.nextLine();
		System.out.println("Enter the address?");
		address = scan.nextLine();
		System.out.println("Do you like pizza? If yes enter Y otherwise N !");
		liked = scan.next().charAt(0);
		System.out.println("Enter age of the person?");
		age = scan.nextInt();
		
		if(age<=20)
		{
			System.out.println("You are younger and your age is ="+age);
		}else if(age>20 && age<=30)
		{
			System.out.println("You are little your and age is= "+age);
		}else if(age>30 && age<=60)
		{
			System.out.println("Your are about to getting older and your age is= "+age);
		}else
		{
			System.out.println("Yout are older person and your age is= "+age);
		}
			
			scan.close();
	
	}
}
