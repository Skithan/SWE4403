
import java.util.List;

public class NumberIterator implements Iterator{

    public List<Double> myList;
    public int index = 0;
    public double curMax = -1; 
    public double curMin = -1; 


    public NumberIterator(List<Double> myList){

        this.myList = myList;

    }

    public Double nextEl(){

        if(this.isNotEnd()){

            return myList.get(index++); 
         }
   
         else{
           
           return null; 
         }


    };

    public Double currEl(){

        if(this.isNotEnd()){

            return myList.get(index); 
         }
   
         else{
           
           return null; 
         }
    }

    public void increment(){index++;}

    public boolean isNotEnd(){

        if(index < myList.size()){

            return true; 
        }
        else{

            return false;
        }

    };
    
    public void setMax(double max){

        curMax = max; 
    }

    public Double getMax(){

        return curMax;
    }

    public void setMin(double min){

        curMin = min; 
    }
    public Double getMin(){

        return curMin;
    }
}
