import java.util.ArrayList;

public class Demo 
{
	public static void main(String[] args)
	{
		System.out.println("Admin Demo:");
		admin();
		
		System.out.println("\nClient Demo:");
		client();
	}
	
	
	public static void admin()
	{
		DatabaseManager admin = new DatabaseManager();
		ClothesFactory clothes;
		ProductRegistration products;
		
		clothes = new SummerClothesFactory();
		
		admin.add(clothes.createPants("Pants", 9.99, 1, null));
		admin.add(clothes.createPants("Pants", 9.99, 1, null), 2);
		admin.add(clothes.createShirt("Shirt", 4.99, 2, null));
		admin.add(clothes.createShirt("Shirt", 4.99, 2, null), 2);
		
		clothes = new WinterClothesFactory();
		
		admin.add(clothes.createPants("Pants", 19.99, 3, null));
		admin.add(clothes.createPants("Pants", 19.99, 3, null), 2);
		admin.add(clothes.createShirt("Shirt", 14.99, 4, null));
		admin.add(clothes.createShirt("Shirt", 14.99, 4, null), 5);
		
		products = new FoodRegister();
		
		admin.add(products.createProduct("Banana", 0.99, 5));
		
		products = new ClothesRegister();
		
		admin.add(products.createProduct("Scarf", 4.99, 6));
		
		System.out.println(admin.search("*") + "\n");
		System.out.println(admin.search("Shirt") + "\n");
		System.out.println(admin.search(4.99) + "\n");
		System.out.println(admin.search(4) + "\n");
		
		ArrayList<Product> search =  admin.search(4);
		
		admin.remove(search.get(0));
		admin.remove(search.get(0), 2);
		
		System.out.println(admin.search(4) + "\n");
		
		admin.removeAll(search.get(0));
		
		System.out.print(admin.search(4) + "\n");
		
		admin.add(clothes.createShirt("Shirt", 14.99, 4, null), 3);
	}
	
	
	public static void client()
	{
		String user = "testClient";
		
		ShoppingInterface client = new ShoppingInterface(ShoppingCart.getInstance(user));
		
		ArrayList<Product> search =  client.search(1);
		
		client.add(search.get(0));
		
		search =  client.search(2);
		
		client.add(search.get(0));
		
		search = client.search(4);
		
		int missing = client.add(search.get(0), 4);
		
		System.out.println((missing == 1) + "\n");
		
		client.viewCart();
		
		ArrayList<Product> contents =  client.cartContents();
		
		client.remove(contents.get(0));
		missing = client.remove(contents.get(1), 4);
		
		System.out.println("\n" + (missing == 1) + "\n");
		
		client.viewCart();
		
		client = new ShoppingInterface(ShoppingCart.getInstance(user));
		
		System.out.println();
		client.viewCart();
	}
}
