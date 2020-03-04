package exc9_composition;

public class Bed {
    private double width;
    private double height;

    public Bed(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void changePillow(int number) {
        System.out.println("You have change " + number + "pillow");
    }
}
