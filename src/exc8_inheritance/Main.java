package exc8_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,34);
        Dog dog = new Dog("Yorky",35,2,4,1,23,"long silky");
        dog.eat();
        Fish fish = new Fish("Goldfish",3,2,2,4);
        fish.move(4);
        System.out.println();

        HondaCivic hondaCivic = new HondaCivic(5,150000);
        hondaCivic.accelerate(5,"left");
        hondaCivic.accelerate(34,"right");
        hondaCivic.accelerate(45,"straight");
        hondaCivic.accelerate(-34,"back");



        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());


        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
