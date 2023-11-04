/**
 *  Filename: grades.java
	Author: Shelley Lapkowski
	Date: Sep 28, 2023, 9:09:47 PM
	Student Name: Opendra Oli
	Student Id : 1170811
 */

/**
 * @author OPend
 *
 */
import java.util.Scanner;

public class grades
{
    public static void main(String args[])
    {
    	int marks[] = new int[6];
    	int i;
    	float total = 0, avg;
    	
    	Scanner input = new Scanner(System.in);
    	
    	
    	for(i=0; i<6; i++)
    	{
    		System.out.println("Enter the marks of the subject between 0 and 100 "+(i+1)+":");
    		marks[i] = input.nextInt();
    		if(marks[i]<0 || marks[i]>100)
    		{
    			System.out.println("Invalid data");
    			break;
    		}
    		total = total+marks[i];
    	}
    	input.close();
    	
       avg = total/6;
       System.out.print("The student grade is: ");
       if(avg>=80)
       {
    	   System.out.print("A");
       }else if(avg>=60 && avg<80)
       {
    	   System.out.print("B");
       }else if(avg>=40 && avg<60)
       {
    	   System.out.print("C");
       }else
       {
    	   System.out.print("D");
       }
    }
}
