class Customer {
    private int accountNo;
    private String accName;
    private int balance = 10000;

    public Customer(int accountNo, String accName) {
        this.accountNo = accountNo;
        this.accName = accName;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit operation success, balance amount: " + balance);
        notify(); // Notify waiting thread (withdraw) that deposit is complete
    }

    public synchronized void withdraw(int amount) {
        try {
            if (balance < amount) {
                System.out.println("Insufficient balance. Waiting for deposit...");
                wait(); // Wait for deposit to complete
            }

            balance -= amount;
            System.out.println("Withdraw operation success, balance amount: " + balance);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        Customer customer = new Customer(123, "John");

        // Creating two threads for deposit and withdraw operations
        Thread depositThread = new Thread(() -> customer.deposit(12000));
        Thread withdrawThread = new Thread(() -> customer.withdraw(3000));

        // Start the threads
        depositThread.start();
        withdrawThread.start();
    }
}
