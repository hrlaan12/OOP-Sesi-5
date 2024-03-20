public class App {
    public static void main(String[] args) {
        // Membuat objek SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount();

        // Memanggil metode deposit dan withdraw
        savingsAccount.deposit(100);
        System.out.println("Balance after deposit: " + savingsAccount.getBalance());

        savingsAccount.withdraw(50);
        System.out.println("Balance after withdrawal: " + savingsAccount.getBalance());
    }
}
