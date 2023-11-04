/**
 *  Filename: ArrayTwoDimensional.java
	Author: Shelley Lapkowski
	Date: Oct 9, 2023, 11:33:44 PM
	Student Name: Opendra Oli
	Student Id : 1170811
 */

public class ArrayTwoDimensional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		
		
		int nums[][] = new int[3][4];;
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4;j++)
			{
				nums[i][j] =(int) (Math.random()*10);
				System.out.print(nums[i][j]+ " ");
			}
			System.out.println();
		}
		
		for(int n[]: nums)
		{
			for(int m: n)
			{
				
				System.out.print(m+ " ");
			}
			System.out.println();
		}

	}

}
