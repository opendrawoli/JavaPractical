import java.util.Arrays;

/**
 *  Filename: ArrayEquelCheck.java
	Author: Shelley Lapkowski
	Date: Oct 12, 2023, 3:03:21 PM
	Student Name: Opendra Oli
	Student Id : 1170811
 */

public class ArrayEquelCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int a[] = {2,3,4,5};
		int b[] = {2,3,4,5};
		
		Boolean results = Arrays.equals(a, b);
		
		if(results==true)
		{
			System.out.println("Two arrays are equal");
		}else {
			System.out.println("Two arrays are not equal");
		}
	}

}
