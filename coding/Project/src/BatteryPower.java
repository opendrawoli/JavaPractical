/**
 *  Filename: BatteryPower.java
	Professor: Shelley Lapkowski
	Date: Oct 28, 2023, 11:59:41 PM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description:
 */

public class BatteryPower extends Toothbrush {
	private int numBatteries;
	private String batteryType;
	
	public BatteryPower()
	{
		super("BatteryPower");
		this.numBatteries = 2;
		this.batteryType = "Heavy Duty";
	}
	
	public BatteryPower (int numBristles, int batteries, String batteryType)
	{
		super("BatteryPower");
		this.numBatteries = numBristles;
		this.numBatteries = batteries;
		this.batteryType = batteryType;
	}
	public String getInstructions()
	{
		return("Use Battery Properly");
	}
	
	public int getNumBatteries()
	{
		return 1;
	}
	public String getBatteryType()
	{
		return this.batteryType;
	}
//	public void setnumBAtteries(int batteries)
//	{
//		
//	}
//	public void setnumBAtteries(int batteries)
//	{
//		
//	}
	
	public String getInstruction()
	{
		return("This program illustrates about the way of using battery powered toothpaset");
	}
	public String toString()
	{
		return((super.toString() + "This toothbrush will perform for three months on" +this.numBatteries+ this.batteryType+" batteries"));
	}

}
