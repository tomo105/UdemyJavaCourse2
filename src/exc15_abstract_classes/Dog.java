package exc15_abstract_classes;

public class Dog extends  Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating ...");
        //use getName from inheritance class Animal
    }

    @Override
    public void breathe() {
        System.out.println("dog breathe ...");

    }
}
