/**
 *  Filename: CopyArray.java
	Author: Shelley Lapkowski
	Date: Oct 12, 2023, 2:49:06 PM
	Student Name: Opendra Oli
	Student Id : 1170811
 */

// A Java program to demonstrate that simply 
// assigning one array reference is incorrect 
public class CopyArray { 
	public static void main(String[] args) 
	{ 
		int a[] = { 1, 8, 3 }; 

		int b[] = new int[a.length];
		
		b=a;
		
		System.out.println("Element of a");
		for(int i=0;i<a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
		
		System.out.println("\n\nElement of b");
		for(int j=0;j<b.length; j++)
		{
			System.out.print(b[j]+" ");
		}
	} 
}

