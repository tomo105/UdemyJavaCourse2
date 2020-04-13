package exc20_Collections3_Set_HashSet;

public class DogMain {
            //issue with subclasses and override a method equals
    public static void main(String[] args) {
        Labrador rob = new Labrador("Lessi");
        Dog dog = new Dog("Lessi");

        System.out.println(dog.equals(rob));
        System.out.println(rob.equals(dog));
    }
}
