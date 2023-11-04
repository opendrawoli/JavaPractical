/**
 *  Filename: BubbleSort.java
	Professor: Shelley Lapkowski
	Date: Oct 17, 2023, 10:45:46 AM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description:Sorting of the array element using bubble sort
 */

class Main{

	
	public static void BubbleSort(int [] myIntArray)
	{
		 int size = myIntArray.length;
		    
		    // loop to access each array element
		    for (int i = 0; i < size - 1; i++)
		    {
		      // loop to compare array elements
		      for (int j = 0; j < size - i - 1; j++)
		      {
		        // compare two adjacent elements
		        // change > to < to sort in descending order
		        if (myIntArray[j] > myIntArray[j + 1]) {

		          // swapping occurs if elements
		          // are not in the intended order
		          int temp = myIntArray[j];
		          myIntArray[j] = myIntArray[j + 1];
		          myIntArray[j + 1] = temp;
		        }
		      }
		    }
		
	}
}

 
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] myIntAray = {25,20,15,10,5};
		
		System.out.println("Original array is:");
		for(int i=0; i<myIntAray.length; i++)
		{
			System.out.print(myIntAray[i]+", ");
		}
		
		//Sorted array
		
			Main.BubbleSort(myIntAray);
		
		System.out.println("\n\nSorted array is:");
		for(int i=0; i<myIntAray.length; i++)
		{
			System.out.print(myIntAray[i]+", ");
		}
		
		
	}

}
