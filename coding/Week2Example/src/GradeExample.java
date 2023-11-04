

/**
 * @author OPend
 *Filename: GradeExample.java
	Author: Shelley Lapkowski
		Date: Sep 22, 2023 9:38:09 AM
			Student Name: Opendra Oli
				Student Id : 1170811

 */
import java.util.Scanner;

public class GradeExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter percentage of the student");
		double grade = scan.nextDouble();

		String GradeLetter = null;
		if (grade >100 || grade <0)
			{
				System.out.println("Error ! The value must be between 0 and 100");
			}
		else{
			if (grade <= 49.4) {
				System.out.println("Fail");
			} else if (grade >= 49.5 && grade <= 54.4) {
				System.out.println("Your grade is D");
				System.out.println("U");
				GradeLetter = "U";
			} else if (grade >= 54.5 && grade <= 59.4) {
				System.out.println("Your grade is D+");
				GradeLetter = "U";
			} else if (grade >= 59.5 && grade <= 64.4) {
				if (grade >= 60) {
					System.out.println("Your grade is C");
					GradeLetter = "S";
				} else {
					System.out.println("Your grade is C");
					GradeLetter = "U";
				}

			} else if (grade > 64.5 && grade <= 69.4) {
				System.out.println(" Your grade is C+");
				GradeLetter = "S";
			} else if (grade >= 64.5 && grade <= 74.4) {
				System.out.println("Your grade is B");
				GradeLetter = "S";
			} else if (grade > 74.5 && grade <= 79.4) {
				System.out.println("Your grade is B+");
				GradeLetter = "S";
			} else if (grade > 79.5 && grade <= 89.4) {
				System.out.println("Your grade is A");
			} else if (grade > 89.5 && grade <= 100) {
				System.out.println("Your grade is A+");
				GradeLetter = "S";
			}

			if (GradeLetter == "U") {
				System.out.println("Unsatisfactory");
				System.out.println("Your are Pass but You need to say your professor in order to improve okey?");
			} else if (GradeLetter == "S") {
				System.out.println("Satisfactory");
				System.out.println("Congratulation ! Pass exam but they have a borderline grade and they should see\r\n"
						+ "	their professor to find out how to improve");
			} else {
				System.out.println("They are failing the course and they should see\r\n"
						+ "	their professor to find out how to improve.");
			}
		} 
		scan.close();
	}

}
