import java.util.ArrayList;
import java.util.List;



public class NumberCollection implements IterableCollection{


    private List<Double> numbers = new ArrayList<>();
    

    public NumberCollection(){}

    public void add(Double num){

        numbers.add(num);
    }

    
    public Iterator createIterator(){

        return new NumberIterator(numbers);
    }
    
}
