package exercise11_3;

public class SavingsAccount extends Account{

	SavingsAccount() {
		super();
		
	}
	
	public SavingsAccount(int ID, double Balance) {
		super(ID, Balance);
		
	}
	
	public void withdraw(double amount) {
		if (getBalance() > amount) {
			setBalance(getBalance() - amount);
	}
		else 
			System.out.println("Savings Account Overdrawn");
		
	}
	
	public String toString() {
		return super.toString();
	
	}
}
