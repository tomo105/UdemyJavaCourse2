package exc8_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,34);
        Dog dog = new Dog("Yorky",35,2,4,1,23,"long silky");
        dog.eat();
        Fish fish = new Fish("Goldfish",3,2,2,4);
        fish.move(4);
    }
}
