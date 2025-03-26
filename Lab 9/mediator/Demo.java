public class Demo {
    
    public static void main(String[] args) {
        
        show();
    }

    public static void show(){

        SignUpDialBox box = new SignUpDialBox();

        box.show();

        box.setUsername("Ethan");
        box.setPassword("FGBDRe4y3s");

        box.show();

        box.setCheckBox();

        box.show();

        box.setButton();

        box.show();
    }
}
