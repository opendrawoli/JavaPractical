/**
 *  Filename: fibonacci.java
	Author: Shelley Lapkowski
	Date: Sep 28, 2023, 9:45:51 PM
	Student Name: Opendra Oli
	Student Id : 1170811
 */

public class fibonacci {

	
	public static void main(String[] args) {
		
		int num1=0, num2=1, num3, i, count = 10;
		System.out.println(num1+"\n "+num2);
		
		for(i =2; i<count; i++)
		{
			num3 = num1+num2;
			System.out.println(""+num3);
			num1 = num2;
			num2 = num3;
		}

	}

}
