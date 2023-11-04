/**
 *  Filename: Cash1.java
	Author: Shelley Lapkowski
	Date: Sep 28, 2023, 11:19:02 PM
	Student Name: Opendra Oli
	Student Id : 1170811
 */
import java.util.Scanner;
public class Cash1 {

	
	public static void main(String[] args) {
		
		final double credit1 = 1.5/100;
		final double credit2 = 1.75/100;
		final double credit3 = 2.25/100;
		double amount;
		double cashBack;
		char yesorno;
		Scanner input = new Scanner(System.in);
		System.out.println("This program will determine the cash back amount of any purchases made using your visa");
		System.out.println("Enter the amount of your purchase :$");
		amount = input.nextDouble();
		if(amount<200.00)
		{
			cashBack = credit1*amount;
			
		}else if(amount>=200.00 && amount<1000.00)
		{
			cashBack = credit2*amount;
		}else
		{
			cashBack = credit3*amount;
		}
		System.out.println("Your total cash amount earned is :$"+cashBack);
		System.out.println("Would you like to apply the money to your purchase or save it for a future credit? (y) for purchase (n) for future credit:");
		yesorno = input.next().toLowerCase().charAt(0);
		input.close();
		if(yesorno =='y')
		{
			System.out.println("Your final bill after applying your cash credit amount of"+cashBack+ "is now $"+(amount-cashBack));
			System.out.println("Thank you for purchasing");
		}else
		{
			System.out.println("You have a credit of $" + cashBack + " that you may use for future purchase.");
		}
		
		

	}

}
