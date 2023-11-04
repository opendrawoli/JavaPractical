import java.util.Scanner;

/**
 *  Filename: Armstrong.java
	Author: Shelley Lapkowski
	Date: Oct 12, 2023, 6:24:16 PM
	Student Name: Opendra Oli
	Student Id : 1170811
 */


public class Armstrong {

	/**
	 * @param args
	 */
	
	
	public static boolean isArmstrong(int num)
	{
		int originalNumber = num;
		int arm=0;
		while(num>0)
		{
			int remaining = num % 10;
			arm += Math.pow(remaining, countDigit(originalNumber));
			num = num/10;
		}
		return arm==originalNumber;
	}
	
	public static int countDigit(int countNumber)
	{
		int count=0;
		while(countNumber!=0)
		{
			countNumber = countNumber/10;
			count++;
		}
		
		return count;
	}
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter any number");
		int number = scan.nextInt();
		for(int i=0;i<=number;i++)
		{
			if(isArmstrong(i))
			{
				System.out.print("\nArmstrong number is: "+i);
			}
		}
		
		scan.close();
	}

}
