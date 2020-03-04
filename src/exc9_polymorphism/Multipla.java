package exc9_polymorphism;

public class Multipla extends Car {
    public Multipla( int cylinders) {
        super("Multipla",cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("welcome in multipla");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("multipla has crashed " + speed);
    }
}
