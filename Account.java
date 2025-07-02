import java.util.ArrayList;

public class Account {
    protected String accountNumber;
    protected String holderName;
    protected double balance;
    protected ArrayList<String> transactionHistory;

    public Account(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account opened with balance: ₹" + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: ₹" + amount);
        } else {
            transactionHistory.add("Failed deposit attempt: Invalid amount ₹" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: ₹" + amount);
        } else {
            transactionHistory.add("Failed withdrawal attempt: ₹" + amount);
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void showTransactionHistory() {
        System.out.println("\n--- Transaction History ---");
        for (String txn : transactionHistory) {
            System.out.println(txn);
        }
        System.out.println("---------------------------\n");
    }
}
