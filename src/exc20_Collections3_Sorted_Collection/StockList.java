package exc20_Collections3_Sorted_Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> map;

    public StockList() {
        this.map = new HashMap<>();
    }

    public int addStock(StockItem item) {
        if (item != null) {
            StockItem inStock = map.getOrDefault(item.getName(), item);
            // check if we already have quantity of this item
            if (inStock != item) {
                //wws already in the map and override itself
                item.adjustStock(inStock.availableQuantityInStock());
            }
            map.put(item.getName(), item);
            return item.availableQuantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) { //change to finalize method
            StockItem inStock =  map.get(item);
            if (inStock != null && quantity > 0) {
                return inStock.finalizeStock(quantity);
            }
            return 0;
            //old version
//        StockItem inStock = map.getOrDefault(item, null);
//        if ((inStock != null) && (inStock.availableQuantityInStock() >= quantity) && (quantity > 0)) {
//            inStock.adjustStock(-quantity);
//            return quantity;
//        }
//        return 0;
    }

    public int reservedStock(String item, int quantity) {
        StockItem inStock = map.get(item);
        if ((inStock != null) && (quantity > 0)) {
            return inStock.reserveStock(quantity);
        }
        return 0; //error you can't reserved the stock
    }

    public int unreservedStock(String item, int quantity) {
        StockItem inStock = map.get(item);
        if ((inStock != null) && (quantity > 0) ) {
            return inStock.unreservedStock(quantity);
        }
        return 0; //error you can't reserved the stock
    }

    public StockItem getStockItem(String itemName) {
        return map.get(itemName);
    }

    public Map<String, StockItem> Items() {

        return Collections.unmodifiableMap(map);
    }

    public Map<String, Double> PriceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for (Map.Entry<String, StockItem> item : map.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    @Override
    public String toString() {
        String s = "\nStock Map \n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : map.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.availableQuantityInStock();
            s = s + stockItem + " There are " + stockItem.availableQuantityInStock()
                    + " in stock. Value of items:";
            s = s + String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;
        }
        return s + "Total cost " + String.format("%.02f", totalCost);
    }
}
