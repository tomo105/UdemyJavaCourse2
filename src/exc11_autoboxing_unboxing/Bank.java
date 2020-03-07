package exc11_autoboxing_unboxing;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addNewBranch(String name) {
        if (findBranch(name) == null) {
            Branch newBranch = new Branch(name);
            this.branches.add(newBranch);
            System.out.println("added new branch");
        } else {
            System.out.println("You have got already this branch.");
        }
    }

    public void addCustomer(String name, String branchName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomer(name, initialAmount);
        }

    }

    public void addCustomerTransaction(String branchName, String customerName, double value) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomerTransition(customerName, value);
        } else {
            System.out.println("there is not specific branch name");
        }
    }

    private Branch findBranch(String branchName) {

        for (int i = 0; i < this.branches.size(); i++) {
            Branch tempBranch = this.branches.get(i);
            if (tempBranch.getName().equals(branchName))
            return tempBranch;
        }
        return null;
    }

    public void listOfBranches() {
        System.out.println("In " + this.getName() + " there is " + this.branches.size() + " branches");
        for (int i = 0; i < branches.size(); i++) {
            System.out.println("Branch " + (i + 1) + ": " + branches.get(i).getName());
        }
    }

    public void listOfCustomers(String branchName, Boolean visibilityOfTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("List of Customers:");
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                System.out.println("Customer " + (i + 1) + " Name: " + branchCustomers.get(i).getName());
                if (visibilityOfTransaction) {
                    System.out.println("List of transaction");
                    ArrayList<Double> transactions = branchCustomers.get(i).getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("transaction: nr: " + j + " " + transactions.get(j));
                    }
                }
            }
        }
    }

}
