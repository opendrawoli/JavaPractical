
public class CastingExample
{

	public static void main(String[] args)
	{

		int numKids1 = 2;
		int numKids2 = 3;

		double average = (double)numKids1 / numKids2;
		
		System.out.println ("Average: " + average);
	
		//both work and are ways of using casting to prevent compile errors
		// result = (int) 32.6 / 10;
		
		//int result = (int) (32.6 / 10);
		
		//Will trigger error, Java cannot convert from double to int
//		int result = (int)32.6 / (int)10.0;
//		System.out.println("result: " + result);

//		double result2 = 32.6 / 10.0;
//		System.out.println("result2: " + result2);
		
	/*
		double volume = 10.559874387438;
		
		System.out.println("Original Volume (double): + " + volume);
		volume = volume * 100 + .5;
		System.out.println("volume * 100 + .5: " + volume);
		volume = (int) volume;
		System.out.println("(int) volume: " + volume);		
		volume = volume / 100;
		System.out.println("volume / 100: " + volume);
		//volumeInMetres = (int)(volumeInMetres * 100 + .5) / 100.0;

		//truncate volume to 2 decimal places
		//volumeInMetres = (int)(volumeInMetres * 100) / 100.0;
*/
	}

}
