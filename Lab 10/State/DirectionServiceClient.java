public class DirectionServiceClient {

    public static void main(String[] args) {
  
        show(); 

  }


  public static void show(){


    Driving driving = new Driving();
    Transit transit = new Transit();
    Walking walking = new Walking();
    Biking biking = new Biking();

    Context context = new Context(driving);

    context.getETA();
    context.getDirectionBetweenPoints("my House", "my Work");

    context.changeTravelState(transit);


    context.getETA();
    context.getDirectionBetweenPoints("my House", "my Work");

    context.changeTravelState(walking);


    context.getETA();
    context.getDirectionBetweenPoints("my House", "my Work");

    context.changeTravelState(biking);

    context.getETA();
    context.getDirectionBetweenPoints("my House", "my Work");

    

  }
    
}