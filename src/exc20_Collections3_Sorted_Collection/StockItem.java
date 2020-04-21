package exc20_Collections3_Sorted_Collection;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int reserved;
    private int quantityStock; //here initialize or  in the constructor

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
        this.reserved = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
        this.reserved = 0;
    }

    public String getName() {
        return name;
    }

    public int getReserved() {
        return reserved;
    }

    public double getPrice() {
        return price;
    }

    public int availableQuantityInStock() {
        return quantityStock - reserved; // all - reserved
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

    public int reserveStock(int quantity) {
        if (quantity <= availableQuantityInStock()) {
            reserved += quantity;
            return quantity;
        } else {
            System.out.println("Not available " + quantity);
            return 0;
        }
    }

    public int unreservedStock(int quantity) {
        if (quantity <= reserved) {
            reserved -= quantity;
            return quantity;
        } else {
            System.out.println("Too much to unreserved " + quantity);
            return 0;
        }
    }

    public int finalizeStock(int quantity) {
        if (quantity <= reserved) {
            quantityStock -= quantity;
            reserved -= quantity;
            return quantity;
        }
        return 0; //error occur

    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    @Override
    public int compareTo(StockItem obj) {
        // System.out.println("compare to called");
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
        return name + " " + price + " .Reserved " + this.reserved;
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
