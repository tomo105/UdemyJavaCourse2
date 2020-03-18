package exc15_abstract_classes;

public class Main {
    public static void main(String[] args) {
                Dog dog = new Dog("Max");
                dog.breathe();
                dog.eat();

                Parrot parrot = new Parrot("Aloise");
                parrot.fly();
                parrot.eat();
                parrot.breathe();

                Penguin penguin = new Penguin("Kowalski");
                penguin.fly();
    }
}
