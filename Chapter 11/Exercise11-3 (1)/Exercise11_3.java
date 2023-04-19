package exercise11_3;

import java.util.Scanner;

public class Exercise11_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account account1 = new Account(3232, 22000);
		SavingsAccount savings1 = new SavingsAccount(2323, 23000);
		CheckingAccount checking1 = new CheckingAccount(4343, 39000, -10);
	
		System.out.println(account1.toString());
		System.out.println(savings1.toString());
		System.out.println(checking1.toString());
		
	}
}
