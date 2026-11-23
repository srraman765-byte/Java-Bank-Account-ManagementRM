class BankAccount {
    // Data members
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // 1. Parameterized constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // 2. Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + " into " + accountHolderName + "'s account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // 3. Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from " + accountHolderName + "'s account.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance in " + accountHolderName + "'s account! Withdrawal failed.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // 4. Check balance method
    public void checkBalance() {
        System.out.println(accountHolderName + "'s Current Balance: ₹" + balance);
    }

    // 5. Display account details method
    public void displayDetails() {
        System.out.println("---------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("---------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Creating two different BankAccount objects
        BankAccount account1 = new BankAccount("ACC101", "Sury6", 5000.0);
        BankAccount account2 = new BankAccount("ACC102", "Manna7", 3000.0);

        System.out.println("--- Initial Account Details ---");
        account1.displayDetails();
        account2.displayDetails();

        // 2. Performing deposit and withdrawal operations
        System.out.println("\n--- Performing Transactions ---");
        account1.deposit(1500.0);
        account1.withdraw(2000.0);
        account1.checkBalance();

        System.out.println();

        account2.deposit(1000.0);
        account2.withdraw(5000.0); // Yeh fail hoga kyunki balance 4000 hi hai
        account2.checkBalance();

        // 3. Displaying final details
        System.out.println("\n--- Final Account Details ---");
        account1.displayDetails();
        account2.displayDetails();
    }
}
