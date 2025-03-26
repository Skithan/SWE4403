

public class WinterShirt extends Shirt {

    private String shirtType = "Winter Shirt";

    public WinterShirt(String name, double price, int sku, String shirtSize){

        super(name,price, sku, shirtSize); 
       
    }

    public String getType(){

        return shirtType; 

    }; 
    
}
