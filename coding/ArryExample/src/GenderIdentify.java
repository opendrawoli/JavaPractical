/**
 *  Filename: GenderIdentify.java
	Author: Shelley Lapkowski
	Date: Oct 3, 2023, 9:37:14 AM
	Student Name: Opendra Oli
	Student Id : 1170811
 */

import java.util.Random;
import java.util.Scanner;

public class GenderIdentify {
    public static void main(String[] args) {
        // Arrays containing names
        String[] girlArray = {"Alice", "Emma", "Olivia", "Sophia", "Mia", "Isabella", "Ava"};
        String[] boyArray = {"Liam", "Noah", "Oliver", "Elijah", "William", "James", "Benjamin"};
        String[] unisexArray = {"Jordan", "Taylor", "Alex", "Jordan", "Riley", "Casey", "Morgan"};

        // Create a random number generator
        Random random = new Random();

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to Mike's Baby Naming Program!");
        System.out.println("**************************************");

        // Ask the user for the gender of the baby
        System.out.print("Please tell me the gender of your baby: ");
        String gender = scanner.nextLine().toLowerCase();

        // Randomly select a name based on the user's choice
        String selectedName = "";
        if (gender.equals("girl")) {
            selectedName = girlArray[random.nextInt(girlArray.length)];
        } else if (gender.equals("boy")) {
            selectedName = boyArray[random.nextInt(boyArray.length)];
        } else {
            selectedName = unisexArray[random.nextInt(unisexArray.length)];
        }

        // Display the chosen name
        System.out.println("You have chosen a " + gender + "'s name which will be known from here on in as");
        System.out.println(selectedName);

        // Close the scanner
        scanner.close();
    }
}

