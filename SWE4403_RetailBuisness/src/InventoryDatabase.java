
import java.util.ArrayList;

public class InventoryDatabase implements Database
{
	private ArrayList<Product> inventory;
	private static InventoryDatabase database;
	
	private InventoryDatabase()
	{
		inventory = new ArrayList<Product>();
	}
	
	
	public static synchronized InventoryDatabase getInstance()
	{
		if(database == null)
			database = new InventoryDatabase();
		
		return database;
	}
	
	
	public void add(Product p)
	{
		inventory.add(p);
	}
	
	
	public void remove(Product p)
	{
		int index = inventory.indexOf(p);
		
		if(index >= 0)
			inventory.remove(index);
	}
	
	
	// * is a special keyword to select the entire database, like in SQL
	public ArrayList<Product> selectName(String name)
	{
		ArrayList<Product> products = new ArrayList<Product>();
		
		if(name == "*")
			products = inventory;
		else
		{
			for(int i = 0; i < inventory.size(); i++)
			{
				Product temp = inventory.get(i);
				
				if(temp.getName().contains(name))
					products.add(temp);
			}
		}
		
		return products;
	}
	
	
	public ArrayList<Product> selectPrice(double price)
	{
		ArrayList<Product> products = new ArrayList<Product>();
		
		for(int i = 0; i < inventory.size(); i++)
		{
			Product temp = inventory.get(i);
			
			if(temp.getPrice() == price)
				products.add(temp);
		}
		
		return products;
	}
	
	
	public ArrayList<Product> selectSKU(int sku)
	{
		ArrayList<Product> products = new ArrayList<Product>();
		
		for(int i = 0; i < inventory.size(); i++)
		{
			Product temp = inventory.get(i);
			
			if(temp.getSKU() == sku)
				products.add(temp);
		}
		
		return products;
	}
	
	
	public ArrayList<Product> selectType(String type)
	{
		ArrayList<Product> products = new ArrayList<Product>();
		
		if(type != "*")
		{
			for(int i = 0; i < inventory.size(); i++)
			{
				Product temp = inventory.get(i);
				
				if(temp.getType() == type)
					products.add(temp);
			}
		}
		
		return products;
	}
	
	
	public int checkCount(Product p)
	{
		ArrayList<Product> products = selectSKU(p.getSKU());
		
		return products.size();
	}

}
