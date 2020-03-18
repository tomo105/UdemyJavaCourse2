package exc15_abstract_classes;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println( getName() + " can't fly :/");
    }
}
