

public class Demo {

    public static void main(String[] args) {
        
        show();
       
    }

    public static void show(){

       ProductCollection myCollection = new ProductCollection();

       Product p1 = new Product(0, "Orange");
       Product p2 = new Product(1, "Apples");
       Product p3 = new Product(2, "Bananas");

       myCollection.add(p1);
       myCollection.add(p2);
       myCollection.add(p3);

       Iterator iterator = myCollection.createIterator();

       while(iterator.isNotEnd())
       {

        System.out.println(iterator.nextEl().toString());

       }
    
    }
    
}
