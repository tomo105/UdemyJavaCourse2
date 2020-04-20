package exc20_Collections3_Sorted_Collection;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> map;

    public Basket(String name) {
        this.name = name;
        this.map = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if (item != null && quantity > 0) {
            int inBasket = map.getOrDefault(item, 0);
            map.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(map);
    }

    @Override
    public String toString() {
        String s = "Basket name = " + name + " contains "
                + map.size() + ((map.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : map.entrySet()) {
            s = s + item.getKey().getName() + ": price " + item.getKey().getPrice() +
                    " purchased " + item.getValue() + "\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost: " + totalCost + "\n";
    }
}
