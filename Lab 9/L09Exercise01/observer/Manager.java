
import java.util.ArrayList;
import java.util.List;

public class Manager implements Publisher{
    
    private List<Subscriber> subscribers = new ArrayList<>();


    public void addSub(Subscriber s){

        this.subscribers.add(s);

    }
    public void removeSub(Subscriber s){

        this.subscribers.remove(s);
    }

    public void setStockPrice(Stock stock, float price){

        System.out.println("\n");        

        for(Subscriber sub: this.subscribers){

            sub.update(stock, price);
        }

    }

    public void showSubs(){

        for(Subscriber sub: this.subscribers){

            System.out.println("\n");
            sub.show();
        }
    }

    public void addStock(Stock s){

        for(Subscriber sub: this.subscribers){

            sub.addStock(s);
        }
    }


}
