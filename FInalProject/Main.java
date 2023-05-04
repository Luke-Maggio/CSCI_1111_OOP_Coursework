package finalProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter your ID: ");
		String id = input.nextLine(); 
		
		if(id.length() > 4 || id.length() < 4) {
			System.out.println("Please Enter a Valid ID. ");
			System.exit(0);
			
		}
		
		System.out.println("How many points would you like to use: ");
		int points = input.nextInt();
		
		User user = new User(id, points);
		
		VendingMachine VendingMachine1 = new FreeVendingMachine(user);
		
		System.out.println("Press 1 to confirm login");
		int choice = input.nextInt();
		
		if(choice == 1) {
			VendingMachine1 = new FreeVendingMachine(user);	
		}
		else { 
			System.exit(choice);
		}
		System.out.println("Please Select a Drink: ");
		System.out.println("1. Protein");
		System.out.println("2. Creatine");
		System.out.println("3. BCAA's");
		System.out.println("4. Pre-Workout");
		System.out.println("5. Fat Loss Shake");
		
		int drinkChoice = input.nextInt();
		
		if(drinkChoice == 1) {
			VendingMachine1.dispense("Protein");
		}
		else if (drinkChoice == 2) {
			VendingMachine1.dispense("Creatine");
		}
		else if (drinkChoice == 3) {
			VendingMachine1.dispense("BCAA's");
		}
		else if (drinkChoice == 4) {
			VendingMachine1.dispense("Pre-Workout");
		}
		else { 
			VendingMachine1.dispense("Fat Loss Shake");
		}
	}
}