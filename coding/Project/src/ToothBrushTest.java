/**
 *  Filename: ToothBrushTest.java
	Professor: Shelley Lapkowski
	Date: Oct 29, 2023, 12:30:05 AM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description:
 */

public class ToothBrushTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BatteryPower batteryPowerObj = new BatteryPower(110,4,"alkaline");
		System.out.println((batteryPowerObj.getBatteryType()));
		
		System.out.println((batteryPowerObj.getInstruction()+batteryPowerObj.getInstruction()));
		
		System.out.println(batteryPowerObj.toString());
	}

}
