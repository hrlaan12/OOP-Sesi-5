public abstract class Account {
    // The Account class should not be instantiated directly
    protected Account() {}

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        // Implement deposit logic
        balance += amount;
    }

    public void withdraw(double amount) {
        // Implement withdraw logic
        balance -= amount;
    }
}
class SavingsAccount extends Account {
    // The SavingsAccount class should not have any public properties or methods, except for its constructors
    public SavingsAccount() {
        // Implement account initialization logic
    }
}