

public class WinterClothesFactory implements ClothesFactory {
    

    public WinterShirt createShirt(String name, double price, int sku, String shirtSize){

        return new WinterShirt( name,  price,  sku,  shirtSize); 

    };


    public WinterPants createPants(String name, double price, int sku, String pantsSize){

        return new WinterPants( name,  price, sku, pantsSize);
    }; 
}
