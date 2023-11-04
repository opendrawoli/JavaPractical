/**
 *  Filename: PersonMain.java
	Professor: Shelley Lapkowski
	Date: Nov 2, 2023, 10:44:18 PM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description:
 */

public class PersonMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person();
		Person person1 = new Person("Binay Chaudhary",26);
		person.introduction();
		System.out.println("No of the days: "+person.getDays());
		person1.introduction();
		System.out.println("No of the days: "+person1.getDays());
	}

}
