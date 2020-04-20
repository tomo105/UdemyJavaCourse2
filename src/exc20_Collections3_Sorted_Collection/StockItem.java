package exc20_Collections3_Sorted_Collection;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock; //here initialize or  in the constructor

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public int quantityInStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        } else {
            System.out.println("invalid price");
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if (newQuantity >= 0) {
            this.quantityStock = newQuantity;
        } else {
            this.quantityStock = 0;
        }
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    @Override
    public int compareTo(StockItem obj) {
        System.out.println("compare to called");
        if (this == obj) {
            return 0;
        }
        if (obj != null) {
            return this.name.compareTo(obj.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("StockItem equals called");
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) return false;
        String stockItem = ((StockItem) obj).getName();
        return this.name.equals(stockItem);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57;
    }
}
