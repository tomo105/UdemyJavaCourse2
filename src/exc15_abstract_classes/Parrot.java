package exc15_abstract_classes;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying bird ");
    }

    //you can override eat and breathe method here !!
}
