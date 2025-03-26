public class Context {

    private TravelState typeOfTravel;

    public Context(TravelState typeOfTravel){

        this.typeOfTravel = typeOfTravel;

    }
    

    public void changeTravelState(TravelState typeOfTravel){

        this.typeOfTravel = typeOfTravel;

    }


    public void getETA(){

        typeOfTravel.getETA();
    }

    public void getDirectionBetweenPoints(String pointA, String pointB){

        typeOfTravel.getDirectionBetweenPoints(pointA, pointB);
        
    }


}
