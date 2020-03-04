package exc9_composition;

public class Carpet {
    private double width;
    private double length;

    public Carpet(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void vacuum() {
        System.out.println("Vacuuming the carpet");
    }
}
