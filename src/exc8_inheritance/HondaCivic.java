package exc8_inheritance;

public class HondaCivic extends Car {
    private int mileage;

    public HondaCivic(int numberOfPassengers, int mileage) {
        super(4, numberOfPassengers, 6, 5, false, "Ufo");
        this.mileage = mileage;
    }

    public void accelerate(int velocity, String direction) {
        move(velocity, direction);
    }
}
