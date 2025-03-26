

public interface ClothesFactory {
    
    public Shirt createShirt(String name, double price, int sku, String shirtSize);
    public Pants createPants(String name, double price, int sku, String pantsSize); 
}
