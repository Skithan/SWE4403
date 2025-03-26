public class FoodRegister extends ProductRegistration{
    
    //Create Food Item 
    public Product createProduct(String name, double price, int sku){
        Product food = new FoodItem(name, price, sku);
        return food;
    }

}