/**
 *  Filename: Demo.java
	Professor: Shelley Lapkowski
	Date: Oct 29, 2023, 9:38:31 PM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description:
 */


class Human{
	private int age = 27;
	private String name = "Opendra Oli";
	
	public int getAge() {
		return age;
	}
	public String getName()
	{
		return name;
	}
}
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Human obj = new Human();
		
		System.out.println(obj.getName()+": "+obj.getAge());
		

	}

}
