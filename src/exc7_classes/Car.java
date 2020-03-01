package exc7_classes;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String color;
    public int drivers;

    public Car(int doors, int wheels, String model, String color) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.color = color;


    }
    public void setDrivers(int number){
        this.drivers = number;
    }
}
