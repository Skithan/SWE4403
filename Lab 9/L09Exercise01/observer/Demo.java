public class Demo {
    
    public static void main(String[] args) {
        
        show();
    }

    public static void show(){

        Stock apple = new Stock("Apple", 189.7f);
        Stock spotify = new Stock("Spotify", 43.76f);

        StatusBar statusBar = new StatusBar();
        StockListView slv = new StockListView();

        
        Editor editor = new Editor(); 

        editor.man.addSub(slv);
        editor.man.addSub(statusBar);

        editor.man.addStock(spotify);        
        editor.man.addStock(apple);

        editor.man.showSubs();

        editor.man.setStockPrice(spotify,100.0f);
        editor.man.setStockPrice(apple,111.0f);

        editor.man.showSubs();
    }
}
