package exc7_classes_and_constructors;

public class Main {
    public static void main(String[] args) {
        Car honda = new Car(5, 4, "Lambo", "red");
        honda.drivers = 23; //acces because it is public
        BankAccount account = new BankAccount("Tom", "tomo@qwwqeq.com", "123123123");
        account.deposit(30);
        account.withdraw(100);
        account.deposit(70);
        account.withdraw(100);

        VipCustomer vip = new VipCustomer();
        VipCustomer dean = new VipCustomer("asfdASF", 300);
        VipCustomer roman = new VipCustomer("Roman", 345, "emsail@we.we");

        vip.print();
        dean.print();
        roman.print();

        Floor floor = new Floor(50,2);
        Carpet carpet = new Carpet(2);
        CarpetCostCalc carpetCostCalc = new CarpetCostCalc(floor,carpet);
        System.out.println(carpetCostCalc.getTotalCost());

    }
}
