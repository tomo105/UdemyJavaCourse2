package exc11_autoboxing_unboxing;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name ){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(String customerName, double amount) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            Customer newCustomer = new Customer(customerName, amount);
            customers.add(newCustomer);
            System.out.println("added new customer");
        } else {
            System.out.println("there is this customer ! Fail to add customer.");
        }
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            if (this.customers.get(i).getName().equals(name))
                return this.customers.get(i);
        }
        return null;
    }

    public void addCustomerTransition(String customerName, double amount) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransition(amount);
            System.out.println("added transition to customer");
        } else {
            System.out.println("there is not a valid customer to add transition ");
        }

    }
}
