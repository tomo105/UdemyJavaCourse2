package exc7_classes_and_constructors;

public class CarpetCostCalc {
    private Floor floor;
    private Carpet carpet;

    public CarpetCostCalc(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
