package exercise9_7;
import java.util.Date;

public class Account {
	
	private int ID = 0; 
	private double Balance = 0;
	private double AnnualInterestRate = 0;
	private Date dateCreated = new Date();
	
	Account() {
		
	}
	Account (int ID, double Balance) {
		this.ID = ID; 
		this.Balance = Balance;
	}
	public int getID() {
		return this.ID;
	}
	public double getBalance() {
		return this.Balance;
	}
	public double getAnnualInterestRate() {
		return AnnualInterestRate;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public void setBalance(double Balance) {
		this.Balance = Balance;
	}
	public void setAnnualInterestRate(double AnnualInterestRate) {
		this.AnnualInterestRate = AnnualInterestRate;
	}
	public Date getdateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		return(AnnualInterestRate / 100) / 12; 
	}
	public double getMonthlyInterest() {
		return Balance * getMonthlyInterestRate();
	}
	public double withdraw(double amount) {
		return Balance - amount;
	}
	public double deposit(double amount) {
		return Balance + amount; 
	}
}
