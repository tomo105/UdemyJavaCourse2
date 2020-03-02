package exc7_classes_and_constructors;

public class Floor {
    private double width;
    private double height;

    public Floor(double width, double height) {
        if (width < 0)
            this.width = 0;
        else
            this.width = width;
        if (height < 0)
            this.height = 0;
        else
            this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

}
