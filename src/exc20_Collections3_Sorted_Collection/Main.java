package exc20_Collections3_Sorted_Collection;

import java.util.Map;

public class Main {
        private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("pizza", 0.45,25);
        stockList.addStock(temp);


        temp = new StockItem("cola", 0.77, 4);
        stockList.addStock(temp);
        temp = new StockItem("cocaine", 34.43, 3);
        stockList.addStock(temp);
        temp = new StockItem("melon", 3.50, 2);
        stockList.addStock(temp);
        temp = new StockItem("cupp", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup",0.45,207);
        stockList.addStock(temp);

        temp = new StockItem("orange", 1.1, 7);
        stockList.addStock(temp);
        temp = new StockItem("fork", 0.52, 56);
        stockList.addStock(temp);
        temp = new StockItem("donate", 12.30, 6 );
        stockList.addStock(temp);
        temp = new StockItem("juice", 0.20, 2);
        stockList.addStock(temp);
        temp = new StockItem("car", 13.52, 2);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket tomBasket = new Basket("Tom");

        sellItem(tomBasket,"car",1);
        System.out.println(tomBasket);

        sellItem(tomBasket,"car",1);
        if (  sellItem(tomBasket,"car",1) != 1) {
            System.out.println("there are no more car in stock ;/ ");
        }
        sellItem(tomBasket,"wrong name",1);
        System.out.println(tomBasket);

        sellItem(tomBasket,"fork",3);
        sellItem(tomBasket,"orange",4);
        sellItem(tomBasket,"cocaine", 1);

        System.out.println(tomBasket);
        System.out.println(stockList);


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
        stockList.Items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);

        System.out.println("Prices:");
        for(Map.Entry<String,Double> price : stockList.PriceList().entrySet()) {
            System.out.println(price.getKey()  + " costs " + price.getValue() );
        }
    }

    public  static int sellItem(Basket basket, String item, int quantity) {
        //retrieve the item from the stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.sellStock(item,quantity) != 0) {
            basket.addToBasket(stockItem,quantity);
            return quantity;
        }
        return 0;
    }
}
