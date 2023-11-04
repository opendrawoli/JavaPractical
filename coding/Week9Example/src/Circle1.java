/**
   Filename: Circle.java
     Author: Shelley Lapkowski
       Date: Oct 31, 2023 11:18:56 a.m.
Description: This program will define a circle object 
 */
public class Circle1
{
	public double radius;

	//one arg constructor
	public Circle1 (double radius)
	{
		this.radius = radius;
	}
	
	//no arg constructor
	public Circle1()
	{
		this.radius = 1.0;
	}
	
	/*
	 * Method Name: getArea()
	 * Purpose:     calculates the area of circle
	 * Accepts:     nothing
	 * Returns:     double
	 */
	public double getArea()
	{
		return radius * radius * Math.PI;
	}
}
