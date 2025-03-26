

public class WinterPants extends Pants {
    
    private String pantsType = "Winter Pants";

    public WinterPants(String name, double price, int sku, String pantsSize){

        super(name,price, sku, pantsSize); 
       
    }

    public String getType(){

        return pantsType; 

    }; 
}
