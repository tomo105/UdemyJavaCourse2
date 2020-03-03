package exc9_composition_encapsulation_polymorphism;

public class Wardrobe {
    private double width;
    private double height;
    private String model;
    private int shelves;

    public Wardrobe(double width, double height, String model, int shelves) {
        this.width = width;
        this.height = height;
        this.model = model;
        this.shelves = shelves;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getModel() {
        return model;
    }

    public int getShelves() {
        return shelves;
    }
    public void getAllClothesToWardrobe(){
        System.out.println("clean the room by get clothes to the wardrobe ");
    }
}
