/**
 *  Filename: MAin.java
	Professor: Shelley Lapkowski
	Date: Oct 31, 2023, 10:51:15 AM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description:
 */

public class Main {
	
	int birthYear;
	String birthName;
	
public Main(int year, String name)
{
	birthYear = year;
	birthName = name;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main obj = new Main(1997,"Opendra Oli");
		
		System.out.println("Birth Year: "+obj.birthYear+"\nBirth Name: "+obj.birthName);
	}

}
