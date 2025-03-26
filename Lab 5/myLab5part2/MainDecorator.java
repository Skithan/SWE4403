public class MainDecorator extends BaseDecorator {
    
    private boolean isMain;

    public MainDecorator(Artefact arty) {
        super(arty);
     }
 
     public void setIsMain(boolean isMain) {
         this.isMain = isMain;
     }
   
     public String render(){
 
         String mainIcon = isMain ? "[Main]" : "";
 
        return String.format("%s %s", super.render(), mainIcon);
     };

}