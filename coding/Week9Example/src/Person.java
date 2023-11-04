/**
 *  Filename: Person.java
	Professor: Shelley Lapkowski
	Date: Nov 2, 2023, 10:36:59 PM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description:
 */

public class Person {
	private String name;
	private int age;
	
	public Person()
	{
		this.name="Opendra Oli";
		this.age=29;
		
	}
	public Person(String name, int age)
	{
		this.name = name;
		this.age=age;
		
	}
	
	public void introduction()
	{
		System.out.println("Hello, I am "+this.name+" and I am "+this.age+" years old");
	}
	public int getDays()
	{
		return this.age*360;
	}
}
