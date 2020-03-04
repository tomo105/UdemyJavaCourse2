package exc9_polymorphism;

public class Mustang extends Car {
    public Mustang( int cylinders) {
        super("Mustang", cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("mustang start and smoke 10 galons of petrol ");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Mustnag start amazing " + speed);
    }
}
