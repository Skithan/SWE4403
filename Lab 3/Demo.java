

public class Demo {
    public static void main(String[] args) {

        
        Logger log1 =  Logger.getInstance("myFile"); 
        Logger log2 =  Logger.getInstance("myFile"); 
        Logger log3 =  Logger.getInstance("FAKEFile"); 

        //Proving that log 1 and 2 are instances of the same l
        System.out.println(log1 == log2); 
        System.out.println(log1 != log3); 

    }
}

