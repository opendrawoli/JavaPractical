/**
 *  Filename: CommodityAnalyzer.java
	Professor: Shelley Lapkowski
	Date: Oct 20, 2023, 10:02:01 AM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description:Program that calculate and print out the average price of the commodity,
	 numbers of days the commodity was higher than average price, 
	 number of days lower price and range of all price.
 */
import java.util.Scanner;
public class CommodityAnalyzer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creating scanner object to enter user value form keyboard
		Scanner input = new Scanner(System.in);
		
		//Entering commodity name
		System.out.println("Enter the name of the commodity");
		String name = input.nextLine();
		
		//stating how many days we can tracking
		System.out.println("We can trace only 10 days of commodity");
		//entering number of days price tracking
		System.out.println("Enter how many days you will be tracking the prices");
		int days = input.nextInt();
		
		
		//creating prices array stored prices of commodity
		int [] pricesArray = new int[days];
		int minPriceForTenDays = 100;
		 
		for(int index=0; index < pricesArray.length; index++)
		{
			//ask user for user
			System.out.println("Enter the "+"price of"+(days+10)+" days "+ (minPriceForTenDays+100));
			pricesArray[index] = input.nextInt();
		}
		
		//calling method1CalculateAgerage method for calculating average of price
		double average =method1CalculateAgerage(pricesArray);
		System.out.println("Average of price is "+average);
		
		//calling method1CalculateAgerage method for calculating average price smaller 
//		than days price

		System.out.println("Number of days prices smaller the average are");
		method2CalculateDaysAgerage(pricesArray,average);
		
//		//calling method1CalculateAgerage method for calculating average price greater 
//		than days price

		System.out.println("Number of days prices greater the average are");
		method3CalculateDaysAgerage(pricesArray,average);
		
		//Calculating the difference between highest and lowest prices 
		System.out.println("Difference between highest and lowes is "+ method3DifferenceBetweenHighestLowest(pricesArray));

		input.close();
		
	}
	
	//method 1 calculating average of price
	public static double method1CalculateAgerage(int [] arr)
	{
		double arrayAvg;
		double sum=0;
		for (int x: arr)
		{
			sum =sum+ x;
		}
		arrayAvg = sum/arr.length;
		return arrayAvg;
	}
	
	
	public static double method2CalculateDaysAgerage(int [] arr, double avg)
	{
		
		for (int x: arr)
		{
			if(x<avg)
			{
				System.out.println("days" +x);
			}
		}
		return 0;
	}
	
	public static double method3CalculateDaysAgerage(int [] arr, double avg)
	{
		
		for (int x: arr)
		{
			if(x>avg)
			{
				System.out.println("days" +x);
			}
		}
		return 0;
	}
	
	public static double method3DifferenceBetweenHighestLowest(int [] arr)
	{
		int max=0;
		int min =0;
		for (int x: arr)
		{
			if(x>x+1)
			{
				max =x;
			}
			if(x<x+1)
			{
				min =x;
			}
			
		}
		int diff = max-min;
		return diff;
	}
	
	
	
}
