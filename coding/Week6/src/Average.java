/**
 *  Filename: Average.java
	Author: Shelley Lapkowski
	Date: Oct 10, 2023, 11:18:05 AM
	Student Name: Opendra Oli
	Student Id : 1170811
 */

public class Average {
//	public static double getAverage(int n1, int n2, int n3)
//	{
//		double avg = (n1+n2+n3)/3;
//		return avg;
//	}
	
	public static double getArrayAverage(int nums[])
	{
		double arrayAvg;
		double sum=0;
		for (int x: nums)
		{
			sum =sum+ x;
		}
		arrayAvg = sum/nums.length;
		return arrayAvg;
	}
	
	//calculating the area of rectangle
	
	
	public static double getAreaOfRectangle(double height, double width)
	{
		double area;
		area = height*width;
		return area;
	}
	
	
	//Finding the maximum number in the given array
	
	public static int getMaximumNumberInArray(int nums[])
	{
		
		int max = nums[0];
		for(int i:nums)
		{
			if(i>max)
				max = i;
		}
		return max;
	}

}
