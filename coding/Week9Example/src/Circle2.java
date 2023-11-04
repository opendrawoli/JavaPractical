/**
 *  Filename: Circle.java
	Professor: Shelley Lapkowski
	Date: Oct 27, 2023, 11:10:19 AM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description:Generating getter and setter of private variable
	 			color and radius in order to get access private variable
 */

public class Circle2 {
	private double radius ;
	private String color;	
	
	//generating getter and setter of private variables radius and color
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = 50;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = "madison green";
	}
	public double findArea()
	{
				return radius*radius*Math.PI;
	}
	public Circle2()
	{
		this.radius =1.0;
		this.color = "Default constructor";
		findArea();
	
	}
	public Circle2(double radius)
	{
		this.radius = radius;
		this.color = "First argument constructor";
		findArea();
	
	}
	
	public Circle2(String color, double radius)
	{
		this.color = color;
		this.radius = radius;
		findArea();
		
	}
}
