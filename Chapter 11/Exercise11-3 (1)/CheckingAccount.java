package exercise11_3;

public class CheckingAccount extends Account {
	
	private double overDraftLimit;
	
	 CheckingAccount() {
		super(); 
		overDraftLimit = -10; 
		
	}
		
	public CheckingAccount(int ID, double Balance, double overDraftLimit) {
		super(ID, Balance);
		this.overDraftLimit = overDraftLimit;
		
	}
		
	public void setOverDraftLimit(double overDraftLimit) {
		 this.overDraftLimit = overDraftLimit;
		 
	}
	
	public double getOverDraftLimit() {
		return overDraftLimit;
		
	}
	
	public void withdraw(double amount) {
		
		if (overDraftLimit < getBalance() - amount) {
			setBalance(getBalance() - amount);
		}
		else 
			System.out.println("Overdraft limit exceeded.");
	}
	
	public String toString() {
		return super.toString();
		
		}
	}


