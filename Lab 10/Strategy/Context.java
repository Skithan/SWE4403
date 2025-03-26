public class Context {
    
    private Algorithm algorithm; 

    public Context(Algorithm algorithm){

        this.algorithm = algorithm;

    }


    public void setAlgorithm(Algorithm algorithm){

        this.algorithm = algorithm;
    }

    public void executeAlgorithm(String message){

        algorithm.execute(message);
    }


}
