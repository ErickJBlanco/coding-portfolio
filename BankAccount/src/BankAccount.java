public class BankAccount {
    //declare fields
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    BankAccount() {
        setAccountHolderName("Erick");
        setAccountNumber("49310419");
        setBalance(0.00);
    }
    BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        return this.balance;
    }

    public  double withdraw(double amount) {
        if (amount > 0) {
            this.balance -= amount;
        }
        return this.balance;
    }


    public  void checkBalance() {
        System.out.println("Your current balance is: $" + this.balance);
    }








    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
