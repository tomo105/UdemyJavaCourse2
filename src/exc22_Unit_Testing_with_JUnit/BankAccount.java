package exc22_Unit_Testing_with_JUnit;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;
    private int accountType;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    public BankAccount(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // branch argument :
    // true -- if the customer is performing aa transaction
    // false -- if customer perform transaxtion in ATM
    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    // branch argument :
    // true -- if the customer is performing aa transaction
    // false -- if customer perform transaxtion in ATM
    public double withdraw(double amount, boolean branch) {
        if ((amount > 500.00) && !branch) {
            throw new IllegalArgumentException();
        }

        balance -= amount;
        return balance;

    }

    public double getBalance() {
        return balance;
    }

    // more methods that use a field of class ... tbc
    public boolean isChecking() {
        return accountType == CHECKING;
    }

}
