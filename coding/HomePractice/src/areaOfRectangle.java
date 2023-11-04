
/**
 *  Filename: areaOfRectangle.java
	Author: Shelley Lapkowski
	Date: Sep 29, 2023, 7:39:43 AM
	Student Name: Opendra Oli
	Student Id : 1170811
 */
import java.util.Scanner;

public class areaOfRectangle {

	public static void main(String[] args) {
		final double p = 22.0/7.0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the redius of circle");
		double radius = input.nextDouble();
		double Area = p * radius * radius;
		System.out.println("Radius of the circle is: " + Area);

		input.close();
	}

}
