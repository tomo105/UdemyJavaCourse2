package exc7_classes_and_constructors;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("tomek", 2500, "tomotom@wewd.cq");
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = "defaultowy email";
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public void print() {
        System.out.println("VipCustomer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", emailAddress='" + emailAddress + '\'' +
                '}');
    }
}
