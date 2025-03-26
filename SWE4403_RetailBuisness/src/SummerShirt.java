
public class SummerShirt extends Shirt{

    public static String shirtType = "Summer Shirt";

    public SummerShirt(String name, double price, int sku, String shirtSize){

        super(name,price, sku, shirtSize); 
       
    }

    public String getType(){

        return shirtType; 
    }
    
}
