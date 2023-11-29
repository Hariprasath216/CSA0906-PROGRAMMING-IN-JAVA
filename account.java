import java.util.*;
class Account 
{
    private double balance;
    private double interestRate;

    
    public Account(double initialBalance)
 {
        if (initialBalance < 0) 
{
            System.out.println("Initial balance cannot be negative. Setting balance to $0.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
        this.interestRate = 0.03; 
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Please provide a positive amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("$" + amount + " withdrawn. New balance: $" + balance);
            } else {
                System.out.println("Insufficient funds. A $5 penalty will be charged.");
                balance -= 5; 
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please provide a positive amount.");
        }
    }

    // Function to inquire about the current balance
    public double getBalance() {
        return balance;
    }

    // Function to compute interest on the current balance
    public void computeInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of $" + interest + " added. New balance: $" + balance);
    }

    public static void main(String[] args) {
        // Create an account with an initial balance of $1000
        Account myAccount = new Account(1000);

        // Deposit and withdraw money
        myAccount.deposit(500);
        myAccount.withdraw(300);
        myAccount.withdraw(1500); // This should trigger the $5 penalty

        // Compute interest
        myAccount.computeInterest();

        // Inquire about the current balance
        System.out.println("Current balance: $" + myAccount.getBalance());
    }
}