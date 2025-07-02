public class SavingsAccount extends Account {
    private final double minimumBalance = 1000;

    public SavingsAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if ((balance - amount) >= minimumBalance) {
            super.withdraw(amount);
        } else {
            transactionHistory.add("Withdrawal of ₹" + amount + " failed. Minimum balance ₹" + minimumBalance + " required.");
        }
    }
}
