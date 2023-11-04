import java.util.Scanner;
public class RectangleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of rectangle in cm");
		double length = scan.nextDouble();
		System.out.println("Enter breadth of rectangle in cm");
		double breadth = scan.nextDouble();
		
		double area = getRectangleArea(length,breadth);
		
		System.out.println("Area of the rectangle is: "+area+" cm");
		scan.close();
	}
	
	public static double getRectangleArea(double l, double b)
	{
		double rarea = l*b;
		return rarea;
	}

}
