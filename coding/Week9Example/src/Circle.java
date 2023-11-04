/**
 *  Filename: Circle.java
	Professor: Shelley Lapkowski
	Date: Oct 27, 2023, 11:10:19 AM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description:
 */

public class Circle {
	public double radius ;
	public String color;	
	public double findArea()
	{
				return radius*radius*Math.PI;
	}
	public Circle()
	{
		this.radius =1.0;
		this.color = "Default constructor";
		findArea();
	
	}
	public Circle(double radius)
	{
		this.radius = radius;
		this.color = "First argument constructor";
		findArea();
	
	}
	
	public Circle(String color, double radius)
	{
		this.color = color;
		this.radius = radius;
		findArea();
		
	}
}
