/**
 * 
 */

/**
 * @author OPend
 *
 */
public class ManufactureCoffee {
	
	public static void main(String [] args)
	{
			Coffee coffeeOne = new Coffee();
			Coffee coffeeTwo = new Coffee("Van Houte", "Holiday Blend");
			Coffee coffeeThree = new Coffee("Green Mountain","Peru","Dark Rost");
			
			System.out.println("Zero argument constructor");
			System.out.println("Manufacture: "+ coffeeOne.getManufacture()+ " Name: "
			+coffeeOne.getName()+" Strength: "+coffeeOne.getStrength());
			
			System.out.println("\nTwo argument constructor");
			System.out.println("Manufacture: "+ coffeeTwo.getManufacture()+ " Name: "
					+coffeeTwo.getName()+" Strength: "+coffeeTwo.getStrength());
			
			System.out.println("\nThree argument constructor");
			System.out.println("Manufacture: "+ coffeeThree.getManufacture()+ " Name: "
					+coffeeThree.getName()+" Strength: "+coffeeThree.getStrength()+"\n");
			
			System.out.println("Changing values in constructor 3");
			coffeeThree.setManufacture("Starbucks");
			coffeeThree.setName("Blonde");
			coffeeThree.setStrength("Medium Roast");
			System.out.println("Manufacture: "+ coffeeThree.getManufacture()+ " Name: "
					+coffeeThree.getName()+" Strength: "+coffeeThree.getStrength());
			

	}

}
