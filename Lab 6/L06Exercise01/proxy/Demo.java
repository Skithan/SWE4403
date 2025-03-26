

public class Demo {
  public static void main(String[] args) {
    show();
  }
  public static void show() {
    var dbContext = new DbContext();

    // We read an object (eg a product) from a database.
    Product product = dbContext.getProduct(1);

    ProductProxy myProduct = new ProductProxy(product.getId(),dbContext);

    // We modify the properties of the object in memory.
    myProduct.setName("Updated Name");

    // DbContext should keep track of changed objects in memory.
    // When we call saveChanges(), it'll automatically generate
    // the right SQL statements to update our database.
    dbContext.saveChanges();

    // After saving the changes to the database, we can
    // change our in-memory object again and save the changes.
    myProduct.setName("Another name");
    dbContext.saveChanges();
  }
}
