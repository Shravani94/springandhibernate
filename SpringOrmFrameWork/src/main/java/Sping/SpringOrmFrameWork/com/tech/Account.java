package Sping.SpringOrmFrameWork.com.tech;

public class Account {
	private int accountNumber;
	private String owner;
	private double balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(int accountNumber, String owner, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", owner=" + owner + ", balance=" + balance + "]";
	}
	

}
