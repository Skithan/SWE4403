
import java.util.ArrayList;

public class ShoppingInterface 
{
	private DatabaseProxy database = new DatabaseProxy();
	private ShoppingCart cart;
	
	
	public ShoppingInterface(ShoppingCart cart)
	{
		this.cart = cart;
	}
	
	
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
	
	
	public void add(Product p)
	{
		database.remove(p);
		cart.addProduct(p);
	}
	
	
	public int add(Product p, int count)
	{
		ArrayList<Product> products = database.selectSKU(p.getSKU());
		int available = database.checkCount(p);
		
		if(count < available)
		{
			available = count;
		}
		
		for(int i = 0; i < available; i++)
		{
			cart.addProduct(products.get(i));
			database.remove(products.get(i));
		}
		
		return count - available;
	}
	
	
	public void remove(Product p)
	{
		cart.removeProduct(p);
	}
	
	
	public int remove(Product p, int count)
	{
		ArrayList<Product> contents = cart.cartContents();
		int held = 0;
		
		for(int i = 0; i < contents.size(); i++)
		{
			if(contents.get(i).getSKU() == p.getSKU() && held < count)
			{
				database.add(contents.get(i));
				cart.removeProduct(contents.get(i));
				held++;
				i--;
			}
		}
		
		return count - held;
	}
	
	
	public ArrayList<Product> cartContents()
	{
		return cart.cartContents();
	}
	
	
	public int checkCount(Product p)
	{
		return database.checkCount(p);
	}
	
	
	public void viewCart()
	{
		cart.showCart();
	}
}
