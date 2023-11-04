/**
 *  Filename: Customer1.java
	Professor: Shelley Lapkowski
	Date: Nov 3, 2023, 11:08:00 AM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description:Creating the customer class
 */

public class Customer {
private static int id=10000;
private String custId;
private String name;
private String email;
public static int getId() {
	return id;
}
public static void setId(int id) {
	Customer.id = id;
}
public String getCustId() {
	return custId;
}
public void setCustId(String custId) {
	this.custId = custId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
//Constructor
public Customer(String name, String email) {
    this.name = name;
    this.email = email;
    this.custId = generateCustID(name);
    id++; // Increment id for the next customer
}
	private String generateCustID(String name) {
    String firstInitial = name.substring(0,1).toUpperCase();
    return firstInitial + id;
}


//Main method
	public static void main(String [] args)
	{
		//Creating three customers
		Customer Cone = new Customer("Opendra Oli","opendraoli66@gmail.com");
		Customer Ctwo = new Customer("Dipak Rai","diapkrai66@gmail.com");
		Customer Cthree = new Customer("Ajay Sitaula","ajaysitaula@gmail.com");
		
		System.out.println("Customer 1:ID "+Cone.getCustId()+" Name: "+Cone.getName()+" Email: "+Cone.getEmail());
		System.out.println("Customer 2:ID "+Ctwo.getCustId()+" Name: "+Ctwo.getName()+" Email: "+Ctwo.getEmail());
		System.out.println("Customer 3:ID "+Cthree.getCustId()+" Name: "+Cthree.getName()+ " Email: "+Cthree.getEmail());
		
		System.out.println('\n');
		//Changing the name and email of the one customer
		Cone.setName("Dipak Mahatara");
		Cone.setEmail("oopsmeop66@gmail.com");
		System.out.println("Updated name and email");
		System.out.println("Customer 1:ID "+Cone.getCustId()+" Name: "+Cone.getName()+" Email: "+Cone.getEmail());
	}
}
