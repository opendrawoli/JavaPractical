/**
 *  Filename: ConvertHeight.java
	Author: Shelley Lapkowski
	Date: Sep 29, 2023, 10:16:15 AM
	Student Name: Opendra Oli
	Student Id : 1170811
 */
import java.util.Scanner;

public class ConvertHeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final double CM_PER_INCH  = 2.54;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Opendra’s Height Converter Program");
		System.out.println("Please enter your height in feet and inches:");
		int feet = input.nextInt();
		System.out.println("Please enter your height in feet and inches:");
		int inches = input.nextInt();
		
		double height_in_centimeter = (feet * 12+inches)*CM_PER_INCH;
		
		System.out.println("Please enter your gender as a character (M or F):");
		char gender = input.next().toUpperCase().charAt(0);
		
		System.out.println("A height of "+feet+" ft. "+ inches +" in. is equal to "+height_in_centimeter+ "cm" );
		
		double finalresult = Math.round(height_in_centimeter);
		
		System.out.println("That's "+ finalresult+" rounded to the nearest 0.1 cm.");
		if ((gender =='M' &&height_in_centimeter>183) ||(gender =='F' && height_in_centimeter>177.5 ))
		{
				System.out.println("You are a tall."+ (gender=='M'? " Man":" Female"));
			
		}else
		{
			
			System.out.println("You are a small"+(gender=='F'? " Female":" Man"));
		}
		input.close();
			
	}

}
