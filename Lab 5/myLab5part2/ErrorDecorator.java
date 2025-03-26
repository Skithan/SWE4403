
public class ErrorDecorator extends BaseDecorator {
    
    private boolean hasError;

    public ErrorDecorator(Artefact arty) {
       super(arty);
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }
  
    public String render(){

        String errorIcon = hasError ? "[Error]" : "";

       return String.format("%s %s", super.render(), errorIcon);
    };

}
