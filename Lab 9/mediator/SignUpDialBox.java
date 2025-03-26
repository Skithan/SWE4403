

public class SignUpDialBox implements Mediator{

    private TextBox username;
    private TextBox password;
    private CheckBox agreeToTerms;
    private Button signUp;


    public SignUpDialBox(){

        this.username = new TextBox();
        this.password = new TextBox();
        this.agreeToTerms = new CheckBox();
        this.signUp = new Button();

        this.username.setMediator(this);
        this.password.setMediator(this);
        this.agreeToTerms.setMediator(this);
        this.signUp.setMediator(this);

    }


    public void show(){

        System.out.println("Username: " + username.getContent());
        System.out.println("Password: " + password.getContent());
        System.out.println("Agree To Terms CheckBox: " + agreeToTerms.isChecked());
        System.out.println("Sign Up Button: " + signUp.isEnabled() + "\n");
    }

    public void notify(UIControl control, String event, String text){

        if(control.getType() == "TextBox" && event == "typed"){

            ((TextBox)control).setContent(text);
        }
       
        if(control.getType() == "CheckBox" && event == "click"){

            agreeToTerms.setChecked(true);              

        }

        if(control.getType() == "Button" && event == "click"){

            if(username.getContent() != "" && password.getContent() != "" && agreeToTerms.isChecked() ){

                signUp.setEnabled(true); 

            }   
        }
    
    }

    public void setUsername(String name){
        
        username.click(name);
    }


    public void setPassword(String name){
        
        password.click(name);
    }


    public void setCheckBox(){

        agreeToTerms.click();
    }

    public void setButton(){

        signUp.click();
    }

    

}
