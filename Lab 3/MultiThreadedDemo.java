
public class MultiThreadedDemo {
    public static void main(String[] args) {

        
        Thread t1 = new Thread(new RunnableProcess("Bankaccount", "withdraw"));
        Thread t2 = new Thread(new RunnableProcess("Bankaccount", "deposit"));
        
        t1.start();
        t2.start(); 
                
    }
}
