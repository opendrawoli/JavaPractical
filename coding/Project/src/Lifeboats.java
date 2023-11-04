/**
 *  Filename: Lifeboats.java
	Author: Opendra Oli
	Date: Sep 29, 2023, 2:36:03 PM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description: . Program for any ship and size of Lifeboat regarding rescue and drown.
 */
import java.util.Scanner;
public class Lifeboats {

	
	public static void main(String[] args) {
		//Printing some information
		System.out.println("Lifeboat Capacity Analysis\n-------------------------------------------");
		System.out.println("First some information is needed.....\n");
		
		//Creating the Scanner object for taking user input
		Scanner input = new Scanner(System.in);
		
		//Entering the name of ship from user keyword
		System.out.println("Enter the name of the ship");
		String name = input.nextLine();
		
		//Entering the number of people on the ship board
		System.out.println("Enter the number of people on board the "+name+":");
		int totalNumberOfPeople= input.nextInt();
		
		//Entering the number of people can rescue from one boat
		System.out.println("The maximum number of people that can be carried by one lifeboat");
		int capacityPerBoat = input.nextInt();
		
		//Entering the available number of Lifeboats. 
		System.out.println("The actual number of lifeboats that are available on board the "+name);
		int numberOfBoat = input.nextInt();
		
		//Calculating the total number of people would be rescued from of all available lifeboats
		int peopleRescueCapacity = Math.min(totalNumberOfPeople, capacityPerBoat * numberOfBoat);
		
		//Calculating the total number of people likely drown.
		int peopleLikelyDrown = totalNumberOfPeople-peopleRescueCapacity;
		
		//Calculating the minimum required lifeboats by rounding up double value into nereast upper integer value
		int minRequiredBoat = (int) Math.ceil((double) totalNumberOfPeople/capacityPerBoat);
		
		///Calculating the minimum required lifeboats by rounding up double value into nereast upper integer value
		//int minRequiredBoat = totalNumberOfPeople/capacityPerBoat;
//		int remaining = totalNumberOfPeople%capacityPerBoat;
//		if(remaining>0)
//		{
//			minRequiredBoat = minRequiredBoat+1;
//		}
		//Calculating the percentage of rescued and drown people using typecasting
		double rescuePercentage =  ((double) peopleRescueCapacity/totalNumberOfPeople)*100;
		double drownPercentage =  ((double) peopleLikelyDrown/totalNumberOfPeople)*100;
		
		
		//Pring the result
		System.out.println("Here is results.........");
		
		System.out.println("A minimum of "+minRequiredBoat+" lifeboats are required to rescue everyone on boat.");
		
		System.out.println(peopleRescueCapacity+" people"+"("+String.format("%.2f",rescuePercentage)+"%) would be rescued");
		System.out.println(peopleLikelyDrown+" people"+"("+String.format("%.2f",drownPercentage)+"%) would be likely drown");
		
		
		int extraPeople = (numberOfBoat*capacityPerBoat)-totalNumberOfPeople;
		if (peopleLikelyDrown == 0) {
            System.out.println("There would be room for extra " + extraPeople+ " in the lifeboats.");
        }
		input.close();

	}

}
