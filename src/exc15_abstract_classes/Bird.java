package exc15_abstract_classes;

public  class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing up ");
    }

    public void fly(){
        System.out.println(" i believ i can fly !!");
    }
}
