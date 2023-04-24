package exercise12_15;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise12_15 {

	public static void main(String[] args) throws Exception {
		
		File file1 = new File("Exercis12_15.txt");
		
		if (file1.exists()) {
			System.out.println("File already exists. ");
			System.exit(0);
		}
//import java util for printwriter 
		
		try (PrintWriter output1 = new PrintWriter(file1);) {
		
			for(int i = 0; i < 100; i++) {
				output1.print(((int)(Math.random() * 1000) + 1));
				output1.print(" ");
			}
	}
		//import java util array list
		
		ArrayList<Integer> list = new ArrayList<>();
		
		try(Scanner input = new Scanner(file1);) {
			while (input.hasNext()) {
				list.add(input.nextInt());
			}
		}
		
		//import java util for collections 
		
		Collections.sort(list);
		
		System.out.print(list.toString());
		System.out.println();
	}
}
