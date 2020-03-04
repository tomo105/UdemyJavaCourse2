package exc9_polymorphism;

public class Car {
    private String name;
    private Boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public Boolean getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
    public void startEngine(){
        System.out.println("engine has started");
    }
    public void accelerate(int speed){
        System.out.println("Car accelerate " + speed);
    }

}
