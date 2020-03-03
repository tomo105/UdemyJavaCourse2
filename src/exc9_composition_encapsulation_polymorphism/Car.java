package exc9_composition_encapsulation_polymorphism;

public class Car extends Vehicle {
    private int engineCapacity;
    private int doors;

    public Car(String name, int engineCapacity, int doors) {
        super(name);
        this.engineCapacity = engineCapacity;
        this.doors = doors;
    }
}
