package exercise9_1;

import java.util.Scanner;

public class rectangle {
	Scanner input = new Scanner(System.in);
		
	double width = 1;
	double height = 1;

	
	rectangle() {
		
	}
	rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	double getHeight() {
		return this.height;
	}
	double getWidth() {
		return this.width;
	}
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return 2 * (width + height);
	}
}