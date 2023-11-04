
public class TestCircle {

	public static void main(String[] args) {
	
		Circle obj0 = new Circle();
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle("Green",7);
		
		
		System.out.println("Color of circle of default constructor is: "+ obj0.color);
		System.out.println("Area of arg 0 construction is: "+ obj0.findArea());
		
		
		System.out.println("\n");
		System.out.println("Color of circle of default constructor is: "+ obj1.color);
		System.out.println("Area of arg 1 construction is: "+ obj1.findArea());
		
		System.out.println("\n");
		
		System.out.println("Color of circle of default constructor is: "+ obj2.color);
		System.out.println("Area of arg 2 construction is: "+ obj2.findArea());
		
		
	}

}
