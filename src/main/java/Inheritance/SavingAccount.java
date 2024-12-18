package Inheritance;

public class SavingAccount extends BankAccount{
    // Constructor to initialize account number and balance
    SavingAccount(String AC, double bal) {
        // Call the parent class constructor
        super(AC, bal);
    }


    public void withdraw(double amount) {
        // Check if the withdrawal would cause the balance to drop below $100
        if (getBalance() - amount < 100) {
            // Print a message if the minimum balance requirement is not met
            System.out.println("Minimum balance of $100 required!");
        } else {
            // Call the parent class withdraw method
            super.withdraw(amount);
        }
    }

}
