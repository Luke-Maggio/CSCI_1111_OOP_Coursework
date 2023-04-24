package exercise12_3;

import java.util.Scanner;

public class Exercise12_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int[] Integers = getIntegers();
		
	try {
		System.out.println("Please enter an index of the array: ");
		System.out.println("The value is: " + Integers[input.nextInt()]);
	}
	catch (ArrayIndexOutOfBoundsException ex) {
		System.out.println("Cannot access this index, out of bounds");
	}
	}
	
		
	public static int[] getIntegers() {
		int[] Integers = new int[100];
		
		for (int i = 0; i < Integers.length; i++) {
			Integers[i] = (int) (Math.random() * 100); 
		}
			return Integers;
		} 
	}
