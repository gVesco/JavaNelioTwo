package entities;

public class BankAccount {

	private double amount;
	private double accountBalance;
	private String accountHolder;
	private int accountNumber;
	
	public double getAmount() {
		return amount;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public BankAccount(int accountNumber, String accountHolder, double amount) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.amount = amount;
		deposit(amount);
	}

	public BankAccount(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public void deposit(double amount) {
		accountBalance += amount;
	}

	public void withdraw(double amount) {
		accountBalance -= (amount + 5.0);
	}

	@Override
	public String toString() {
		return String.format("%n"
				+ "Account data:%n"
				+ "Account: %d, "
				+ "Holder: %s, "
				+ "Balance: $ %.2f %n"
				, accountNumber, accountHolder, accountBalance);
	}

}
