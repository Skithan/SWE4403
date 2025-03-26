# Design Pattern Uses
### Abstract Factory Pattern
The abstract factory pattern is used one time in this project. This pattern was used to create multiple different clothingItem objects in an extendible way. This was 
done by first creating a Shirt and Pants class by extending the clothingItem class that was created with the Factory Pattern. The Shirt and Pants class act as the "products" 
in the abstract factory pattern. Next, the SummerPants, SummerShirt, WinterPants, and WinterShirt classes were designed, these are meant to act as the concrete products because they are implementations of the Shirt and Pants products. Then a ClothesFactory class was designed to be the abstract factory interface that declares the creation methods for the following concrete factories. The concrete factories are the SummerClothesFactory and the WinterClothesFactory, they both implement the ClothesFactory interface and its creation methods. Using this pattern we were able to build many different versions of Products but more specifically ClothingItems. 


### Singleton Pattern
The singleton pattern is used in two different places in different ways throughout the code; once in the InventoryDatabase class, and once in the ShoppingCart class. 
For the InventoryDatabase class, the singleton pattern is used in a way that allows it to be protected from multiple sources trying to access the database at the same 
time. This allows for only one instance of the database to be present at any time, which is exactly what is needed for the inventory of a retail business. For the 
ShoppingCart class, the singleton pattern is also protected against multi-threading, but in this case, only one cart is available for each user. This means that each 
user has their own cart, but will only ever have one cart at a time.
### Factory Pattern
### Proxy Pattern
The proxy pattern is used with the Database, InventoryDatabase, and DatabaseProxy classes in order to provide a proxy to the InventoryDatabase. The DatabaseProxy class 
acts as the proxy to the real database, the InventoryDatabase. By having this proxy, we can ensure that the database is fully unable to be accessed without going 
through the proxy. This allows us to protect the database from having any direct access to it, while also providing a way to establish a database connection only when 
it is necessary to connect to it.
### Facade Pattern
The facade pattern is used in two different places throughout the code for two types of scenarios. The first scenario is in the event that an admin is updating the 
database, which is implemented through the DatabaseManger class. In this way, the facade provides a simple interface of common methods that would be needed to do these 
updates, while hiding any more complicated method calls or logic needed to properly execute the action and update the database. These actions include adding or removing 
multiple of the same product. The other scenario is a customer shopping and items to their cart, which is implemented with the ShoppingInterface class. This 
implementation of the facade pattern is very similar to the other, but instead updates the cart and database as items are added and removed from the cart. With this, 
more of the complex operations between the database and cart can also be hidden from the client, giving them only the easily implemented methods of the class. With 
both classes together, they also help provide a bit of access control, since they only allow very specific actions for each type of user to take. An example of this 
is how the DatabaseManager is able to add and remove from the database, while the ShoppingInterface cannot, which is important to have in place. 
### Iterator Pattern
The iterator pattern is used for our shopping cart implementation. This class is used to store 
a list of products as well as supporting operations such as adding and removing products.
It also serves for calculating the total cost of the products within the cart by iterating through
the products in the list (cart). This class uses the already pre-built java iterable interface from
the java util library. The shopping cart is very flexible and can store any new products we wish to
add to it in the future.

### Memento Pattern
The shopping cart also implements the memento pattern for undo functionality. When a product is
removed from the products ArrayList (shopping cart), a new instance of ShoppingCartHistory is created
which is a copy of the current shopping cart before removing. The undo method is used to provide
history functionality which undoes the last removal operation performed on the shopping cart.
