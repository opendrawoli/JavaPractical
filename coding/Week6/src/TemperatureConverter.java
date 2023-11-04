import java.util.Scanner;
public class TemperatureConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature in Celcius");
		double temp = scan.nextDouble();
		
		double temperature = TemperatureConverterClass.getTemperatureConverter(temp);
		
		System.out.println("Converted temperature is : "+temperature+"F");
		scan.close();

	}

}
