package exc8_inheritance;

public class Animal {
    private String name;
    private int weight;
    private int brain;
    private int size;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public Animal(String name, int weight, int brain, int size) {
        this.name = name;
        this.weight = weight;
        this.brain = brain;
        this.size = size;
    }

    public void eat(){
        System.out.println("animal eat");
    }
    public void move(int speed){
        System.out.println("animal move() called");
    }


}
