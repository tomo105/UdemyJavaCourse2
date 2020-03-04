package exc9_composition;

public class Case {
    private String model;
    private String manufacturer;
    private String powerButton;
    private Dimensions dimensions;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerButton() {
        return powerButton;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Case(String model, String manufacturer, String powerButton, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerButton = powerButton;
        this.dimensions = dimensions;
    }
}
