package exc20_Collections3_Sorted_Collection;

public class Main {
        private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("pizza", 0.45,25);
        stockList.addStock(temp);


        temp = new StockItem("cola", 0.77, 4);
        stockList.addStock(temp);
        temp = new StockItem("cocaine", 34.43, 1);
        stockList.addStock(temp);
        temp = new StockItem("melon", 3.50, 2);
        stockList.addStock(temp);
        temp = new StockItem("bread", 2.30, 5);
        stockList.addStock(temp);
        temp = new StockItem("orange", 1.1, 7);
        stockList.addStock(temp);
        temp = new StockItem("fork", 0.52, 56);
        stockList.addStock(temp);
        temp = new StockItem("donate", 12.30, 6 );
        stockList.addStock(temp);
        temp = new StockItem("juice", 0.20, 2);
        stockList.addStock(temp);
        temp = new StockItem("car", 234.52, 1);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

    }
}
