
import java.util.List;

public class ProductIterator implements Iterator {

    public int index = 0;
    public List<Product> myList; 


    public ProductIterator(List<Product> myList){

        this.myList = myList; 
    }

    
    public Product nextEl(){    

      if(this.isNotEnd()){

         return myList.get(index++); 
      }

      else{
        
        return null; 
      }
      
    };

     
    public boolean isNotEnd(){

        if(index < myList.size()){

            return true; 
        }
        else{

            return false;
        }

    };
}
