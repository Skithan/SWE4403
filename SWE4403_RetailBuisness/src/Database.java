
import java.util.ArrayList;

public interface Database 
{
	public void add(Product p);
	public void remove(Product p);
	public ArrayList<Product> selectName(String name);
	public ArrayList<Product> selectPrice(double price);
	public ArrayList<Product> selectSKU(int sku);
	public ArrayList<Product> selectType(String type);
	public int checkCount(Product p);
}

