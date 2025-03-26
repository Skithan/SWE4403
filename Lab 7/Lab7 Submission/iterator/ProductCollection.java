import java.util.ArrayList;
import java.util.List;

public class ProductCollection implements IterableCollection{

  
  private List<Product> products = new ArrayList<>();

  
  public ProductCollection(){}

  public void add(Product product) {
    products.add(product);
  }

 
  public Iterator createIterator(){

    return new ProductIterator(products); 
  };
}
