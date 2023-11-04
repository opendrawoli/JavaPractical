
/**
   Filename: TestRectangle.java
     Author: Shelley Lapkowski
       Date: Jul 30, 2023 11:31:14 a.m.
Description: This will test our rectangle class 
 */
public class TestRectangle
{

	public static void main(String[] args)
	{
		//create new instance of rectangle class
//		Rectangle Rec1 = new Rectangle();
//		
//		//Display results
//		System.out.println("Length of rectangle: " + Rec1.length + " and width: " + Rec1.width);
//		System.out.println("Area of rectangle: " + Rec1.findArea());
		
		Rectangle1 rect1 = new Rectangle1();
		Rectangle1 rect2 = new Rectangle1(50,75);
		
		System.out.println("Length: "+rect1.length+ "\nWidth: "+rect1.width);
		System.out.println("Area of rectangle is: "+rect1.getArea()+"\n");
		System.out.println("Length: "+rect2.length+ "\nWidth: "+rect2.width);
		System.out.println("Area of rectangle is: "+rect2.getArea());
	}

}
