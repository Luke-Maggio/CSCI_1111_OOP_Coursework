package exercise9_7;

public class Exercise9_7 {

	public static void main(String[] args) {
		
		Account Account1 = new Account(1122, 20000); 
		
		Account1.setAnnualInterestRate(4.5);
		Account1.withdraw(2500);
		Account1.deposit(3000); 
		System.out.println("Remaining Balance: " + Account1.getBalance());
		System.out.println("Monthly Interest Rate: " + Account1.getMonthlyInterest());
		System.out.println("The Date This Account Was Created Is: " + Account1.getdateCreated());
	}

}
