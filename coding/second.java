class Calculator
{
	public int add(int a, int b)
	{
		int result = a+b;
		return result;
	}
	public int sub(int a, int b)
	{
		int result = a-b;
		return result;
	}
	public int mult(int a, int b)
	{
		int result = a*b;
		return result;
	}
	public int div(int a, int b)
	{
		int result = a/b;
		return result;
	}
}

public class second
{
	public static void main(String [] ars)
	{
		int x = 2;
		int y = 3;
		
		Calculator calc = new Calculator();
		int addition = calc.add(x,y);
		int subtraction = calc.sub(x,y);
		int multiplication = calc.mult(x,y);
		int division = calc.div(x,y);
		System.out.println("addition of two number is = "+addition);
		System.out.println("subtraction of two number is = "+subtraction);
		System.out.println("multiplication of two number is = "+multiplication);
		System.out.println("division of two number is = "+division);
	}
}