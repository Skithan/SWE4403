

public class CheckBox implements UIControl {

    private Mediator mediator;
    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public String getType(){

        return "CheckBox";
    }

    
    public void setMediator(Mediator med){

        mediator = med; 
    }

   
    public void click(){

        mediator.notify(this, "click", "");
    }

  

}
