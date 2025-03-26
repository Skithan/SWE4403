public class Demo {

    public static void main(String[] args) {
        
        show();
    }

    public static void show(){

        NumberCollection myCollection = new NumberCollection(); 
        NumberCollection myCollection2 = new NumberCollection(); 

        double d1 = 3.2; 
        double d2 = 4.6; 
        double d3 = 5.7;
        double d4 = 2.3;

        myCollection.add(d1);
        myCollection.add(d2);
        myCollection.add(d3);
        myCollection.add(d4);

        myCollection2.add(d1);
        myCollection2.add(d2);
        myCollection2.add(d3);
        myCollection2.add(d4);

        Iterator iterator = myCollection.createIterator(); 
        Iterator iterator2 = myCollection2.createIterator(); 
        


        System.out.println("Running maximum value of a list \n");
        
        //Printing Max of myCollection
        while(iterator.isNotEnd()){

            if((iterator.currEl() > iterator.getMax()) || iterator.getMax() == -1)
            {

                iterator.setMax(iterator.currEl());
                System.out.println(iterator.currEl());
                iterator.increment();
              
               
            }
            else{

                System.out.println(iterator.getMax());
                iterator.increment();

            }
            
        }


        System.out.println("\n");


        System.out.println("Running minimum value of a list \n");

        
        //Printing minimums of my List
        while(iterator2.isNotEnd()){

            if((iterator2.currEl() < iterator2.getMin()) || iterator2.getMin() == -1) //min is initially -1 when not yet set
            {

                iterator2.setMin(iterator2.currEl());
                System.out.println(iterator2.currEl());
                iterator2.increment();
              
               
            }
            else{

                System.out.println(iterator2.getMin());
                iterator2.increment();

            }
            
        }

    }
    
}
