package Inheritance;
//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
// Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
public class BankAccount {

    // Private field to store the account number
    private String accountNumber;

    // Private field to store the balance
    private double balance;


    BankAccount(String AC, double bal){
        this.accountNumber=AC;
        this.balance=bal;
    }

    public void deposit(double amount) {
        // Increase the balance by the deposit amount
        balance += amount;
    }


    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        // Check if the balance is sufficient for the withdrawal
        if (balance >= amount) {
            // Decrease the balance by the withdrawal amount
            balance -= amount;
        } else {
            // Print a message if the balance is insufficient
            System.out.println("Insufficient balance");
        }
    }
    // Method to get the current balance
    public double getBalance() {
        // Return the current balance
        return balance;
    }
}
