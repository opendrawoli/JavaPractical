
/**
   Filename: Rectangle.java
     Author: Shelley Lapkowski
       Date: Oct 27 2023 2:24:02 p.m.
Description: This class will be used to define rectangles. 

 */
public class Rectangle
{
	public double length = 5.0;
	public double width = 3.0;
		
	/*
	 * Method Name: findArea
	 * Purpose: calculates the area of the rectangle
	 * Accepts: nothing
	 * Returns: double (area of rectangle)
	 */
	public double findArea()
	{
		return this.length * this.width;
	}
}
