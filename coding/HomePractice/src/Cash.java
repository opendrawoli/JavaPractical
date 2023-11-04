import java.util.Scanner;

/**
 *  Filename: Cash.java
	Author: Shelley Lapkowski
	Date: Sep 28, 2023, 10:13:15 PM
	Student Name: Opendra Oli
	Student Id : 1170811
 */
import java.util.Scanner;

public class Cash {

	public static void main(String[] args) {

		final double FUTURECREDIT1 = 1.5 / 100;
		final double FUTURECREDIT2 = 1.5 / 100;
		final double FUTURECREDIT3 = 1.75 / 100;
		double CashBack;
		char option;
		System.out.println("This program will determine the cash back amount " +
		"of any purchases made using your visa");
		System.out.println("Enter the amount of your purchase");
		double purchaseAmount;
		Scanner input = new Scanner(System.in);
		Scanner customerOption = new Scanner(System.in);
		purchaseAmount = input.nextDouble();
		if (purchaseAmount < 200.00) {
			CashBack = FUTURECREDIT1 * purchaseAmount;
		} else if (purchaseAmount >= 200.00 && purchaseAmount < 1000.00) {
			CashBack = FUTURECREDIT2 * purchaseAmount;
		} else {
			CashBack = FUTURECREDIT3 * purchaseAmount;
		}
		System.out.println("Your total cash amount earned is: $" + CashBack);

		System.out.println("Would you like to apply the money to your purchase"
				+ " or save it for a future credit? (y) for purchase (n) for future credit:");
		option = customerOption.nextLine().toLowerCase().charAt(0);

		if (option == 'y') {
			System.out.println("Your final bill after applying your cash credit amount of $" + CashBack + " is now $"
					+ (purchaseAmount - CashBack));
			System.out.println("Thank you for your purchase");

		} else {
			System.out.println("You have a credit of $" + CashBack + " that you may use for future purchase.");
		}
	}

}
