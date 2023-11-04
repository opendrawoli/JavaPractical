
public class TestCircle2 {

	public static void main(String[] args) {
	
		Circle2 obj0 = new Circle2();
		Circle2 obj1 = new Circle2(5);
		Circle2 obj2 = new Circle2("sand drift beige",25);
		
		
		System.out.println("Color of circle of default constructor is: "+ obj0.getColor());
		System.out.println("Area of arg 0 construction is: "+ obj0.findArea());
		
		
		System.out.println("\n");
		System.out.println("Color of circle of 1 arg constructor is: "+ obj1.getColor());
		System.out.println("Area of arg 1 construction is: "+ obj1.findArea());
		
		System.out.println("\n");
		
		System.out.println("Color of circle of 2 argument constructor is: "+ obj2.getColor());
		System.out.println("Area of arg 2 construction is: "+ obj2.findArea());
		
		
	}

}
