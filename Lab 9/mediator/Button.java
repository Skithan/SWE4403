

public class Button implements UIControl {

    private Mediator mediator;
    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public String getType(){

        return "Button";
    }

    
    public void setMediator(Mediator med){

        mediator = med; 
    }

        
    public void click(){

        mediator.notify(this, "click", "");
    }
}
