public class ClothingItem implements Product{
    
    public String name;
    public double price;
    public int sku;
    
    //Create Clothing Item 
    public ClothingItem(String name, double price, int sku){
        this.name = name;
        this.price = price;
        this.sku = sku;
    }

    //Helper Method
    public double getPrice(){
        return price;
    }

    public int getSKU(){
        return sku;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return "Clothing Item";
    }
    
    
    public String toString()
    {
    	return "{" + name + " | sku: " + sku + " | type: " + getType() + " | price: " +
               price + "}\n";
    }
}
