package exc8_inheritance;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1,1, size);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("dog eat a lot");
    }
    public void walk(){
        System.out.println("walk dog");
        super.move(3);
    }
}
