package exercise9_1;

public class Exercise9_1 {

	public static void main(String[] args) {
		
		rectangle rectangle1 = new rectangle(4, 40);
		rectangle rectangle2 = new rectangle(3.5, 35.9);
		
		//rectangle 1
		
		System.out.println("height: " + rectangle1.getHeight());
		System.out.println("width: " + rectangle1.getWidth());
		System.out.println("area: " + rectangle1.getArea());
		System.out.println("perimeter: " + rectangle1.getPerimeter());
		
		//rectangle 2
		
		System.out.println("height: " + rectangle2.height);
		System.out.println("width: " + rectangle2.width);
		System.out.println("area: " + rectangle2.getArea());
		System.out.println("perimeter: " + rectangle2.getPerimeter());
		
	}
}
