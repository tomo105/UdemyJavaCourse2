package exc11_autoboxing_unboxing;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions;
    private String name;

    public Customer(String name, double initialAmount) {
        this.transactions = new ArrayList<>();
        this.name = name;
        this.transactions.add(initialAmount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void addTransition(double amount) {
        this.transactions.add(amount);
    }
}
