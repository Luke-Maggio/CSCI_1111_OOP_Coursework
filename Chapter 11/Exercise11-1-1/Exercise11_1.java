package exercise11_1;

import java.util.Scanner;

public class Exercise11_1 {
	
	private double side1 = 1; 
	private double side2 = 1; 
	private double side3 = 1; 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble(); 
		Triangle triangleTest = new Triangle(side1, side2, side3);
		
		System.out.println("Please enter a color: ");
		triangleTest.setColor(input.next()); 
		
		System.out.println("Is the triangle filled? 'True' or 'False'");
		triangleTest.setFilled(input.next());
	       

        System.out.println("The Triangle Sides are \n side 1: " + triangleTest.getSide1() + "\n Side 2: " + triangleTest.getSide2() + "\n Side 3: " + triangleTest.getSide3());
        System.out.println("The Area of the Triangle is: " + triangleTest.getArea());
        System.out.println("The Perimeter of the Triangle is:  "+ triangleTest.getPerimeter());
        System.out.println("The Color of the Triangle is " + triangleTest.getColor());
        System.out.println("Is the Triangle filled? " + triangleTest.isFilled());
	}

}

