import java.util.ArrayList;

public class DatabaseProxy implements Database
{
	private InventoryDatabase database;
	
	public DatabaseProxy()
	{
		database = InventoryDatabase.getInstance();
	}


	public void add(Product p) 
	{
		database.add(p);	
	}


	public void remove(Product p) 
	{
		database.remove(p);	
	}


	public ArrayList<Product> selectName(String name) 
	{
		return database.selectName(name);
	}


	public ArrayList<Product> selectPrice(double price) 
	{
		return database.selectPrice(price);
	}


	public ArrayList<Product> selectSKU(int sku) 
	{
		return database.selectSKU(sku);
	}


	public ArrayList<Product> selectType(String type) 
	{
		return database.selectType(type);
	}
	
	
	public int checkCount(Product p)
	{
		return database.checkCount(p);
	}
}
