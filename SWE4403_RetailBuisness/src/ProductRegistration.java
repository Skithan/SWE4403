public abstract class ProductRegistration{

    //Abstract method to return Concrete Product
    public abstract Product createProduct(String name, double price, int sku);

    //Display registered item
    public void registerProduct(Product p){
        System.out.println("Registered " + p.getType() + ": " + p.getName());
    }
}