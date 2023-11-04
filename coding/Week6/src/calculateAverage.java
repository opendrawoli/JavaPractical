/**
 *  Filename: calculateAverage.java
	Author: Shelley Lapkowski
	Date: Oct 10, 2023, 11:20:15 AM
	Student Name: Opendra Oli
	Student Id : 1170811
 */
import java.util.Scanner;
public class calculateAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numsArr[] = {10,20,30,40,50,1};
//		double averageNum = Average.getAverage(10, 20, 30,1);
//		System.out.println("average of threee number is: "+averageNum);
		double averageArrayNumber = Average.getArrayAverage(numsArr);
		System.out.println("Average of array number is: "+averageArrayNumber);
		
		
		//Finding maximum number
		int maximumNumber = Average.getMaximumNumberInArray(numsArr);
		
		System.out.println("Maximum number is: "+maximumNumber);
		
		//Calculate the area of rectangle
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		double l = input.nextDouble();
		System.out.println("Enter the width of rectangle");
		double b = input.nextDouble();
		
		double areaRectangle = Average.getAreaOfRectangle(l,b);
		System.out.println("Area of rectangle is: "+areaRectangle);
		
		input.close();
	}

}
