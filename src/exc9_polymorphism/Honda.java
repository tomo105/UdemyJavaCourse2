package exc9_polymorphism;

public class Honda extends Car{
    public Honda( int cylinders) {
        super("honda", cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Start hania");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("szybka jak hania ma na liczniku " + speed);
    }
}
