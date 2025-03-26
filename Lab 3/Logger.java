import java.util.*;


public class Logger {

   private static String fileName;
   private static HashMap<String,Logger> myMap = new HashMap<String,Logger>();

   private Logger(String fileName) {

          this.fileName = fileName;

   }

   public static synchronized Logger getInstance(String fileName){
      
      //Lazy Instantiation 
      Logger logInstance = null;

      for(String i: myMap.keySet())
      {
         if(fileName == i)
         {
            logInstance = myMap.get(i);
         }
      }

      if(logInstance == null)
      {
         logInstance = new Logger(fileName);          
         myMap.put(fileName, logInstance);
      }
  
      return logInstance; 
   }

   public void write(String message) {
 
      System.out.println("Writing this " + message + " to the " + fileName);
   }

  }
  
