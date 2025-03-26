public class ChatClient {

  public static void main(String[] args) {
  
        show(); 

  }


  public static void show(){


    ConcreteAESAlgorithm aes = new ConcreteAESAlgorithm();
    ConcreteDESAlgorithm des = new ConcreteDESAlgorithm();

    Context context = new Context(aes);

    context.executeAlgorithm("My first message to be encrypted");

    context.setAlgorithm(des); 

    context.executeAlgorithm("My second message to be encrypted");



  }
}