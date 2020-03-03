package exc8_inheritance;

public class Car extends Vehicle {
    private int gears;
    private int currentGear;
    private int doors;
    private boolean isManual;
    private String type;

    public Car(int wheels, int numberOfPassengers, int gears, int doors, boolean isManual, String type) {
        super(4, numberOfPassengers);
        this.gears = gears;
        this.currentGear = 1;
        this.doors = doors;
        this.isManual = isManual;
        this.type = type;
    }

    public void changeGear() {
        if (this.currentGear == this.gears) {
            System.out.println("Max gear: " + this.currentGear);
            return;
        }
        if (this.getVelocity() < 20)
            this.currentGear = 1;
        else if (this.getVelocity() > 20 && this.getVelocity() <= 40)
            this.currentGear = 2;
        else if (this.getVelocity() > 40 && this.getVelocity() <= 60)
            this.currentGear = 3;
        else if (this.getVelocity() > 60 && this.getVelocity() <= 80)
            this.currentGear = 4;
        else if (this.getVelocity() > 80 && this.getVelocity() <= 100)
            this.currentGear = 5;

        System.out.println("Actual gear is: " + this.currentGear);
    }

//    @Override
    public void move(int velocity,String direction) {
        this.setVelocity(velocity);
        this.steering(direction);
        changeGear();
    }
}
