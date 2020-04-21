package exc20_Collections3_Sorted_Collection;

import java.util.Map;

public class MainChallenge {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        System.out.println(solution(1023, 1));
        System.out.println('0');
//        StockItem temp = new StockItem("pizza", 0.45, 25);
//        stockList.addStock(temp);
//
//
//        temp = new StockItem("cola", 0.77, 4);
//        stockList.addStock(temp);
//        temp = new StockItem("cocaine", 34.43, 3);
//        stockList.addStock(temp);
//        temp = new StockItem("melon", 3.50, 2);
//        stockList.addStock(temp);
//        temp = new StockItem("cup", 0.50, 200);
//        stockList.addStock(temp);
//        temp = new StockItem("cup", 0.45, 207);
//        stockList.addStock(temp);
//
//        temp = new StockItem("orange", 1.1, 77);
//        stockList.addStock(temp);
//        temp = new StockItem("fork", 0.52, 56);
//        stockList.addStock(temp);
//        temp = new StockItem("donate", 12.30, 6);
//        stockList.addStock(temp);
//        temp = new StockItem("juice", 0.20, 2);
//        stockList.addStock(temp);
//        temp = new StockItem("car", 13.52, 2);
//        stockList.addStock(temp);

        System.out.println(stockList);

//        for (String s : stockList.Items().keySet()) {
//            System.out.println(s);
//        }

        Basket tomBasket = new Basket("Tom");

        sellItem(tomBasket, "car", 1);
        System.out.println(tomBasket);

        sellItem(tomBasket, "car", 1);
        System.out.println(tomBasket);

        if (sellItem(tomBasket, "car", 1) != 1) {
            System.out.println("there are no more car in stock ;/ ");
        }
        sellItem(tomBasket, "kiwi", 1);
        //System.out.println(tomBasket);

        sellItem(tomBasket, "fork", 3);
        sellItem(tomBasket, "orange", 4);
        sellItem(tomBasket, "cocaine", 1);
        System.out.println(tomBasket);

        //  System.out.println(stockList);
        Basket basket = new Basket("Customer");
        sellItem(basket, "fork", 3);
        sellItem(basket, "orange", 23);
        sellItem(basket, "car", 1);
        System.out.println(basket);

        removeItem(tomBasket, "car", 1);
        removeItem(tomBasket, "fork", 3);
        removeItem(tomBasket, "car", 1);

        System.out.println("remove car  which is not available" + removeItem(tomBasket, "car", 1));

        System.out.println(tomBasket);
        removeItem(tomBasket, "orange", 4);
        removeItem(tomBasket, "fork", 3);
        removeItem(tomBasket, "cocaine", 1);
        System.out.println(tomBasket);
        // temp = new StockItem("pen", 1.12);
        // stockList.Items().put(temp.getName(),temp);
        ///gives us an error because Items return
        /// unmodified map !!!!
        /// so we can not add any items to the basket
        /// other then using a method sellItem  !!!!
        //the map object is not modified but the items in
        // this map can be modify !!!
        //you can't add or remove any thing from map
        // but you can change individual item
        StockItem car = stockList.Items().get("car");
        if (car != null) {
            stockList.Items().get("car").adjustStock(2000);
           // stockList.getStockItem("car").adjustStock(-1000);
            //two do the same

        }
        System.out.println(stockList);
        checkOut(basket);

        System.out.println(basket);
        System.out.println(stockList);
        //  System.out.println("Prices:");
        //for (Map.Entry<String, Double> price : stockList.PriceList().entrySet()) {
        //    System.out.println(price.getKey() + " costs " + price.getValue());
        // }

    }

    public static int removeItem(Basket basket, String item, int quantity) {
        //retrieve the item from the stock list
        StockItem stockItem = stockList.getStockItem(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreservedStock(item, quantity);
        }
        return 0;
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        //retrieve the item from the stock list
        StockItem stockItem = stockList.getStockItem(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reservedStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
    }


    public static int solution(int A, int B) {
        String s = Integer.toBinaryString(A * B);
        System.out.println(s);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 49) {
                count++;
            }
        }
        return count;
    }
}
