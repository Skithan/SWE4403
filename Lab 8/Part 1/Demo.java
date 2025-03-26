

public class Demo {
    
    public static void main(String[] args) {
        
        show();
    }

    public static void show(){


        //Making a video editor
        VideoEditor myVidEdited = new VideoEditor("Ethan's Video");

        //initial edits
        System.out.println(myVidEdited.toString());


        //Adding a text
        myVidEdited.executeOperation(new SetTextCommand(myVidEdited, "Text 1"));
        
        System.out.println(myVidEdited.toString());


        //Adding a contrast
        myVidEdited.executeOperation(new SetContrastCommand(myVidEdited, 0.25f));
        
        System.out.println(myVidEdited.toString());



        myVidEdited.executeOperation(new UndoCommand(myVidEdited));
        
        System.out.println(myVidEdited.toString());

        myVidEdited.executeOperation(new UndoCommand(myVidEdited));
        
        System.out.println(myVidEdited.toString());

    }
}
