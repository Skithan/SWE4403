
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ShoppingCart implements Iterable<Product> {
    private String user;
	private ArrayList<Product> products;
    private ArrayList<ShoppingCartHistory> history = new ArrayList<>();
    private static Map<String, ShoppingCart> instances = new HashMap<String, ShoppingCart>();

    private ShoppingCart(String user) {
        products = new ArrayList<>();
        this.user = user;
    }
    
    public static synchronized ShoppingCart getInstance(String user)
	{
		if(!(instances.containsKey(user)))
		{
			ShoppingCart instance = new ShoppingCart(user);
			instances.put(user, instance);	
		}
		
		return instances.get(user);
	}

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProduct(Product p) {
        ShoppingCartHistory memento = new ShoppingCartHistory(products);
        products.remove(p);
        history.add(memento);
    }
    
    public ArrayList<Product> cartContents()
    {
    	return products;
    }
    
    public double getTotal() {
        double total = 0;
        for(Product p : products) {
            total += p.getPrice();
        }
        return total;
    }


    public void undo() {
        if(!history.isEmpty()) {
            int last = history.size() - 1;
            ShoppingCartHistory prev = history.remove(last);
            products = prev.getProducts();
        }
    }


    public void showCart() {
        StringBuilder sb = new StringBuilder();
        for(Product p : products) {
            sb.append(p.toString());
        }
        sb.append("Total: " + getTotal());
        System.out.println(sb.toString());
    }

    private class ShoppingCartIterator implements Iterator<Product> {
        private Iterator<Product> iterator;

        public ShoppingCartIterator(Iterator<Product> iterator) {
            this.iterator = iterator;
        }

        public boolean hasNext() {
            return iterator.hasNext();
        }

        public Product next() {
            return iterator.next();
        }

        public void remove() {
            iterator.remove();
        }
    }

    public Iterator<Product> iterator() {
        return new ShoppingCartIterator(products.iterator());
    }

    private class ShoppingCartHistory {
        private ArrayList<Product> productsBackup;

        private ShoppingCartHistory(ArrayList<Product> products) {
            this.productsBackup = new ArrayList<>(products);
        }

        private ArrayList<Product> getProducts() {
            return new ArrayList<Product>(productsBackup);
        }
    }

    public String showHistory() {
        StringBuilder sb = new StringBuilder();
        for(ShoppingCartHistory memento : history) {
            sb.append("Removed products: \n");
            for (Product p : memento.getProducts()) {
                sb.append(p.toString()).append("\n");
            }
        }
        return sb.toString();
    }
    
}
