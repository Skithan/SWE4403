

public class SummerClothesFactory implements ClothesFactory{

    public SummerShirt createShirt(String name, double price, int sku, String shirtSize){

        return new SummerShirt(name, price, sku, shirtSize);
    
    };



    public SummerPants createPants(String name, double price, int sku, String pantsSize){

        return new SummerPants(name, price, sku, pantsSize);
    }; 
    
}
