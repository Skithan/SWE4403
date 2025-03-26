
public class SummerPants extends Pants{

    private String pantsType = "Summer Pants";

    public SummerPants(String name, double price, int sku, String pantsSize){

        super(name,price, sku, pantsSize); 
       
    }

    public String getType(){

        return pantsType; 

    }; 


    
}
