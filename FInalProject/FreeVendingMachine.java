package finalProject;

import java.util.Scanner; 

public class FreeVendingMachine implements VendingMachine {
	
	private User user; 
	
	public FreeVendingMachine(User user) {
		this.user = user; 
		
	}
	
	public void dispense(String drink) {
		if (user.getPoints() >= 20) {
		System.out.println("Dispensing " + drink);
		
		user.points -= 20;
	}
		else { 
			System.out.println("Not enough credits available to dispense item");
	}
		
	}
}
