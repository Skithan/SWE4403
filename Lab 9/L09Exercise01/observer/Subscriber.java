public interface Subscriber {
  
    public void update(Stock stock, float price);
    public void show();
    public void addStock(Stock s);
}
