package exc20_Collections3_Sorted_Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;           //list on a map

    public StockList() {
        this.list = new HashMap<>();
    }

    public int addSock(StockItem item) {
        if (item != null) {
            StockItem inStock = list.getOrDefault(item.getName(), item);
            // check if we already have quantity of this item
            if (inStock != item) {
                //wws already in the map
                item.adjustStock(inStock.quantityInStock());
            }
            list.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.getOrDefault(item, null);
        if ((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0)) {
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem getList(String itemName) {
        return list.get(itemName);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List \n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();
            double itemValue = stockItem.getPrice() + stockItem.quantityInStock();
            s = s + stockItem + " There are " + stockItem.quantityInStock() + " in stock. Value of item:";
            s = s + itemValue + "\n";
            totalCost += itemValue;
        }
        return s;
    }
}
