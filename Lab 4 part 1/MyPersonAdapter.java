public class MyPersonAdapter extends Customer{

    private Person person; 
  
    public MyPersonAdapter(Person person){

        this.person = person; 

    }
     
    
    public String getFirstName() {
        
        String[] names = person.getFullName().split(" ");

        return names[0];

    }

    public String getLastName() {
        
       String[] names = person.getFullName().split(" ");

        return names[names.length - 1]; 

    }
    
    
    public void setFirstName(String firstName) {
              
       
    }

    public void setLastName(String lastName) {      
       

     
    }
    
    
    @Override
    public String toString() {
        
        return "Customer [fullName= " + getLastName() + " " + getFirstName() + "]";
    }

}