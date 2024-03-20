public final class Bank {
    // The Bank class should not be inherited by any other class
    private Bank() {}

    public static void main(String[] args) {
        Account acc = new SavingsAccount();
        acc.deposit(100);
        System.out.println("Balance: " + acc.getBalance());

        acc.withdraw(50);
        System.out.println("Balance: " + acc.getBalance());
    }
}