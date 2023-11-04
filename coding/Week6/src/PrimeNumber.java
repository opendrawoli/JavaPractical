/**
 *  Filename: PrimeNumber.java
	Author: Shelley Lapkowski
	Date: Oct 12, 2023, 5:52:26 PM
	Student Name: Opendra Oli
	Student Id : 1170811
 */
import java.util.Scanner;
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter any number");
		int number = scan.nextInt();
		int c=0;
		for(int i=1;i<=number;i++) 
		{
			if(number % i==0)
			{
				c =c+1;
			}
		}
		
		if(c==2)
		{
			System.out.println("Given number is prime number");
		}else {
			System.out.println("Given number is not prime number");
		}
		scan.close();
	}

}
