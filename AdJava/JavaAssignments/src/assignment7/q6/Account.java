package assignment7.q6;

public class Account {

    long accNo;
    String name;
    double balance;

    Account(long accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        try {
            if (amount <= 0) {
                throw new ArithmeticException("Withdrawal amount must be positive");
            }

            if (amount > balance) {
                throw new ArithmeticException("Insufficient Balance");
            }

            
            balance -= amount;
            System.out.println(amount + " Withdrawn Successfully...");

        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());

        } finally {
            System.out.println("Balance : " + balance);
        }
    }

    public static void main(String[] args) {

        Account a = new Account(24324324, "Swaroop", 50000);

        a.withdraw(53000);
    }
}