package exc8_inheritance;

public class Vehicle {

    private int velocity;
    private String direction;
    private int wheels;

    public String getDirection() {
        return direction;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    private int numberOfPassengers;


    public int getVelocity() {
        return velocity;
    }

    public int getWheels() {
        return wheels;
    }

    public Vehicle(int wheels, int numberOfPassengers) {
        this.velocity = 0;
        this.direction = "straight";
        this.wheels = wheels;
        this.numberOfPassengers = numberOfPassengers;
    }

    public void steering(String direction) {
        if (direction.equals("left") || direction.equals("right") || direction.equals("straight") || direction.equals("back"))
            this.direction = direction;
        else
            System.out.println("wrong direction");
        System.out.println("The car is moving: " + this.direction);
    }

    public void setVelocity(int velocity) {
        this.velocity += velocity;
        if (this.velocity < 0)
            this.velocity = 0;
        System.out.println("current velocity: " + this.velocity);
    }

    public void stop() {
        this.velocity = 0;
    }
}
