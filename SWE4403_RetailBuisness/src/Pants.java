

public class Pants extends ClothingItem {
        
    protected String pantsSize; 

    //Create Clothing Item 
    public Pants(String name, double price, int sku, String pantsSize){

        super(name,price, sku); 
        this.pantsSize = pantsSize; 
        
    }

    public String getPantsSize(){
        return pantsSize;
    }

    public String getType(){

        return "Pants"; 
    }

}
