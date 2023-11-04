/**
 *  Filename: StaticMethod.java
	Author: Shelley Lapkowski
	Date: Oct 12, 2023, 4:05:47 PM
	Student Name: Opendra Oli
	Student Id : 1170811
 */

class Mobile{
	String brand;
	static double price;
	String name;
	
	public void show()
	{
		System.out.println("Brand: "+brand+ "\n Price: "+ price+ "\n Name: " +name);
	}
	
	public static void show1(Mobile obj) {
		System.out.println("Brand: "+obj.brand+ "\n Price: "+ price+ "\n Name: " +obj.name);
	}
}
public class StaticMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.brand = "Sumsung";
		obj.price = 50000;
		obj.name = "Galexy";
		
		obj.show();
		
		Mobile.show1(obj);
		

	}

}
