public class Client{


    public static void main(String[] args) {
         


        // make a list of persons, adapt that list to a list of customers

        Person p1 = new Person("Stevie Wonder"); 
        Person p2 = new Person("Angelina Jolie"); 
        Person p3 = new Person("Brad Pitt"); 
        Person p4 = new Person("Dwayne THE ROCK Johnson"); 
        Person p5 = new Person("Ethan Taylor Alward"); 

        Person[] myPList = {p1, p2, p3, p4, p5};
        Customer[] myCList = new Customer[5];


        System.out.println("Printing Persons");
        printPersons(myPList);  
        System.out.println();
        


        //Adapting my list of persons to list of customers
        for(int i = 0; i < myPList.length; i++)
        {
             myCList[i] = new MyPersonAdapter(myPList[i]); 
        }



        System.out.println("Printing Customers");

        for(int i = 0; i < myCList.length; i++)
        {
           System.out.println(myCList[i].toString()); 

        }

   
    }

    public static void printPersons(Person[] myList){


        for(int i = 0; i < myList.length; i++)
        {
            System.out.println(myList[i].toString());
        }

        System.out.println();
    } 


}



