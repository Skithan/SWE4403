import java.util.Random;
public class RunnableProcess implements Runnable {
    private String name, messageType;
    private int time;
    private Random rand = new Random();

    public RunnableProcess(String name, String messageType) {
        this.name = name;
        this.messageType = messageType; 
        this.time = rand.nextInt(999);
    }

    public void run() {
        try {

            Logger log = Logger.getInstance(name); 
            Thread.sleep(this.time);
            log.write(messageType);

            
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}