public class ClothesRegister extends ProductRegistration{

    //Create Clothing Item 
    public Product createProduct(String name, double price, int sku){
        Product clothes = new ClothingItem(name, price, sku);
        return clothes;
    }

}