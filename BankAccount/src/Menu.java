public class Menu {
    public static void open() {
        System.out.println("What would you like to do?");
        System.out.println("A. Deposit");
        System.out.println("B. Withdraw");
        System.out.println("C. Check Balance");
        System.out.println("D. Logout");
    }

    public static void optionA(BankAccount account, double amount) {
        account.deposit(amount);

    }

    public static void optionB(BankAccount account, double amount) {
        account.withdraw(amount);
    }

    public static void optionC(BankAccount account) {
        account.checkBalance();
    }
}
