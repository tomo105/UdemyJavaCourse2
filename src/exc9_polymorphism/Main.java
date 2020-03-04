package exc9_polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------polymorphism----------");

        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie " + i + " was " + movie.getName() + "\n" + movie.plot() + "\n");
        }
        System.out.println("____________________");
        for (int i = 1; i < 11; i++) {
            Car car = randomCar();
            System.out.println("Car " + i + " was ");
             car.getCylinders();
             car.accelerate(4);
        }

    }

    public static Movie randomMovie() {
        int random = (int) (Math.random() * 5) + 1;
        System.out.println("random number is" + random);
        switch (random) {
            case 1:
                return new Jaws();
            case 2:
                return new IndepedenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarsWars();
            case 5:
                return new Forgetable();
            default:
                return null;
        }
    }

    public static Car randomCar() {
        int random = (int) (Math.random() * 3) + 1;
        switch (random) {
            case 1:
                return new Mustang(8);
            case 2:
                return new Honda(6);
            case 3:
                return new Multipla(1);
            default:
                return null;
        }
    }
}
