package exc8_inheritance;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int gills, int eyes, int fins) {
        super(name, 1, 1, size);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){

    }
    private void moveMuscles(){

    }
    private void moveBackFin(){

    }
    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(5);

    }
    public int getGills() {
        return gills;
    }

    public int getEyes() {
        return eyes;
    }

    public int getFins() {
        return fins;
    }
}
