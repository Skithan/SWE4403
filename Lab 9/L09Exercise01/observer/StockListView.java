

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Subscriber {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void show() {

        System.out.println("StockListView:");        
        for (var stock : stocks)
        System.out.println("\n" + stock);
    }

    public void update(Stock stock, float price){
        
        for (var theStock : stocks){

            if(theStock == stock){

                theStock.setPrice(price);
                System.out.println("\nStock List View Updated: " + theStock.getSymbol() + " price to: " + price);
            }
        }
    }
}
