import java.util.ArrayList;

public class DatabaseManager 
{
	private DatabaseProxy database = new DatabaseProxy();
	
	public ArrayList<Product> search(String word)
	{
		ArrayList<Product> nameList, typeList;
		
		nameList = database.selectName(word);
		typeList = database.selectType(word);
		
		for(int i = 0; i < typeList.size(); i++)
			nameList.add(typeList.get(i));
		
		return nameList;
	}
	
	
	public ArrayList<Product> search(double price)
	{
		return database.selectPrice(price);
	}
	
	
	public ArrayList<Product> search(int sku)
	{
		return database.selectSKU(sku);
	}
	
	
	public int checkCount(Product p)
	{
		return database.checkCount(p);
	}
	
	
	public void add(Product p)
	{
		database.add(p);
	}
	
	
	public void add(Product p, int count)
	{
		for(int i = 0; i < count; i++)
			database.add(p);
	}
	
	
	public void remove(Product p)
	{
		database.remove(p);
	}
	
	
	public int remove(Product p, int count)
	{
		ArrayList<Product> products = database.selectSKU(p.getSKU());
		int available = database.checkCount(p);
		
		if(count < available)
		{
			available = count;
		}
		
		for(int i = 0; i < available; i++)
			database.remove(products.get(i));
		
		return count - available;
	}
	
	
	public void removeAll(Product p)
	{
		ArrayList<Product> inventory = database.selectName("*");
		
		int i = 0;
		
		while(i < inventory.size())
		{
			if(inventory.get(i).getSKU() == p.getSKU())
				database.remove(inventory.get(i));
			else
				i++;
		}
	}
}
