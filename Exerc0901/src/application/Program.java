package application;

import java.util.Locale;
import java.util.Scanner;
import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Enter account number: ");
		int accountNumber = scn.nextInt();
		scn.nextLine();

		System.out.print("Enter account holder: ");
		String accountHolder = scn.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char isInitialDeposit = scn.next().charAt(0);

		BankAccount bankAccount;
		if (isInitialDeposit == 'y') {
			System.out.print("Enter initial deposit value:: ");
			double initialAmount = scn.nextDouble();
			bankAccount = new BankAccount(accountNumber, accountHolder, initialAmount);
		}
		else if (isInitialDeposit == 'n') {
			bankAccount = new BankAccount(accountNumber, accountHolder);
		}
		else {
			System.out.println("Invalid value entered, enter 'y' for yes or 'n' for no.");
			scn.close();
			return; // Exit the program if invalid input is provided
		}
		
		System.out.println(bankAccount);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositAmount = scn.nextDouble();
		bankAccount.deposit(depositAmount);
		System.out.println("Updated!");
		System.out.println(bankAccount);
		
		System.out.print("Enter a withdraw value: ");
		double withdrawAmount = scn.nextDouble();
		bankAccount.withdraw(withdrawAmount);
		System.out.println("Updated!");
		System.out.println(bankAccount);
		
		scn.close();
	}

}
