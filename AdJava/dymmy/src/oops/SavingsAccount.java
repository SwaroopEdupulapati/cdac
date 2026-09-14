package oops;

public class SavingsAccount extends BankAccount {

	@Override
	void calculateInterest() {
		System.out.println("Saving intrest");
		
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

}
