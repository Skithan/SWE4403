

public class TextBox implements UIControl {

    private Mediator mediator;
    private String content = "";

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType(){

        return "TextBox";
    }

    public void setMediator(Mediator med){

        mediator = med; 
    }

   

    public void click(){ }

    public void click(String text){

        mediator.notify(this, "typed", text);
    }



}
