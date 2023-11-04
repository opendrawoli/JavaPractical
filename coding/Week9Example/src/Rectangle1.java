/**
 *  Filename: Rectangle1.java
	Professor: Shelley Lapkowski
	Date: Oct 31, 2023, 11:34:02 PM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description:
 */

public class Rectangle1 {
	public double length;
	public double width;
	
	public double getArea()
	{
		return length*width;
	}
	
	public Rectangle1()
	{
		this.length = 10.0;
		this.width = 15.0;
		
		getArea();
	}
	public Rectangle1(double length, double width)
	{
		this.length = length;
		this.width = width;
		
		getArea();
	}

}
