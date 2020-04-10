package exc19_static__and_final_statement;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println("Balance is now: " + this.balance);
        } else {
            System.out.println("can not deposit nagative sums");
        }
    }
    public void withdraw(int amount) {
        int withdraw = -amount;
         if (amount < 0 ) {
             this.transactions.add(amount);
             this.balance += amount;
             System.out.println(amount + "withdraw. Balance is now " + this.balance);
         } else {
             System.out.println("Cannot withdraw negative sums");
         }
    }
    public void calculateBalance() {
        this.balance = 0;
        for ( int i : this.transactions) {
            this.balance += i;
        }
        System.out.println("Calculated balance is " + this.balance);
    }
}
