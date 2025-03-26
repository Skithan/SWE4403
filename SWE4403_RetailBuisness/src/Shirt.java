

public class Shirt extends ClothingItem{
      
    public String shirtSize; 
    
    //Create Clothing Item 
    public Shirt(String name, double price, int sku, String shirtSize){

        super(name,price, sku); 
        this.shirtSize = shirtSize; 
        
    }

    public String getShirtSize(){
        return shirtSize;
    }

    public String getType(){

        return "Shirt"; 
    }

}
