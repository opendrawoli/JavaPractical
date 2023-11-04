
/**
   Filename: Grades.java
     Author: Shelley Lapkowski
       Date: Sep 22, 2023 3:47:35 p.m.
Description: Determine letter grade, midterm grade (S or U) and whether
 						 student passed or failed a course based on percentage 
 						 entered by the user and displays this info.
 */

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		// Declare variables & set initial values where needed
		Scanner input = new Scanner(System.in);
		double perGrade;
		String letterGrade = "";
		char midtermGrade;
		boolean failCourse = false;
		char continueGrade = 'Y';

		// Get percentage grade from user
		while (continueGrade == 'Y') {
			System.out.println("What was your grade (as a percentage)?");
			perGrade = input.nextDouble();

			// If user enters invalid percentage, display appropriate message
			if (perGrade < 0 || perGrade > 100) {
				System.out.println("Grade invalid, must enter a value between 0 and 100!");
			} else // Percentage is valid
			{
				// Determine letter grade for course
				if (perGrade >= 89.5 && perGrade <= 100) {
					letterGrade = "A+";
				} else if (perGrade >= 79.5 && perGrade < 89.5) {
					letterGrade = "A";
				} else if (perGrade >= 74.5 && perGrade < 79.5) {
					letterGrade = "B+";
				} else if (perGrade >= 69.5 && perGrade < 74.5) {
					letterGrade = "B";
				} else if (perGrade >= 64.5 && perGrade < 69.5) {
					letterGrade = "C+";
				} else if (perGrade >= 59.5 && perGrade < 64.5) {
					letterGrade = "C";
				} else if (perGrade >= 54.5 && perGrade < 59.5) {
					letterGrade = "D+";
				} else if (perGrade >= 49.5 && perGrade < 54.5) {
					letterGrade = "D";
				} else {
					letterGrade = "F";
					failCourse = true;
				}

				// Determine midterm grade
				if (perGrade >= 59.5) {
					midtermGrade = 'S';
				} else {
					midtermGrade = 'U';
				}

				// Display letter grade
				System.out.println("You have achieved a " + letterGrade + " in this course.");

				// Display midterm results, messages will vary depending on:
				// midterm grade and whether student is passing or failing course
				if (midtermGrade == 'S') {
					System.out.println("Congratulations!  Your midterm grade is S "
							+ "(satisfactory).  All is well in the world.");
				} else if (failCourse == true) {
					System.out.println("Your midterm grade is U (unsatisfactory).");
					System.out.println(
							"You are failing this course, you need to do " + "better - go see your Professor!");
				} else {
					System.out.println("Your midterm grade is U (unsatisfactory).");
					System.out.println("Your grade is borderline, you need to do better - go see your Professor!");
				}
				System.out.println("Would you like to enter another grade. If yse enter Y otherwise enter N");
				continueGrade = input.next().toUpperCase().charAt(0);
			}
		}

		System.out.println("Grade completion");
		// Close scanner object
		input.close();
	}
}
