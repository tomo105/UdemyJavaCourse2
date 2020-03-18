package exc15_abstract_classes;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //mark to be abstract so it must be implement !!
    public abstract void eat();
    public abstract  void breathe();

    public String getName(){
        return this.name;
    }
}
