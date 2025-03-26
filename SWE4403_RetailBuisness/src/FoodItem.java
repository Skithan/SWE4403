public class FoodItem implements Product{

    private String name;
    private double price;
    private int sku; //stock keeping unit number, basically food id
    
    //Create Food Item
    public FoodItem(String name, double price, int sku){
        this.name = name;
        this.price = price;
        this.sku = sku;
    }

    //Helper Methods
    public double getPrice(){
        return price;
    }

    public int getSKU(){
        return sku;
    }

    public String getType(){
        return "Food Item";
    }

    public String getName(){
        return name;
    }
    
    public String toString()
    {
    	return "{" + name + " | sku: " + sku + " | type: " + getType() + " | price: " +
               price + "}\n";
    }
}
