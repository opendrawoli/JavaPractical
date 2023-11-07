/**
 * 
 */

/**
 * @author OPend
 *
 */
import java.util.Random;
public class Coffee{
	private String manufacture;
	private String name;
	private String strength;
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	
	public Coffee()
	{
		this.manufacture = "Tim Horton";
		this.name = "Regular";
		this .strength = "Extra Strong";
	}
	///
	public Coffee(String manufacture, String name)
	{
		this.manufacture = manufacture;
		this.name = name;
		this .strength = generateStrength();
	}
	
	public Coffee(String manufacture, String name, String strength)
	{
		this.manufacture = manufacture;
		this.name = name;
		this.strength = strength;
	}
	
	private String generateStrength()
	{
		Random random = new Random();
	    int randomNumber = random.nextInt(5);
		String[] arr = {"Light roast","Medium roast","medium-dark roast", "dark roast","expresso roast"};
		
		return arr[randomNumber];
	}
	

}
