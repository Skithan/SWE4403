public class Driving implements TravelState{

    public void getETA(){

        System.out.println("Calculating ETA (Driving)");
   
    }

    public void getDirectionBetweenPoints(String pointA, String pointB){

        System.out.println("Calculating direction between " + pointA + " and " + pointB + " \n");
    }

    
}