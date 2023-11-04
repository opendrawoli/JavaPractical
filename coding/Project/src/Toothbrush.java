/**
 *  Filename: Toothbrush.java
	Professor: Shelley Lapkowski
	Date: Oct 29, 2023, 12:13:50 AM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description:
 */

public abstract class Toothbrush {
	private String type;
	private int numBristles;
	
	public Toothbrush(String type)
	{
		this.type = type;
		this.numBristles = 96;
	}
	
	public Toothbrush (String type, int bristles)
	{
		this.type = type;
		this.numBristles = bristles;
	}
	
	public int getNumBristles()
	{
		return 1;
	}
	
	public void setNumBristles (int bristles)
	{
		
	}
	
	public void setType(String type)
	{
		
	}
	
	public abstract String getInstructions();
	
	
	public String toString()
	{
		return ("This " + this.type +"toothbrush contains" + this.numBristles + " bristles for a great clean");
	}

}
