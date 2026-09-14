package oops;

public abstract class BankAccount {
	private int accountNumber;
	private String holderName;
	private double balance;
	void deposit(double amount) {
		if(amount > 0) {
			balance+=amount;
			System.out.println("Amount added New Balance = "+balance);
		}
		else {
			System.out.println("Enter valid amount");
		}
	}
	void withdraw(double amount) {
		if(amount > 0 && amount <balance) {
			balance-=amount;
			System.out.println("Amount debited New Balance = "+balance);
		}
		else {
			System.out.println("Enter valid amount");
		}
	}
	void displayDetails() {
		System.out.println(accountNumber + holderName+ balance);
	}
	int getAccountNumber() {
		return accountNumber;
	}
	void setAccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	String getHolderName() {
		return  holderName;
	}
	void setHolderName(String holderName) {
		this.holderName=holderName;
	}
	abstract void calculateInterest();
}
