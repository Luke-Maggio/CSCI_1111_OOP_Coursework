package exercise10_7;

import java.util.Scanner;

public class Exercise10_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		Account[] newAccount = new Account [10];
			for (int i = 0; i < newAccount.length; i++) {
					newAccount[i] = new Account(i, 100);
	}
			System.out.println("Enter your ID: ");
			int IDentered = input.nextInt();
			
			while(true) {
				if (IDentered > 9 && IDentered >= 0) {
					System.out.println("Please enter a valid ID: ");
					
				break; 
				}
				else {
					
			System.out.println("Main Menu: ");
			System.out.println("1: Current Balance");
			System.out.println("2: Withdraw");
			System.out.println("3: Deposit");
			System.out.println("4: Exit from main menu");
	
			System.out.println("Please enter a category ");
			int Category = input.nextInt();
			
			if(Category == 1) {
				System.out.println("The current balance is: " + newAccount[IDentered].getBalance());
			}
			else if(Category == 2) {
				System.out.println("How much would you like to withdraw? ");
				int AmountWithdrawn = input.nextInt();
				newAccount[IDentered].withdraw(AmountWithdrawn);
				System.out.println(IDentered);
			}
			else if(Category == 3) {
				System.out.println("How much would you like to deposit? ");
				int amountToDeposit = input.nextInt();
				newAccount[IDentered].deposit(amountToDeposit);
			}
			else if(Category == 4) {
				System.out.println("Exiting to the main menu");
				IDentered = input.nextInt();
			}
				}
			}
	}

}
