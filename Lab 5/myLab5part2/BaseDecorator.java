public class BaseDecorator implements Artefact {
    
    private Artefact wrappee;

    public BaseDecorator(Artefact arty){

        this.wrappee = arty; 
    }

    public String render(){

        return wrappee.render();
    }
}
