public class ConcreteAESAlgorithm implements Algorithm {
    
    public void execute(String message){

        System.out.println("Encrypting the message: " + message + ", using AES");        
    }

}
